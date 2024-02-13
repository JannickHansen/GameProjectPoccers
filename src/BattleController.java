import java.io.IOException;
import java.util.*;

public class BattleController {
    MoveChecks checkMove = new MoveChecks();
    PokemonLearnSet getMoves = new PokemonLearnSet();
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    PlayerBag playerBag;
    int playerBasePower;
    int opponentBasePower;
    GeneratedPokemon activePlayerPokemon;
    GeneratedPokemon activeOpponentPokemon;
    Scanner tastatur = new Scanner(System.in);
    String playerUseMove;
    int idealMove;
    String saveMoveName = "";
    String playerMoveType;
    String opponentMoveType;
    int playerDamage;
    boolean priorityCheckPlayer;
    boolean priorityCheckOpponent;
    boolean priorityCheck = true;
    boolean foundWinner = false;
    boolean pokemonFainted = false;
    boolean trainer;
    String op1;
    boolean op2 = false;
    boolean op3 = false;
    boolean isCaught = false;
    boolean playerUsedItem;
    boolean opponentUsedItem;

    BattleController(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) {
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
        this.playerBag = playerBag;
    }

    boolean mainBattleController() throws IOException {

        startCombat();

        while (true) {
            printBattleState();
            opponentBasicAI();
            if (foundWinner) {
                break;
            }
            playTurn();
            if (foundWinner) {
                break;
            }
        }
        return op3;
    }

    void printBattleState() throws IOException {
        System.out.println();
        System.out.println(CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activePlayerPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activePlayerPokemon.hp + "/" + activePlayerPokemon.remainingHp);
        System.out.println();
        System.out.println(CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activeOpponentPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activeOpponentPokemon.hp + "/" + activeOpponentPokemon.remainingHp);
        System.out.println();
        chooseMove();
    }

    void playTurn() throws IOException {
        pokemonFainted = false;
        int moveFirst = speedCalc(activePlayerPokemon.spd, activeOpponentPokemon.spd);
        String opponentColorCode = CM.cM(callMove(saveMoveName).moveType);
        String playerColorCode = CM.cM(playerMoveType);
        if (isCaught) {
            foundWinner = true;
        } else if (playerUsedItem) { // IF PLAYER USED AN ITEM // CAN MAKE DUPLICATE IF OPPONENT USE ITEM
            if ((saveMoveName.equals("Leech Seed") || saveMoveName.equals("Milk Drink") || saveMoveName.equals("Recover")) && !foundWinner) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + "!");
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            } else if (!foundWinner) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + " for " + idealMove + " damage!");
                activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            }
            if (activePlayerPokemon.remainingHp <= 0) {
                ifPlayerLose();
            }
        } else if (moveFirst == 0 && !foundWinner) { //IF PLAYER IS FASTER
            if (playerUseMove.equals("Leech Seed") || playerUseMove.equals("Milk Drink") || playerUseMove.equals("Recover")) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + "!");
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
            } else if (checkMove.checkSpecialMoveEffect(playerUseMove) == 10 && !activePlayerPokemon.avoidDamage) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + "!");
                checkMove.calcNewDamageDone(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                activePlayerPokemon.avoidDamage = true;
            }
            else if (checkMove.checkSpecialMoveEffect(playerUseMove) == 10 && activePlayerPokemon.avoidDamage && !activeOpponentPokemon.avoidDamage) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + " for " + playerDamage + " damage!");
                activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                activePlayerPokemon.avoidDamage = false;
            }
            else {
                if (checkMove.checkSpecialMoveEffect(playerUseMove) == 10 && activeOpponentPokemon.avoidDamage) {
                    System.out.println(activePlayerPokemon.pokemonName + " missed the attack!");
                    activePlayerPokemon.avoidDamage = false;
                    activePlayerPokemon.lockedState = 0;
                } else if (activeOpponentPokemon.avoidDamage) {
                    System.out.println(activePlayerPokemon.pokemonName + " missed the attack!");
                    activePlayerPokemon.lockedState = 0;
                }
                else {
                    System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + " for " + playerDamage + " damage!");
                    activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                    checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                }
            }
            if (activeOpponentPokemon.remainingHp <= 0) {
                ifOpponentLose();
            }
            if ((saveMoveName.equals("Leech Seed") || saveMoveName.equals("Milk Drink") || saveMoveName.equals("Recover")) && !foundWinner && !pokemonFainted) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + "!");
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            } else if (!foundWinner && !pokemonFainted) {
                if (checkMove.checkSpecialMoveEffect(saveMoveName) == 10 && !activeOpponentPokemon.avoidDamage) {
                    System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + "!");
                    checkMove.calcNewDamageDone(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                    activeOpponentPokemon.avoidDamage = true;
                } else if (checkMove.checkSpecialMoveEffect(saveMoveName) == 10 && activeOpponentPokemon.avoidDamage && !activePlayerPokemon.avoidDamage) {
                    System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + " for " + idealMove + " damage!");
                    activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                    activeOpponentPokemon.avoidDamage = false;
                }
                else if (activePlayerPokemon.avoidDamage) {
                    System.out.println(activeOpponentPokemon.pokemonName + " missed the attack!");
                    activeOpponentPokemon.lockedState = 0;
                    activeOpponentPokemon.avoidDamage = false;
                } else {
                    System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + " for " + idealMove + " damage!");
                    activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                    checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                }
            }
            if (activePlayerPokemon.remainingHp <= 0) {
                ifPlayerLose();
            }
        } else if (moveFirst == 1 && !foundWinner) { // IF OPPONENT IS FASTER
            if (saveMoveName.equals("Leech Seed") || saveMoveName.equals("Milk Drink") || saveMoveName.equals("Recover")) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + "!");
                checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
            } else if (checkMove.checkSpecialMoveEffect(saveMoveName) == 10 && !activeOpponentPokemon.avoidDamage) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + "!");
                checkMove.calcNewDamageDone(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                activeOpponentPokemon.avoidDamage = true;
            } else if (checkMove.checkSpecialMoveEffect(saveMoveName) == 10 && activeOpponentPokemon.avoidDamage && !activePlayerPokemon.avoidDamage) {
                System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + " for " + idealMove + " damage!");
                activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                activeOpponentPokemon.avoidDamage = false;
            }
            else {
                if (checkMove.checkSpecialMoveEffect(saveMoveName) == 10 && activePlayerPokemon.avoidDamage) {
                    System.out.println(activeOpponentPokemon.pokemonName + " missed the attack!");
                    activeOpponentPokemon.avoidDamage = false;
                    activeOpponentPokemon.lockedState = 0;
                } else if (activePlayerPokemon.avoidDamage) {
                    System.out.println(activeOpponentPokemon.pokemonName + " missed the attack!");
                    activeOpponentPokemon.lockedState = 0;
                }
                else {
                    System.out.println("The opposing " + activeOpponentPokemon.pokemonName + " uses " + opponentColorCode + saveMoveName + CM.resetColour + " for " + idealMove + " damage!");
                    activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp - idealMove;
                    checkMove.performMoveEffect(saveMoveName, activeOpponentPokemon, activePlayerPokemon, idealMove);
                }
            }
            if (activePlayerPokemon.remainingHp <= 0 && !foundWinner) {
                ifPlayerLose();
            }
            if ((playerUseMove.equals("Leech Seed") || playerUseMove.equals("Milk Drink") || playerUseMove.equals("Recover")) && !foundWinner && !pokemonFainted) {
                System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + "!");
                checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
            }
            else if (!foundWinner && !pokemonFainted) {
                if (checkMove.checkSpecialMoveEffect(playerUseMove) == 10 && !activePlayerPokemon.avoidDamage) {
                    System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + "!");
                    checkMove.calcNewDamageDone(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                    activePlayerPokemon.avoidDamage = true;
                } else if (checkMove.checkSpecialMoveEffect(playerUseMove) == 10 && activePlayerPokemon.avoidDamage && !activeOpponentPokemon.avoidDamage) {
                    System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + " for " + playerDamage + " damage!");
                    activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                    activePlayerPokemon.avoidDamage = false;
                }
                else if (activeOpponentPokemon.avoidDamage) {
                    System.out.println(activePlayerPokemon.pokemonName + " missed the attack!");
                    activePlayerPokemon.lockedState = 0;
                    activePlayerPokemon.avoidDamage = false;
                } else {
                    System.out.println(activePlayerPokemon.pokemonName + " uses " + playerColorCode + playerUseMove + CM.resetColour + " for " + playerDamage + " damage!");
                    activeOpponentPokemon.remainingHp = activeOpponentPokemon.remainingHp - playerDamage;
                    checkMove.performMoveEffect(playerUseMove, activePlayerPokemon, activeOpponentPokemon, playerDamage);
                }
            }
            if (activeOpponentPokemon.remainingHp <= 0) {
                ifOpponentLose();
            }
        }
        System.out.println();
        if (!foundWinner && !pokemonFainted) {
            checkMove.endOfTurnEffects(activePlayerPokemon, activeOpponentPokemon, playerDamage);
            if (activeOpponentPokemon.remainingHp <= 0 && !foundWinner) {
                ifOpponentLose();
            }
        }
        if (!foundWinner && !pokemonFainted) {
            checkMove.endOfTurnEffects(activeOpponentPokemon, activePlayerPokemon, idealMove);
            if (activePlayerPokemon.remainingHp <= 0 && !foundWinner) {
                ifPlayerLose();
            }
        }
    }

    void opponentBasicAI() throws IOException {

        if (activeOpponentPokemon.avoidDamage) {
            if (activeOpponentPokemon.move1.equals("Dive") || activeOpponentPokemon.move1.equals("Dig") || activeOpponentPokemon.move1.equals("Fly") || activeOpponentPokemon.move1.equals("Bounce") || activeOpponentPokemon.move1.equals("Shadow Force")) {
                opponentMoveType = callMove(activeOpponentPokemon.move1).moveType;
                opponentBasePower = callMove(activeOpponentPokemon.move1).basePower;
                idealMove = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move1, activeOpponentPokemon, activePlayerPokemon);
            } else if (activeOpponentPokemon.move2.equals("Dive") || activeOpponentPokemon.move2.equals("Dig") || activeOpponentPokemon.move2.equals("Fly") || activeOpponentPokemon.move2.equals("Bounce") || activeOpponentPokemon.move2.equals("Shadow Force")) {
                opponentMoveType = callMove(activeOpponentPokemon.move2).moveType;
                opponentBasePower = callMove(activeOpponentPokemon.move2).basePower;
                idealMove = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move2, activeOpponentPokemon, activePlayerPokemon);
            } else if (activeOpponentPokemon.move3.equals("Dive") || activeOpponentPokemon.move3.equals("Dig") || activeOpponentPokemon.move3.equals("Fly") || activeOpponentPokemon.move3.equals("Bounce") || activeOpponentPokemon.move3.equals("Shadow Force")) {
                opponentMoveType = callMove(activeOpponentPokemon.move3).moveType;
                opponentBasePower = callMove(activeOpponentPokemon.move3).basePower;
                idealMove = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move3, activeOpponentPokemon, activePlayerPokemon);
            } else if (activeOpponentPokemon.move4.equals("Dive") || activeOpponentPokemon.move4.equals("Dig") || activeOpponentPokemon.move4.equals("Fly") || activeOpponentPokemon.move4.equals("Bounce") || activeOpponentPokemon.move4.equals("Shadow Force")) {
                opponentMoveType = callMove(activeOpponentPokemon.move4).moveType;
                opponentBasePower = callMove(activeOpponentPokemon.move4).basePower;
                idealMove = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move4, activeOpponentPokemon, activePlayerPokemon);
            }

        } else {

            opponentMoveType = callMove(activeOpponentPokemon.move1).moveType;
            opponentBasePower = callMove(activeOpponentPokemon.move1).basePower;
            int move1 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move1, activeOpponentPokemon, activePlayerPokemon);

            opponentMoveType = callMove(activeOpponentPokemon.move2).moveType;
            opponentBasePower = callMove(activeOpponentPokemon.move2).basePower;
            int move2 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move2, activeOpponentPokemon, activePlayerPokemon);

            opponentMoveType = callMove(activeOpponentPokemon.move3).moveType;
            opponentBasePower = callMove(activeOpponentPokemon.move3).basePower;
            int move3 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move3, activeOpponentPokemon, activePlayerPokemon);

            opponentMoveType = callMove(activeOpponentPokemon.move4).moveType;
            opponentBasePower = callMove(activeOpponentPokemon.move4).basePower;
            int move4 = damageCalc(opponentBasePower, activeOpponentPokemon.atk, activePlayerPokemon.def, activeOpponentPokemon.lvl, opponentMoveType, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.move4, activeOpponentPokemon, activePlayerPokemon);

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
            if (activeOpponentPokemon.lockedState > 0) {
                if (!activeOpponentPokemon.move1.equals("Rollout") && !activeOpponentPokemon.move1.equals("Ice Ball")) {
                    move1 = 0;
                }
                if (!activeOpponentPokemon.move2.equals("Rollout") && !activeOpponentPokemon.move2.equals("Ice Ball")) {
                    move2 = 0;
                }
                if (!activeOpponentPokemon.move3.equals("Rollout") && !activeOpponentPokemon.move3.equals("Ice Ball")) {
                    move3 = 0;
                }
                if (!activeOpponentPokemon.move4.equals("Rollout") && !activeOpponentPokemon.move4.equals("Ice Ball")) {
                    move4 = 0;
                }
            }
            idealMove = Math.max(move1, Math.max(move2, Math.max(move3, move4)));
            if (priorityCheck == callMove(activeOpponentPokemon.move1).priorityMove && move1 >= activePlayerPokemon.remainingHp) {
                idealMove = move1;
                saveMoveName = activeOpponentPokemon.move1;
                priorityCheckOpponent = true;
            } else if (priorityCheck == callMove(activeOpponentPokemon.move2).priorityMove && move2 >= activePlayerPokemon.remainingHp) {
                idealMove = move2;
                saveMoveName = activeOpponentPokemon.move2;
                priorityCheckOpponent = true;
            } else if (priorityCheck == callMove(activeOpponentPokemon.move3).priorityMove && move3 >= activePlayerPokemon.remainingHp) {
                idealMove = move3;
                saveMoveName = activeOpponentPokemon.move3;
                priorityCheckOpponent = true;
            } else if (priorityCheck == callMove(activeOpponentPokemon.move4).priorityMove && move4 >= activePlayerPokemon.remainingHp) {
                idealMove = move4;
                saveMoveName = activeOpponentPokemon.move4;
                priorityCheckOpponent = true;
            } else if (idealMove == move1) {
                saveMoveName = activeOpponentPokemon.move1;
                if (priorityCheck == callMove(activeOpponentPokemon.move1).priorityMove) {
                    priorityCheckOpponent = true;
                }
            } else if (idealMove == move2) {
                saveMoveName = activeOpponentPokemon.move2;
                if (priorityCheck == callMove(activeOpponentPokemon.move2).priorityMove) {
                    priorityCheckOpponent = true;
                }
            } else if (idealMove == move3) {
                saveMoveName = activeOpponentPokemon.move3;
                if (priorityCheck == callMove(activeOpponentPokemon.move3).priorityMove) {
                    priorityCheckOpponent = true;
                }
            } else if (idealMove == move4) {
                saveMoveName = activeOpponentPokemon.move4;
                if (priorityCheck == callMove(activeOpponentPokemon.move4).priorityMove) {
                    priorityCheckOpponent = true;
                }
            } else if (idealMove == 0) {
                idealMove = 1;
                saveMoveName = activeOpponentPokemon.move1;
                if (priorityCheck == callMove(activeOpponentPokemon.move1).priorityMove) {
                    priorityCheckOpponent = true;
                }
            }
            activeOpponentPokemon.lockedMove = idealMove;
        }
    }


    void chooseMove() throws IOException {
        String itemName;
        playerUsedItem = false;

        if (activePlayerPokemon.lockedState > 0) {
            playerUseMove = activePlayerPokemon.lockedMoveName;
            priorityCheckPlayer = callMove(playerUseMove).priorityMove;
            playerMoveType = callMove(playerUseMove).moveType;
            playerBasePower = callMove(playerUseMove).basePower;
            playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
        } else if (activePlayerPokemon.avoidDamage) {
            playerUseMove = activePlayerPokemon.lockedMoveName;
            priorityCheckPlayer = callMove(playerUseMove).priorityMove;
            playerMoveType = callMove(playerUseMove).moveType;
            playerBasePower = callMove(playerUseMove).basePower;
            playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
        } else {

        System.out.println("Choose your move:");
        System.out.println("1. " + CM.cM(callMove(activePlayerPokemon.move1).moveType)+activePlayerPokemon.move1 + CM.resetColour);
        System.out.println("2. " + CM.cM(callMove(activePlayerPokemon.move2).moveType)+activePlayerPokemon.move2 + CM.resetColour);
        System.out.println("3. " + CM.cM(callMove(activePlayerPokemon.move3).moveType)+activePlayerPokemon.move3 + CM.resetColour);
        System.out.println("4. " + CM.cM(callMove(activePlayerPokemon.move4).moveType)+activePlayerPokemon.move4 + CM.resetColour);
        System.out.println("5. Open Bag");
        while (true) {
            if (op2) break;
            op1 = tastatur.next();
            if ((op1.equals("1") && !activePlayerPokemon.move1.equals(" ")) || (op1.equals("2") && !activePlayerPokemon.move2.equals(" ")) || (op1.equals("3") && !activePlayerPokemon.move3.equals(" ")) || (op1.equals("4") && !activePlayerPokemon.move4.equals(" ")) || op1.equals("5"))
                break;
            else System.out.println("Please make a valid choice.");
        }
        switch (op1) {
            case "1":
                playerUseMove = activePlayerPokemon.move1;
                priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                playerMoveType = callMove(playerUseMove).moveType;
                playerBasePower = callMove(playerUseMove).basePower;
                playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
                break;
            case "2":
                playerUseMove = activePlayerPokemon.move2;
                priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                playerMoveType = callMove(playerUseMove).moveType;
                playerBasePower = callMove(playerUseMove).basePower;
                playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
                break;
            case "3":
                playerUseMove = activePlayerPokemon.move3;
                playerBasePower = callMove(playerUseMove).basePower;
                playerMoveType = callMove(playerUseMove).moveType;
                priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
                break;
            case "4":
                playerUseMove = activePlayerPokemon.move4;
                playerBasePower = callMove(playerUseMove).basePower;
                playerMoveType = callMove(playerUseMove).moveType;
                priorityCheckPlayer = callMove(playerUseMove).priorityMove;
                playerDamage = damageCalc(playerBasePower, activePlayerPokemon.atk, activeOpponentPokemon.def, activePlayerPokemon.lvl, playerMoveType, activePlayerPokemon.pokemonType1, activePlayerPokemon.pokemonType2, activeOpponentPokemon.pokemonType1, activeOpponentPokemon.pokemonType2, playerUseMove, activePlayerPokemon, activeOpponentPokemon);
                break;
            case "5":
                while (true) {
                    playerBag.printPlayerBag();
                    System.out.println("9. Back");
                    String op4 = tastatur.next();
                    if (op4.equals("9")) {
                        chooseMove();
                        break;
                    } else if (op4.equals("1") || op4.equals("2") || op4.equals("3") || op4.equals("4") || op4.equals("5") || op4.equals("6") || op4.equals("7") || op4.equals("8")) {
                        itemName = PlayerBag.nameOfItemsInInventory.get(playerBag.itemSlotCounter.get(convertReadIntInput.getOrDefault(op4, 0)));
                        System.out.println("Use " + CM.getItems + itemName + CM.resetColour + "? Yes / No");
                        String op5 = tastatur.next();
                        op5 = spellingControl(op5);
                        if (op5.equals("No")) ;
                        else if (op5.equals("Yes") && ((itemName.equals("Pokeball") && !trainer) || (itemName.equals("Greatball") && !trainer) || (itemName.equals("Ultraball") && !trainer))) {
                            PlayerBag.numberOfItemsInInventory.set(0, PlayerBag.numberOfItemsInInventory.get(0) - 1); // later, see difference between balls
                            boolean op6 = usePokeballs(itemName);
                            if (playerPokemonParty.get(1).pokemonName.equals(" ") && op6) {
                                transferData(playerPokemonParty, activeOpponentPokemon, 1);
                                System.out.println("\nYou caught the " + playerPokemonParty.get(1).pokemonName + "!");
                                System.out.println("The pokemon have been added to your party.");
                                isCaught = true;
                                System.out.println("Press a to continue");
                                tastatur.next();
                                break;
                            } else if (playerPokemonParty.get(2).pokemonName.equals(" ") && op6) {
                                transferData(playerPokemonParty, activeOpponentPokemon, 2);
                                System.out.println("\nYou caught the " + playerPokemonParty.get(2).pokemonName + "!");
                                System.out.println("The pokemon have been added to your party.");
                                isCaught = true;
                                System.out.println("Press a to continue");
                                tastatur.next();
                                break;
                            } else if (playerPokemonParty.get(3).pokemonName.equals(" ") && op6) {
                                transferData(playerPokemonParty, activeOpponentPokemon, 3);
                                System.out.println("\nYou caught the " + playerPokemonParty.get(3).pokemonName + "!");
                                System.out.println("The pokemon have been added to your party.");
                                isCaught = true;
                                System.out.println("Press a to continue");
                                tastatur.next();
                                break;
                            } else if (playerPokemonParty.get(4).pokemonName.equals(" ") && op6) {
                                transferData(playerPokemonParty, activeOpponentPokemon, 4);
                                System.out.println("\nYou caught the " + playerPokemonParty.get(4).pokemonName + "!");
                                System.out.println("The pokemon have been added to your party.");
                                isCaught = true;
                                System.out.println("Press a to continue");
                                tastatur.next();
                                break;
                            } else if (playerPokemonParty.get(5).pokemonName.equals(" ") && op6) {
                                transferData(playerPokemonParty, activeOpponentPokemon, 5);
                                System.out.println("\nYou caught the " + playerPokemonParty.get(5).pokemonName + "!");
                                System.out.println("The pokemon have been added to your party.");
                                isCaught = true;
                                System.out.println("Press a to continue");
                                tastatur.next();
                                break;
                            } else if (!op6) {
                                System.out.println("The pokemon broke free!");
                                playerUsedItem = true;
                                break;
                            }
                        } else if (trainer && (itemName.equals("Pokeball") || itemName.equals("Greatball") || itemName.equals("Ultraball"))) {
                            System.out.println("You can not catch another trainers pokemon!");
                        } else if (trainer && itemName.equals("Rare Candy")) {
                            System.out.println("You can not use this item in combat!");
                        } else if (itemName.equals("Potion")) {
                            PlayerBag.numberOfItemsInInventory.set(3, PlayerBag.numberOfItemsInInventory.get(3) - 1);
                            System.out.println("You used a " + CM.getItems + itemName + CM.resetColour + " on your " + activePlayerPokemon.pokemonName + "!");
                            System.out.println("The " + CM.getItems + itemName + CM.resetColour + " healed your " + activePlayerPokemon.pokemonName + " for 20hp!");
                            activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp + 20;
                            if (activePlayerPokemon.remainingHp > activePlayerPokemon.hp) {
                                activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            }
                            playerUsedItem = true;
                            break;
                        } else if (itemName.equals("Super Potion")) {
                            PlayerBag.numberOfItemsInInventory.set(4, PlayerBag.numberOfItemsInInventory.get(4) - 1);
                            System.out.println("You used a " + CM.getItems + itemName + CM.resetColour + " on your " + activePlayerPokemon.pokemonName + "!");
                            System.out.println("The " + CM.getItems + itemName + CM.resetColour + " healed your " + activePlayerPokemon.pokemonName + " for 50hp!");
                            activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp + 50;
                            if (activePlayerPokemon.remainingHp > activePlayerPokemon.hp) {
                                activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            }
                            playerUsedItem = true;
                            break;
                        } else if (itemName.equals("Hyper Potion")) {
                            PlayerBag.numberOfItemsInInventory.set(5, PlayerBag.numberOfItemsInInventory.get(5) - 1);
                            System.out.println("You used a " + CM.getItems + itemName + CM.resetColour + " on your " + activePlayerPokemon.pokemonName + "!");
                            System.out.println("The " + CM.getItems + itemName + CM.resetColour + " healed your " + activePlayerPokemon.pokemonName + " for 200hp!");
                            activePlayerPokemon.remainingHp = activePlayerPokemon.remainingHp + 200;
                            if (activePlayerPokemon.remainingHp > activePlayerPokemon.hp) {
                                activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            }
                            playerUsedItem = true;
                            break;
                        }
                    } else System.out.println("Make a valid choice.");
                }
            }
        activePlayerPokemon.lockedMove = convertReadIntInput.getOrDefault(op1,0);
        activePlayerPokemon.lockedMoveName = playerUseMove;
        }
    }
    void transferData(List<GeneratedPokemon> playerPokemonParty, GeneratedPokemon activeOpponentPokemon, int i) {
        playerPokemonParty.get(i).pokemonName = activeOpponentPokemon.pokemonName;
        playerPokemonParty.get(i).hasBeenGenerated = true;
        playerPokemonParty.get(i).lvl = activeOpponentPokemon.lvl;
        playerPokemonParty.get(i).expToNextLvl = activeOpponentPokemon.expToNextLvl;
        playerPokemonParty.get(i).pokemonType1 = activeOpponentPokemon.pokemonType1;
        playerPokemonParty.get(i).pokemonType2 = activeOpponentPokemon.pokemonType2;
        playerPokemonParty.get(i).atk = activeOpponentPokemon.atk;
        playerPokemonParty.get(i).def = activeOpponentPokemon.def;
        playerPokemonParty.get(i).spd = activeOpponentPokemon.spd;
        playerPokemonParty.get(i).hp = activeOpponentPokemon.hp;
        playerPokemonParty.get(i).IVAtk = activeOpponentPokemon.IVAtk;
        playerPokemonParty.get(i).IVDef = activeOpponentPokemon.IVDef;
        playerPokemonParty.get(i).IVSpd = activeOpponentPokemon.IVSpd;
        playerPokemonParty.get(i).IVHp = activeOpponentPokemon.IVHp;
        playerPokemonParty.get(i).pokemonNature = activeOpponentPokemon.pokemonNature;
        playerPokemonParty.get(i).natureStatsAtk = activeOpponentPokemon.natureStatsAtk;
        playerPokemonParty.get(i).natureStatsDef = activeOpponentPokemon.natureStatsDef;
        playerPokemonParty.get(i).natureStatsSpd = activeOpponentPokemon.natureStatsSpd;
        playerPokemonParty.get(i).expYield = activeOpponentPokemon.expYield;
        playerPokemonParty.get(i).catchRate = activeOpponentPokemon.catchRate;
        playerPokemonParty.get(i).move1 = activeOpponentPokemon.move1;
        playerPokemonParty.get(i).move2 = activeOpponentPokemon.move2;
        playerPokemonParty.get(i).move3 = activeOpponentPokemon.move3;
        playerPokemonParty.get(i).move4 = activeOpponentPokemon.move4;

    }

    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    boolean usePokeballs(String usedPokeball) {
        double ballModifier = 0;
        int hpFactor = (3 * activeOpponentPokemon.hp - 2 * activeOpponentPokemon.remainingHp) / (3 * activeOpponentPokemon.hp);
        ballModifier = switch (usedPokeball) {
            case "Pokeball" -> 1;
            case "Greatball" -> 1.5;
            case "Ultraball" -> 2;
            default -> ballModifier;
        };
        double catchProbability = ((1 - hpFactor) * ballModifier * activeOpponentPokemon.catchRate / 255);
        double rollAttempt = Math.random();

        return rollAttempt <= catchProbability;
    }

    void ifPlayerLose() {
        String op1;
        pokemonFainted = true;
        boolean validChoice = false;
        if (activePlayerPokemon.remainingHp < 0) {
            activePlayerPokemon.remainingHp = 0;
        }
        System.out.println();
        System.out.println(CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activePlayerPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activePlayerPokemon.hp + "/" + activePlayerPokemon.remainingHp + "\n");
        System.out.println(CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activeOpponentPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activeOpponentPokemon.hp + "/" + activeOpponentPokemon.remainingHp + "\n");
        System.out.println("Your " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + " fainted!");
        if (playerPokemonParty.get(0).remainingHp <= 0 && playerPokemonParty.get(1).remainingHp <= 0 && playerPokemonParty.get(2).remainingHp <= 0 && playerPokemonParty.get(3).remainingHp <= 0 && playerPokemonParty.get(4).remainingHp <= 0 && playerPokemonParty.get(5).remainingHp <= 0) {
            foundWinner = true;
            op3 = false;
            System.out.println("Press a to continue");
            tastatur.next();
            System.out.println("You whited out...");
            System.out.println("Press a to continue");
        } else
            while (!validChoice) {
            System.out.println("\nPlease select the next pokemon to send in:");
        if (playerPokemonParty.get(0).remainingHp > 0) {
            System.out.println("1. " + CM.cM(playerPokemonParty.get(0).pokemonType1) + playerPokemonParty.get(0).pokemonName + CM.resetColour);
        }
        if (playerPokemonParty.get(1).remainingHp > 0) {
            System.out.println("2. " + CM.cM(playerPokemonParty.get(1).pokemonType1) + playerPokemonParty.get(1).pokemonName + CM.resetColour);
        }
        if (playerPokemonParty.get(2).remainingHp > 0) {
            System.out.println("3. " + CM.cM(playerPokemonParty.get(2).pokemonType1) + playerPokemonParty.get(2).pokemonName + CM.resetColour);
        }
        if (playerPokemonParty.get(3).remainingHp > 0) {
            System.out.println("4. " + CM.cM(playerPokemonParty.get(3).pokemonType1) + playerPokemonParty.get(3).pokemonName + CM.resetColour);
        }
        if (playerPokemonParty.get(4).remainingHp > 0) {
            System.out.println("5. " + CM.cM(playerPokemonParty.get(4).pokemonType1) + playerPokemonParty.get(4).pokemonName + CM.resetColour);
        }
        if (playerPokemonParty.get(5).remainingHp > 0) {
            System.out.println("6. " + CM.cM(playerPokemonParty.get(5).pokemonType1) + playerPokemonParty.get(5).pokemonName + CM.resetColour);
        }
        while (true) {
            op1 = tastatur.next();
            if (op1.equals("1") || op1.equals("2") || op1.equals("3") || op1.equals("4") || op1.equals("5") || op1.equals("6")) {
                switch (op1) {
                    case "1":
                        if (playerPokemonParty.get(0).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(0);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                    case "2":
                        if (playerPokemonParty.get(1).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(1);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                    case "3":
                        if (playerPokemonParty.get(2).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(2);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                    case "4":
                        if (playerPokemonParty.get(3).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(3);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                    case "5":
                        if (playerPokemonParty.get(4).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(4);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                    case "6":
                        if (playerPokemonParty.get(5).remainingHp > 0) {
                            activePlayerPokemon = playerPokemonParty.get(5);
                            activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
                            System.out.println("You send out " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + "!");
                            validChoice = true;
                        }
                        break;
                }
                break;
            } else
                System.out.println("Make a valid choice");
        }
        }
    }

    void ifOpponentLose() throws IOException {
        pokemonFainted = true;
        if (activeOpponentPokemon.remainingHp < 0) {
            activeOpponentPokemon.remainingHp = 0;
        }
        System.out.println();
        System.out.println(CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activePlayerPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activePlayerPokemon.hp + "/" + activePlayerPokemon.remainingHp + "\n");
        System.out.println(CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour);
        System.out.println("Lvl: " + CM.getLevels + activeOpponentPokemon.lvl + CM.resetColour);
        System.out.println("Hp: " + activeOpponentPokemon.hp + "/" + activeOpponentPokemon.remainingHp + "\n");
        System.out.println("The opposing " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + " fainted!");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("\nYour " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour + " gained " + expCalc() + " exp!");
        System.out.println("Press a to continue");
        tastatur.next();
        partyGainsExp();

        if (opponentPokemonParty.get(0).remainingHp <= 0 && opponentPokemonParty.get(1).remainingHp <= 0 && opponentPokemonParty.get(2).remainingHp <= 0 && opponentPokemonParty.get(3).remainingHp <= 0 && opponentPokemonParty.get(4).remainingHp <= 0 && opponentPokemonParty.get(5).remainingHp <= 0) {
            foundWinner = true;
        } else if (opponentPokemonParty.get(0).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(0);
            activeOpponentPokemon.remainingHp = activeOpponentPokemon.hp;
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        } else if (opponentPokemonParty.get(1).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(1);
            activeOpponentPokemon.remainingHp = activeOpponentPokemon.hp;
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        } else if (opponentPokemonParty.get(2).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(2);
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        } else if (opponentPokemonParty.get(3).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(3);
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        } else if (opponentPokemonParty.get(4).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(4);
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        } else if (opponentPokemonParty.get(5).remainingHp > 0) {
            activeOpponentPokemon = opponentPokemonParty.get(5);
            System.out.println("Your opponent sends out " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour + "!");
        }
        op3 = true;
    }

    public int damageCalc(int BasePower, int atk, int def, int lvl, String attackType, String userType1, String userType2, String opponentType1, String opponentType2, String moveUsed, GeneratedPokemon moveUser, GeneratedPokemon moveTarget) {
        Random random = new Random();
        double STAB;
        double effectiveness = (checkMove.checkEffective(attackType, opponentType1) * checkMove.checkEffective(attackType, opponentType2));
        if (attackType.equals(userType1) || attackType.equals(userType2)) {
            STAB = 1.5;
        } else STAB = 1;
        int basePower = checkMove.calcNewBasePower(moveUsed, BasePower, moveUser);
        double resultDamage = (((double) ((((2 * lvl) / 5) + 2) * basePower * atk / def) / 50) + 2) * STAB * effectiveness * (random.nextDouble(85,100+1)/100);
        resultDamage = checkMove.calcNewDamageDone(moveUsed, moveUser, moveTarget, resultDamage);
        return (int) Math.round(resultDamage);
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

    public int expCalc() {
        int isTrainer = 1;
        if (trainer) {
            isTrainer = 2;
        }
        return (((activeOpponentPokemon.expYield * activeOpponentPokemon.lvl) / 6))*isTrainer;
    }

    void levelUp(GeneratedPokemon insertPokemon) throws IOException {
        insertPokemon.StatGainLevelUp(insertPokemon);
        getMoves.LearnSet(insertPokemon);
        System.out.println(insertPokemon);
        System.out.println("Press a to continue");
        tastatur.next();
    }

    void partyGainsExp() throws IOException {
        playerPokemonParty.get(0).exp = playerPokemonParty.get(0).exp + expCalc();
        if (playerPokemonParty.get(0).exp > playerPokemonParty.get(0).expToNextLvl) {
            levelUp(playerPokemonParty.get(0));
        }
        if (!playerPokemonParty.get(1).pokemonName.equals(" ")) {
            playerPokemonParty.get(1).exp = playerPokemonParty.get(1).exp + expCalc();
            if (playerPokemonParty.get(1).exp > playerPokemonParty.get(1).expToNextLvl) {
                levelUp(playerPokemonParty.get(1));
            }
        }
        if (!playerPokemonParty.get(2).pokemonName.equals(" ")) {
            playerPokemonParty.get(2).exp = playerPokemonParty.get(2).exp + expCalc();
            if (playerPokemonParty.get(2).exp > playerPokemonParty.get(2).expToNextLvl) {
                levelUp(playerPokemonParty.get(2));
            }
        }
        if (!playerPokemonParty.get(3).pokemonName.equals(" ")) {
            playerPokemonParty.get(3).exp = playerPokemonParty.get(3).exp + expCalc();
            if (playerPokemonParty.get(3).exp > playerPokemonParty.get(3).expToNextLvl) {
                levelUp(playerPokemonParty.get(3));
            }
        }
        if (!playerPokemonParty.get(4).pokemonName.equals(" ")) {
            playerPokemonParty.get(4).exp = playerPokemonParty.get(4).exp + expCalc();
            if (playerPokemonParty.get(4).exp > playerPokemonParty.get(4).expToNextLvl) {
                levelUp(playerPokemonParty.get(4));
            }
        }
        if (!playerPokemonParty.get(5).pokemonName.equals(" ")) {
            playerPokemonParty.get(5).exp = playerPokemonParty.get(5).exp + expCalc();
            if (playerPokemonParty.get(5).exp > playerPokemonParty.get(5).expToNextLvl) {
                levelUp(playerPokemonParty.get(5));
            }
        }
    }

    public PokemonMoveList callMove(String moveID) throws IOException {
        PokemonMoveList findMove = new PokemonMoveList(moveID);
        findMove.getMoveData(findMove.getMove(moveID));

        return findMove;
    }

    void startCombat() {
        String op1;
        System.out.println("Please select a pokemon to send into battle:");
        System.out.println("1. " + CM.cM(playerPokemonParty.get(0).pokemonType1) + playerPokemonParty.get(0).pokemonName + CM.resetColour);
        if (!playerPokemonParty.get(1).pokemonName.equals(" ")) {
            System.out.println("2. " + CM.cM(playerPokemonParty.get(1).pokemonType1) + playerPokemonParty.get(1).pokemonName + CM.resetColour);
            playerPokemonParty.get(1).remainingHp = playerPokemonParty.get(1).hp;
        }
        if (!playerPokemonParty.get(2).pokemonName.equals(" ")) {
            System.out.println("3. " + CM.cM(playerPokemonParty.get(2).pokemonType1) + playerPokemonParty.get(2).pokemonName + CM.resetColour);
            playerPokemonParty.get(2).remainingHp = playerPokemonParty.get(2).hp;
        }
        if (!playerPokemonParty.get(3).pokemonName.equals(" ")) {
            System.out.println("4. " + CM.cM(playerPokemonParty.get(3).pokemonType1) + playerPokemonParty.get(3).pokemonName + CM.resetColour);
            playerPokemonParty.get(3).remainingHp = playerPokemonParty.get(3).hp;
        }
        if (!playerPokemonParty.get(4).pokemonName.equals(" ")) {
            System.out.println("5. " + CM.cM(playerPokemonParty.get(4).pokemonType1) + playerPokemonParty.get(4).pokemonName + CM.resetColour);
            playerPokemonParty.get(4).remainingHp = playerPokemonParty.get(4).hp;
        }
        if (!playerPokemonParty.get(5).pokemonName.equals(" ")) {
            System.out.println("6. " + CM.cM(playerPokemonParty.get(5).pokemonType1) + playerPokemonParty.get(5).pokemonName + CM.resetColour);
            playerPokemonParty.get(5).remainingHp = playerPokemonParty.get(5).hp;
        }
        while (true) {
            op1 = tastatur.next();
            if ((op1.equals("1") && !playerPokemonParty.get(0).pokemonName.equals(" ")) || (op1.equals("2") && !playerPokemonParty.get(1).pokemonName.equals(" ")) || (op1.equals("3") && !playerPokemonParty.get(2).pokemonName.equals(" ")) || (op1.equals("4") && !playerPokemonParty.get(3).pokemonName.equals(" ")) || (op1.equals("5") && !playerPokemonParty.get(4).pokemonName.equals(" ")) || (op1.equals("6") && !playerPokemonParty.get(5).pokemonName.equals(" ")))
                break;
            else System.out.println("Please make a valid choice.");
        }
        switch (op1) {
            case "1":
                activePlayerPokemon = playerPokemonParty.get(0);
                break;
            case "2":
                activePlayerPokemon = playerPokemonParty.get(1);
                break;
            case "3":
                activePlayerPokemon = playerPokemonParty.get(2);
                break;
            case "4":
                activePlayerPokemon = playerPokemonParty.get(3);
                break;
            case "5":
                activePlayerPokemon = playerPokemonParty.get(4);
                break;
            case "6":
                activePlayerPokemon = playerPokemonParty.get(5);
                break;
        }

        activePlayerPokemon.remainingHp = activePlayerPokemon.hp;
        activePlayerPokemon.repeatedMove = 0;
        activePlayerPokemon.leechSeed = false;
        activePlayerPokemon.repeatingEffect = "";
        activePlayerPokemon.repeatingMove = "";
        activePlayerPokemon.lockedMoveName = "";
        activePlayerPokemon.lockedState = 0;
        activePlayerPokemon.lockedMove = 0;
        activePlayerPokemon.avoidDamage = false;

        activeOpponentPokemon = opponentPokemonParty.get(0);
        activeOpponentPokemon.remainingHp = activeOpponentPokemon.hp;
        activeOpponentPokemon.leechSeed = false;
        activeOpponentPokemon.repeatedMove = 0;
        activeOpponentPokemon.repeatingEffect = "";
        activeOpponentPokemon.repeatingMove = "";
        activeOpponentPokemon.lockedMoveName = "";
        activeOpponentPokemon.lockedState = 0;
        activeOpponentPokemon.lockedMove = 0;
        activeOpponentPokemon.avoidDamage = false;

        foundWinner = false;
        isCaught = false;
        playerUsedItem = false;
        opponentUsedItem = false;

        System.out.println("Battle: Start!");
        System.out.println();
        System.out.println("The Player sends out: " + CM.cM(activePlayerPokemon.pokemonType1) + activePlayerPokemon.pokemonName + CM.resetColour);
        System.out.println("The Opponent sends out: " + CM.cM(activeOpponentPokemon.pokemonType1) + activeOpponentPokemon.pokemonName + CM.resetColour);
    }

    private static final Map<String, Integer> convertReadIntInput = new HashMap<>();

    static {
        convertReadIntInput.put("1", 0);
        convertReadIntInput.put("2", 1);
        convertReadIntInput.put("3", 2);
        convertReadIntInput.put("4", 3);
    }
}
