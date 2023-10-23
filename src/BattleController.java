import java.io.IOException;
import java.util.Scanner;

public class BattleController {
    MoveChecks checkMove = new MoveChecks();
    PokemonLearnSet getMoves = new PokemonLearnSet();
    int playerBasePower;
    int opponentBasePower;
    GeneratedPokemon activePlayerPokemon;
    GeneratedPokemon activeOpponentPokemon;
    GeneratedPokemon playerPokemon1;
    GeneratedPokemon playerPokemon2;
    GeneratedPokemon playerPokemon3;
    GeneratedPokemon playerPokemon4;
    GeneratedPokemon playerPokemon5;
    GeneratedPokemon playerPokemon6;
    GeneratedPokemon opponentPokemon1;
    GeneratedPokemon opponentPokemon2;
    GeneratedPokemon opponentPokemon3;
    GeneratedPokemon opponentPokemon4;
    GeneratedPokemon opponentPokemon5;
    GeneratedPokemon opponentPokemon6;
    Scanner tastatur = new Scanner(System.in);
    String playerUseMove;
    int idealMove;
    String saveMoveName ="";
    String playerMoveType;
    String opponentMoveType;
    int playerDamage;
    boolean priorityCheckPlayer;
    boolean priorityCheckOpponent;
    boolean priorityCheck = true;
    boolean foundWinner = false;
    String op1;
    boolean op2 = false;
    BattleController(GeneratedPokemon uniqueStarter, GeneratedPokemon playerPokemon2, GeneratedPokemon playerPokemon3, GeneratedPokemon playerPokemon4, GeneratedPokemon playerPokemon5, GeneratedPokemon playerPokemon6, GeneratedPokemon opponentPokemon1, GeneratedPokemon opponentPokemon2, GeneratedPokemon opponentPokemon3, GeneratedPokemon opponentPokemon4, GeneratedPokemon opponentPokemon5, GeneratedPokemon opponentPokemon6) {
        this.playerPokemon1 = uniqueStarter;
        this.playerPokemon2 = playerPokemon2;
        this.playerPokemon3 = playerPokemon3;
        this.playerPokemon4 = playerPokemon4;
        this.playerPokemon5 = playerPokemon5;
        this.playerPokemon6 = playerPokemon6;
        this.opponentPokemon1 = opponentPokemon1;
        this.opponentPokemon2 = opponentPokemon2;
        this.opponentPokemon3 = opponentPokemon3;
        this.opponentPokemon4 = opponentPokemon4;
        this.opponentPokemon5 = opponentPokemon5;
        this.opponentPokemon6 = opponentPokemon6;
    }

    void mainBattleController() throws IOException {

        startCombat();

        while (true) {
            printBattleState();
            opponentBasicAI();
            playTurn();
            if (foundWinner) {
                break;
            }
        }
    }
    void playTurn() throws IOException {
        int moveFirst = speedCalc(activePlayerPokemon.spd, activeOpponentPokemon.spd);
        if (moveFirst == 0 && !foundWinner) {
            if (playerUseMove.equals("Leech Seed")) {
                System.out.println(activePlayerPokemon.pokemonName+" uses "+playerUseMove+"!");
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
            } else {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerUseMove + " for " + playerDamage + " damage!");
                activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                if (activeOpponentPokemon.remainingHp <= 0) {
                    ifOpponentLose();
                }
            }
            if (saveMoveName.equals("Leech Seed") && !foundWinner) {
                System.out.println("The opposing "+ activeOpponentPokemon.pokemonName+" uses "+saveMoveName+"!");
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            } else if (!foundWinner){
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + saveMoveName + " for " + idealMove + " damage!");
                activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                if (activePlayerPokemon.remainingHp <= 0) {
                    ifPlayerLose();
                }
            }
        }
        else if (moveFirst == 1 && !foundWinner) {
            if (saveMoveName.equals("Leech Seed")) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + saveMoveName + "!");
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            } else {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + saveMoveName + " for " + idealMove + " damage!");
                activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                if (activePlayerPokemon.remainingHp <= 0 && !foundWinner) {
                    ifPlayerLose();
                }
            }
            if (playerUseMove.equals("Leech Seed") && !foundWinner) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerUseMove + "!");
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
            } else if (!foundWinner) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerUseMove + " for " + playerDamage + " damage!");
                activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                if (activeOpponentPokemon.remainingHp <= 0) {
                    ifOpponentLose();
                }
            }
        }
        System.out.println();
        if (!foundWinner) {
            checkMove.endOfTurnEffects(activePlayerPokemon, activeOpponentPokemon, playerDamage);
            if (activeOpponentPokemon.remainingHp <= 0 && !foundWinner) {
                ifOpponentLose();
        }
        }
        if (!foundWinner) {
            checkMove.endOfTurnEffects(activeOpponentPokemon, activePlayerPokemon, idealMove);
            if (activePlayerPokemon.remainingHp <= 0 && !foundWinner) {
                ifPlayerLose();
        }
        }
    }

    void opponentBasicAI() throws IOException {
        opponentMoveType = callMove(activeOpponentPokemon.move1).moveType;
        opponentBasePower = callMove(activeOpponentPokemon.move1).basePower;
        int move1 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2);

        opponentMoveType = callMove(activeOpponentPokemon.move2).moveType;
        opponentBasePower = callMove(activeOpponentPokemon.move2).basePower;

        int move2 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2);
        opponentMoveType = callMove(activeOpponentPokemon.move3).moveType;
        opponentBasePower = callMove(activeOpponentPokemon.move3).basePower;

        int move3 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2);
        opponentMoveType = callMove(activeOpponentPokemon.move4).moveType;
        opponentBasePower = callMove(activeOpponentPokemon.move4).basePower;

        int move4 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2);

        if (activePlayerPokemon.repeatedMove > 0 || activePlayerPokemon.leechSeed) {
            if (activeOpponentPokemon.move1.equals("Fire Spin") || activeOpponentPokemon.move1.equals("Wrap") || activeOpponentPokemon.move1.equals("Leech Seed")) {
                move1 = 0;
            } else if (activeOpponentPokemon.move2.equals("Fire Spin") || activeOpponentPokemon.move2.equals("Wrap") || activeOpponentPokemon.move2.equals("Leech Seed")) {
                move2 = 0;
            } else if (activeOpponentPokemon.move3.equals("Fire Spin") || activeOpponentPokemon.move3.equals("Wrap") || activeOpponentPokemon.move3.equals("Leech Seed")) {
                move3 = 0;
            } else if (activeOpponentPokemon.move4.equals("Fire Spin") || activeOpponentPokemon.move4.equals("Wrap") || activeOpponentPokemon.move4.equals("Leech Seed")) {
                move4 = 0;
            }
        }
        idealMove = Math.max(move1, Math.max(move2,Math.max(move3, move4)));
            if (priorityCheck == callMove(activeOpponentPokemon.move1).priorityMove && move1 >= activePlayerPokemon.remainingHp) {
                idealMove = move1;
                saveMoveName = activeOpponentPokemon.move1;
                priorityCheckOpponent = true;
            }
            else if (priorityCheck == callMove(activeOpponentPokemon.move2).priorityMove && move2 >= activePlayerPokemon.remainingHp) {
                idealMove = move2;
                saveMoveName = activeOpponentPokemon.move2;
                priorityCheckOpponent = true;
            }
            else if (priorityCheck == callMove(activeOpponentPokemon.move3).priorityMove && move3 >= activePlayerPokemon.remainingHp) {
                idealMove = move3;
                saveMoveName = activeOpponentPokemon.move3;
                priorityCheckOpponent = true;
            }
            else if (priorityCheck == callMove(activeOpponentPokemon.move4).priorityMove && move4 >= activePlayerPokemon.remainingHp) {
                idealMove = move4;
                saveMoveName = activeOpponentPokemon.move4;
                priorityCheckOpponent = true;
            }
            else
                if (idealMove == move1) {
                    saveMoveName = activeOpponentPokemon.move1;
                } else if (idealMove == move2) {
                    saveMoveName = activeOpponentPokemon.move2;
                } else if (idealMove == move3) {
                    saveMoveName = activeOpponentPokemon.move3;
                } else if (idealMove == move4) {
                    saveMoveName = activeOpponentPokemon.move4;
                }
                else if (idealMove == 0) {
                    idealMove = 1;
                    saveMoveName = activeOpponentPokemon.move1;
                }

            }
    public int damageCalc(int basePower, int atk, int def, int lvl, String attackType, String userType1, String userType2, String opponentType1, String opponentType2) {
        double STAB;
        double effectiveness = (checkMove.checkEffective(attackType,opponentType1)*checkMove.checkEffective(attackType,opponentType2));
        if (attackType.equals(userType1) || attackType.equals(userType2)) {
            STAB  = 1.5;
        }
        else STAB = 1;
        double resultDamage = (((double) ((((2 * lvl) / 5) + 2) * basePower * (atk / def)) /50)+2)*STAB*effectiveness;
        return (int) Math.round(resultDamage);

    }
    public int expCalc() {
        return ((activeOpponentPokemon.expYield* activeOpponentPokemon.lvl)/6);
    }
    void chooseMove() throws IOException {
            System.out.println("Choose your move:");
            System.out.println("1. " + activePlayerPokemon.move1);
            System.out.println("2. " + activePlayerPokemon.move2);
            System.out.println("3. " + activePlayerPokemon.move3);
            System.out.println("4. " + activePlayerPokemon.move4);
            while (true) {
                if (op2) break;
                op1 = tastatur.next();
                if ((op1.equals("1") && !activePlayerPokemon.move1.equals(" ")) || (op1.equals("2") && !activePlayerPokemon.move2.equals(" ")) || (op1.equals("3") && !activePlayerPokemon.move3.equals(" ")) || (op1.equals("4") && !activePlayerPokemon.move4.equals(" "))) break;
                else System.out.println("Please make a valid choice.");
            }
                switch (op1) {
                    case "1":
                        playerUseMove = activePlayerPokemon.move1;
                        priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                        playerMoveType = callMove(playerUseMove).moveType;
                        playerBasePower = callMove(playerUseMove).basePower;
                        playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2);
                        break;
                    case "2":
                        playerUseMove = activePlayerPokemon.move2;
                        priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                        playerMoveType = callMove(playerUseMove).moveType;
                        playerBasePower = callMove(playerUseMove).basePower;
                        playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2);
                        break;
                    case "3":
                        playerUseMove = activePlayerPokemon.move3;
                        playerBasePower = callMove(playerUseMove).basePower;
                        playerMoveType = callMove(playerUseMove).moveType;
                        priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                        playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2);
                        break;
                    case "4":
                        playerUseMove = activePlayerPokemon.move4;
                        playerBasePower = callMove(playerUseMove).basePower;
                        playerMoveType = callMove(playerUseMove).moveType;
                        priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                        playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2);
                        break;
                }
    }
    void LevelUp(GeneratedPokemon insertPokemon) throws IOException {
        insertPokemon.StatGainLevelUp(insertPokemon);
        getMoves.LearnSet(insertPokemon);
        System.out.println(insertPokemon);
        System.out.println("Press a to continue");
        tastatur.next();
    }
    public int speedCalc(int playerSpeed, int opponentSpeed) {
        if (checkMove.priorityCheck(priorityCheckPlayer, priorityCheckOpponent) == 1) {
            return 0;
        } else if (checkMove.priorityCheck(priorityCheckPlayer, priorityCheckOpponent) == 2) {
            return 1;
        } else if (playerSpeed > opponentSpeed) {
            return 0;
        } else if (opponentSpeed > playerSpeed) {
            return 1;
        } else return 0;
    }
    void ifPlayerLose() {
        String op1;
        if (activePlayerPokemon.remainingHp < 0) {
            activePlayerPokemon.remainingHp = 0;}
        System.out.println();
        System.out.println(activePlayerPokemon.pokemonName);
        System.out.println("Lvl: "+ activePlayerPokemon.lvl);
        System.out.println("Hp: "+ activePlayerPokemon.hp+"/"+ activePlayerPokemon.remainingHp+"\n");
        System.out.println(activeOpponentPokemon.pokemonName);
        System.out.println("Lvl: "+ activeOpponentPokemon.lvl);
        System.out.println("Hp: "+ activeOpponentPokemon.hp+"/"+ activeOpponentPokemon.remainingHp+"\n");
        System.out.println("Your "+ activePlayerPokemon.pokemonName+" fainted!");
        if (playerPokemon1.remainingHp <= 0 && playerPokemon2.remainingHp <= 0 && playerPokemon3.remainingHp <= 0 && playerPokemon4.remainingHp <= 0 && playerPokemon5.remainingHp <= 0 && playerPokemon6.remainingHp <= 0) {
            foundWinner = true;
            System.out.println("Press a to continue");
            tastatur.next();
            System.out.println("You whited out...");
            System.out.println("Press a to continue");
        } else
            System.out.println("Please select the next pokemon to send in:");
            if (playerPokemon1.remainingHp > 0) {
                System.out.println("1. "+playerPokemon1);
            }
            if (playerPokemon2.remainingHp > 0) {
            System.out.println("2. "+playerPokemon2);
            }
            if (playerPokemon3.remainingHp > 0) {
            System.out.println("3. "+playerPokemon3);
            }
            if (playerPokemon4.remainingHp > 0) {
            System.out.println("4. "+playerPokemon4);
            }
            if (playerPokemon5.remainingHp > 0) {
            System.out.println("5. "+playerPokemon5);
            }
            if (playerPokemon6.remainingHp > 0) {
            System.out.println("6. "+playerPokemon6);
            }
            op1 = tastatur.next();
            switch (op1) {
                case "1":
                    activePlayerPokemon = playerPokemon1;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
                case "2":
                    activePlayerPokemon = playerPokemon2;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
                case "3":
                    activePlayerPokemon = playerPokemon3;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
                case "4":
                    activePlayerPokemon = playerPokemon4;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
                case "5":
                    activePlayerPokemon = playerPokemon5;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
                case "6":
                    activePlayerPokemon = playerPokemon6;
                    activePlayerPokemon.remainingHp = activeOpponentPokemon.hp;
                    System.out.println("You send out "+activePlayerPokemon.pokemonName+"!");
                    break;
            }
    }
    void ifOpponentLose() throws IOException {
        if (activeOpponentPokemon.remainingHp < 0) {
            activeOpponentPokemon.remainingHp = 0;}
        System.out.println();
        System.out.println(activePlayerPokemon.pokemonName);
        System.out.println("Lvl: "+ activePlayerPokemon.lvl);
        System.out.println("Hp: "+ activePlayerPokemon.hp+"/"+ activePlayerPokemon.remainingHp+"\n");
        System.out.println(activeOpponentPokemon.pokemonName);
        System.out.println("Lvl: "+ activeOpponentPokemon.lvl);
        System.out.println("Hp: "+ activeOpponentPokemon.hp+"/"+ activeOpponentPokemon.remainingHp+"\n");
        System.out.println("The opposing "+ activeOpponentPokemon.pokemonName+" fainted!");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("\nYour "+ activePlayerPokemon.pokemonName+" gained "+expCalc()+" exp!");
        System.out.println("Press a to continue");
        tastatur.next();
        partyGainsExp();

        if (activeOpponentPokemon.remainingHp <= 0 && opponentPokemon2.remainingHp <= 0 && opponentPokemon3.remainingHp <= 0 && opponentPokemon4.remainingHp <= 0 && opponentPokemon5.remainingHp <= 0 && opponentPokemon6.remainingHp <= 0) {
            foundWinner = true;
        } else if (opponentPokemon2.remainingHp > 0) {
            activeOpponentPokemon = opponentPokemon2;
            activeOpponentPokemon.remainingHp = activeOpponentPokemon.hp;
            System.out.println("Your opponent sends out "+activeOpponentPokemon.pokemonName+"!");
        } else if (opponentPokemon3.remainingHp > 0) {
            activeOpponentPokemon = opponentPokemon3;
            System.out.println("Your opponent sends out "+activeOpponentPokemon.pokemonName+"!");
        } else if (opponentPokemon4.remainingHp > 0) {
            activeOpponentPokemon = opponentPokemon4;
            System.out.println("Your opponent sends out "+activeOpponentPokemon.pokemonName+"!");
        } else if (opponentPokemon5.remainingHp > 0) {
            activeOpponentPokemon = opponentPokemon5;
            System.out.println("Your opponent sends out "+activeOpponentPokemon.pokemonName+"!");
        } else if (opponentPokemon6.remainingHp > 0) {
            activeOpponentPokemon = opponentPokemon6;
            System.out.println("Your opponent sends out "+activeOpponentPokemon.pokemonName+"!");
        }
    }
    void partyGainsExp() throws IOException {
        playerPokemon1.exp = playerPokemon1.exp + expCalc();
        if (playerPokemon1.exp > playerPokemon1.expToNextLvl) {
            LevelUp(playerPokemon1);
        }
        if (!playerPokemon2.pokemonName.equals(" ")) {
            playerPokemon2.exp = playerPokemon2.exp + expCalc();
            if (playerPokemon2.exp > playerPokemon2.expToNextLvl) {
                LevelUp(playerPokemon2);
            }
        }
        if (!playerPokemon3.pokemonName.equals(" ")) {
            playerPokemon3.exp = playerPokemon3.exp + expCalc();
            if (playerPokemon3.exp > playerPokemon3.expToNextLvl) {
                LevelUp(playerPokemon3);
            }
        }
        if (!playerPokemon4.pokemonName.equals(" ")) {
            playerPokemon4.exp = playerPokemon4.exp + expCalc();
            if (playerPokemon4.exp > playerPokemon4.expToNextLvl) {
                LevelUp(playerPokemon4);
            }
        }
        if (!playerPokemon5.pokemonName.equals(" ")) {
            playerPokemon5.exp = playerPokemon5.exp + expCalc();
            if (playerPokemon5.exp > playerPokemon5.expToNextLvl) {
                LevelUp(playerPokemon5);
            }
        }
        if (!playerPokemon6.pokemonName.equals(" ")) {
            playerPokemon6.exp = playerPokemon6.exp + expCalc();
            if (playerPokemon6.exp > playerPokemon6.expToNextLvl) {
                LevelUp(playerPokemon6);
            }
        }
    }
    public PokemonMoveList callMove(String moveID) throws IOException {
        PokemonMoveList findMove = new PokemonMoveList(moveID);
        findMove.getMoveData(findMove.getMove(moveID));

        return findMove;
    }
    void printBattleState() throws IOException {
        System.out.println();
        System.out.println(activePlayerPokemon.pokemonName);
        System.out.println("Lvl: "+ activePlayerPokemon.lvl);
        System.out.println("Hp: "+ activePlayerPokemon.hp+"/"+ activePlayerPokemon.remainingHp);
        System.out.println();
        System.out.println(activeOpponentPokemon.pokemonName);
        System.out.println("Lvl: "+ activeOpponentPokemon.lvl);
        System.out.println("Hp: "+ activeOpponentPokemon.hp+"/"+ activeOpponentPokemon.remainingHp);
        System.out.println();
        chooseMove();
    }
    void startCombat() {
        String op1;
        System.out.println("Please select a pokemon to send into battle:");
        System.out.println("1. "+playerPokemon1.pokemonName);
        if (!playerPokemon2.pokemonName.equals(" ")) {
            System.out.println("2. "+playerPokemon2.pokemonName);
        }
        if (!playerPokemon3.pokemonName.equals(" ")) {
            System.out.println("3. "+playerPokemon3.pokemonName);
        }
        if (!playerPokemon4.pokemonName.equals(" ")) {
            System.out.println("4. "+playerPokemon4.pokemonName);
        }
        if (!playerPokemon5.pokemonName.equals(" ")) {
            System.out.println("5. "+playerPokemon5.pokemonName);
        }
        if (!playerPokemon6.pokemonName.equals(" ")) {
            System.out.println("6. "+playerPokemon6.pokemonName);
        }
        while (true) {
            op1 = tastatur.next();
            if ((op1.equals("1") && !playerPokemon1.pokemonName.equals(" ")) || (op1.equals("2") && !playerPokemon2.pokemonName.equals(" ")) || (op1.equals("3") && !playerPokemon3.pokemonName.equals(" ")) || (op1.equals("4") && !playerPokemon4.pokemonName.equals(" ")) || (op1.equals("5") && !playerPokemon5.pokemonName.equals(" ")) || (op1.equals("6") && !playerPokemon6.pokemonName.equals(" "))) break;
        else System.out.println("Please make a valid choice.");
        }
        switch (op1) {
            case "1":
                activePlayerPokemon = playerPokemon1;
                break;
            case "2":
                activePlayerPokemon = playerPokemon2;
                break;
            case "3":
                activePlayerPokemon = playerPokemon3;
                break;
            case "4":
                activePlayerPokemon = playerPokemon4;
                break;
            case "5":
                activePlayerPokemon = playerPokemon5;
                break;
            case "6":
                activePlayerPokemon = playerPokemon6;
                break;
        }

        activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
        activePlayerPokemon.repeatedMove = 0;
        activePlayerPokemon.leechSeed = false;
        activePlayerPokemon.repeatingEffect = "";
        activePlayerPokemon.repeatingMove = "";
        getMoves.LearnSet(activePlayerPokemon);

        activeOpponentPokemon = opponentPokemon1;
        activeOpponentPokemon.remainingHp = activeOpponentPokemon.hp;
        activeOpponentPokemon.leechSeed = false;
        activeOpponentPokemon.repeatedMove = 0;
        activeOpponentPokemon.repeatingEffect = "";
        activeOpponentPokemon.repeatingMove = "";

        foundWinner = false;

        System.out.println("Battle: Start!");
        System.out.println();
        System.out.println("The Player sends out: " + activePlayerPokemon.pokemonName);
        System.out.println("The Opponent sends out: " + activeOpponentPokemon.pokemonName);
    }
}
