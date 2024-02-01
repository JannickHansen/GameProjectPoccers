import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class MoveChecks {
    MoveChecks() {
    }
    public int checkSpecialMoveEffect(String usedMove) {
        int effectType = 0;
        effectType = switch (usedMove) {
            case "Absorb", "Mega Drain", "Giga Drain" -> 1;
            case "Wrap", "Fire Spin" -> 2;
            case "Leech Seed" -> 3;
            case "Flail" -> 4;
            case "Super Fang" -> 5;
            case "Milk Drink", "Recover" -> 6;
            case "Brine" -> 7;
            default -> 0;
        };
        return effectType;
    }
    void performMoveEffect(String usedMove, GeneratedPokemon moveUser, GeneratedPokemon moveTarget, int damageDone) {
        int checkResult = checkSpecialMoveEffect(usedMove);
        switch (checkResult) {
            case 1:
                moveUser.remainingHp = moveUser.remainingHp + (damageDone/2);
                if (moveUser.remainingHp > moveUser.hp) { moveUser.remainingHp = moveUser.hp;}
                System.out.println(moveUser.pokemonName + " has absorbed "+(damageDone/2)+" health!");
                break;
            case 2:
                if (moveTarget.repeatedMove < 0) {
                    System.out.println("The attack failed!");
                    break;
                }
                else {
                    moveTarget.repeatedMove = ThreadLocalRandom.current().nextInt(2, 5 + 1);
                    moveTarget.repeatingMove = usedMove;
                    break;
                }
            case 3:
                if (moveTarget.leechSeed) {
                    System.out.println("The attack failed!");
                } else {
                    moveTarget.leechSeed = true;
                    break;
                }
            case 6:
                if (moveUser.remainingHp + (moveUser.hp / 2) > moveUser.hp) {
                    System.out.println(moveUser.pokemonName + " recovered " + (moveUser.hp - moveUser.remainingHp) + " health!" );
                    moveUser.remainingHp = moveUser.hp;
                }
                else {
                    moveUser.remainingHp = moveUser.remainingHp + (moveUser.hp / 2);
                    System.out.println(moveUser.pokemonName + " recovered " + (moveUser.remainingHp + (moveUser.hp / 2)) + " health!");
                }
                break;
            default:
                break;
        }

    }
    public int calcNewBasePower(String usedMove, int basePower, GeneratedPokemon moveUser) {
        int checkResult = checkSpecialMoveEffect(usedMove);
        switch (checkResult) {
            case 4:
            if (moveUser.remainingHp < moveUser.hp * 0.04) {
                basePower = 200;
            } else if (moveUser.remainingHp < moveUser.hp * 0.11) {
                basePower = 150;
            } else if (moveUser.remainingHp < moveUser.hp * 0.35) {
                basePower = 80;
            } else if (moveUser.remainingHp < moveUser.hp * 0.67) {
                basePower = 40;
            } else basePower = 20;
            break;
            default:
                break;
        }
        return basePower;
    }

    public double calcNewDamageDone (String usedMove, GeneratedPokemon moveUser, GeneratedPokemon moveTarget, double resultDamage) {
        int checkResult = checkSpecialMoveEffect(usedMove);
        switch (checkResult) {
            case 5:
                if (moveTarget.pokemonType1.equals("Ghost") || moveTarget.pokemonType2.equals("Ghost")) {
                    resultDamage = 0;
                }
                else {
                    resultDamage = (double) moveTarget.remainingHp / 2;
                }
                break;
            case 7:
                if (moveTarget.remainingHp < moveTarget.hp / 2) {
                    resultDamage = resultDamage * 2;
                }
                break;
        }
        return resultDamage;
    }
    void endOfTurnEffects(GeneratedPokemon affectedPokemon, GeneratedPokemon opposingPokemon, int damageDone) {
        if (affectedPokemon.repeatedMove >= 1) {
            int fireSpinDamage = (affectedPokemon.hp/16);
            if (fireSpinDamage < 1) fireSpinDamage = 1;
            System.out.println(affectedPokemon.repeatingMove+ " chips off some health!");
            affectedPokemon.remainingHp = affectedPokemon.remainingHp - fireSpinDamage;
        }
        if (affectedPokemon.leechSeed) {
            int leechSeedDamage = (affectedPokemon.hp/8);
            if (leechSeedDamage < 1) leechSeedDamage = 1;
            System.out.println("Leech seeds chips off some health!");
            affectedPokemon.remainingHp = affectedPokemon.remainingHp - leechSeedDamage;
            System.out.println(opposingPokemon.pokemonName + " has absorbed " + (leechSeedDamage) + " health!");
            opposingPokemon.remainingHp = opposingPokemon.remainingHp + (leechSeedDamage);
            if (opposingPokemon.remainingHp > opposingPokemon.hp) { opposingPokemon.remainingHp = opposingPokemon.hp;}
        }
        decreaseEffectCounter(opposingPokemon);
    }
    void decreaseEffectCounter(GeneratedPokemon moveTarget) {
        if (moveTarget.repeatedMove > 1) {moveTarget.repeatedMove--;}
        else if (moveTarget.repeatedMove == 1) {
            moveTarget.repeatedMove--;
            System.out.println(moveTarget.repeatingMove+" has fallen off!");
        }
    }
    public int priorityCheck(boolean playerMove, boolean opponentMove) {
        if (playerMove && !opponentMove) {
            return 1;
        }
        else if (!playerMove && opponentMove) {
            return 2;
        }
        else return 0;
    }
    public double checkEffective(String moveType, String targetType) {
        double effectiveness = 0;
        switch (moveType) {
            case "Normal":
                effectiveness = switch (targetType) {
                    case "Rock", "Steel" -> 0.5;
                    case "Ghost" -> 0;
                    default -> 1;
                };
                break;
            case "Fire":
                effectiveness = switch (targetType) {
                    case "Grass", "Ice", "Bug", "Steel" -> 2;
                    case "Fire", "Water", "Rock", "Dragon" -> 0.5;
                    default -> 1;
                };
                break;
            case "Water":
                effectiveness = switch (targetType) {
                    case "Fire", "Ground", "Rock" -> 2;
                    case "Water", "Grass", "Dragon" -> 0.5;
                    default -> 1;
                };
                break;
            case "Grass":
                effectiveness = switch (targetType) {
                    case "Water", "Ground", "Rock" -> 2;
                    case "Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Electric":
                effectiveness = switch (targetType) {
                    case "Water", "Flying" -> 2;
                    case "Grass", "Electric", "Dragon" -> 0.5;
                    default -> 1;
                };
                break;
            case "Ice":
                effectiveness = switch (targetType) {
                    case "Grass", "Ground", "Flying", "Dragon" -> 2;
                    case "Fire", "Water", "Ice", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Fighting":
                effectiveness = switch (targetType) {
                    case "Normal", "Ice", "Rock", "Dark", "Steel" -> 2;
                    case "Poison", "Flying", "Psychic", "Bug", "Fairy" -> 0.5;
                    case "Ghost" -> 0;
                    default -> 1;
                };
                break;
            case "Poison":
                effectiveness = switch (targetType) {
                    case "Grass", "Fairy" -> 2;
                    case "Poison", "Ground", "Rock", "Ghost" -> 0.5;
                    case "Steel" -> 0;
                    default -> 1;
                };
                break;
            case "Ground":
                effectiveness = switch (targetType) {
                    case "Ground", "Electric", "Poison", "Rock", "Steel" -> 2;
                    case "Grass", "Bug" -> 0.5;
                    case "Flying" -> 0;
                    default -> 1;
                };
                break;
            case "Flying":
                effectiveness = switch (targetType) {
                    case "Grass", "Fighting", "Bug" -> 2;
                    case "Electric", "Rock", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Psychic":
                effectiveness = switch (targetType) {
                    case "Fighting", "Poison" -> 2;
                    case "Psychic", "Steel" -> 0.5;
                    case "Dark" -> 0;
                    default -> 1;
                };
                break;
            case "Bug":
                effectiveness = switch (targetType) {
                    case "Grass", "Psychic", "Dark" -> 2;
                    case "Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel", "Fairy" -> 0.5;
                    default -> 1;
                };
                break;
            case "Rock":
                effectiveness = switch (targetType) {
                    case "Fire", "Ice", "Flying", "Bug" -> 2;
                    case "Fighting", "Ground", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Ghost":
                effectiveness = switch (targetType) {
                    case "Psychic", "Ghost" -> 2;
                    case "Dark" -> 0.5;
                    case "Normal" -> 0;
                    default -> 1;
                };
                break;
            case "Dragon":
                effectiveness = switch (targetType) {
                    case "Dragon" -> 2;
                    case "Steel" -> 0.5;
                    case "Fairy" -> 0;
                    default -> 1;
                };
                break;
            case "Dark":
                effectiveness = switch (targetType) {
                    case "Psychic", "Ghost" -> 2;
                    case "Fighting", "Dark", "Fairy" -> 0.5;
                    default -> 1;
                };
                break;
            case "Steel":
                effectiveness = switch (targetType) {
                    case "Ice", "Rock", "Fairy" -> 2;
                    case "Fire", "Water", "Electric", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Fairy":
                effectiveness = switch (targetType) {
                    case "Fighting", "Dragon", "Dark" -> 2;
                    case "Fire", "Poison", "Steel" -> 0.5;
                    default -> 1;
                };
                break;
            case "Null":
                effectiveness = 1;
        }
        return effectiveness;
    }
}
