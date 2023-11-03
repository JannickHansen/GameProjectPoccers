import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RouteController {
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    PlayerBag playerBag;
    Scanner tastatur = new Scanner(System.in);
    boolean route1 = false;
    boolean route2 = false;
    boolean route3 = false;
    boolean route4 = false;
    boolean route5 = false;
    boolean route6 = false;
    boolean route7 = false;
    boolean route8 = false;
    int n = 0;
    String op1;
    int op2;
    int op3;
    boolean op4;
    RouteController(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) {
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
        this.playerBag = playerBag;

    }

    void routeOne(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);
        int minValue = 1;
        int maxValue = 3;
        op1 = "";
        op2 = 0;
        op3 = 0;
        while (true) {
            if (n >= 3) {
                route1 = true;
                n = 0;
                System.out.println("\nRoute 2 have been unlocked!\n");
            }
            startBattle.trainer = false;
            opponentPokemonParty.get(0).remainingHp = 0;
            opponentPokemonParty.get(1).remainingHp = 0;
            opponentPokemonParty.get(2).remainingHp = 0;
            opponentPokemonParty.get(3).remainingHp = 0;
            opponentPokemonParty.get(4).remainingHp = 0;
            opponentPokemonParty.get(5).remainingHp = 0;

            if (op1.equals("9")) break;
            System.out.println("<Route 1>\n");
            System.out.println("Select what you will do:");
            System.out.println("1. Enter the tall grass to look for wild pokemon.");
            System.out.println("2. Find and challenge a trainer on this route.");
            System.out.println("9. Return to the <Route Menu>");
            op1 = tastatur.next();
                switch (op1) {
                    case "1":
                        op1 = "";
                        op2 = randomNumberGenerator();
                            if (op2 < 11) {
                                opponentPokemonParty.get(0).setImportPokemonData("Bidoof",randomNumberRange(3,5));
                                opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                                opponentPokemonParty.get(0).move1 = "Tackle";
                                opponentPokemonParty.get(0).move2 = "Water Gun";
                            } else if (op2 < 41) {
                                opponentPokemonParty.get(0).setImportPokemonData("Rattata",randomNumberRange(2,4));
                                opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                                opponentPokemonParty.get(0).move1 = "Quick Attack";
                                opponentPokemonParty.get(0).move2 = "Tackle";
                            } else if (op2 < 71) {
                                opponentPokemonParty.get(0).setImportPokemonData("Pidgey",randomNumberRange(2,4));
                                opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                                opponentPokemonParty.get(0).move1 = "Tackle";
                                opponentPokemonParty.get(0).move2 = "Gust";
                            } else if (op2 <= 100) {
                                opponentPokemonParty.get(0).setImportPokemonData("Ekans",randomNumberRange(2,4));
                                opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                                opponentPokemonParty.get(0).move1 = "Wrap";
                                opponentPokemonParty.get(0).move2 = "Tackle";
                            }
                        System.out.println("A wild "+opponentPokemonParty.get(0).pokemonName+" has appeared!\n");
                        startBattle.mainBattleController();
                        break;
                    case "2":
                        op1 = "";
                        op3 = randomNumberRange(minValue,maxValue);
                        switch (op3) {
                            case 1:
                                op3 = 0;
                                op4 = false;
                                startBattle.trainer = true;
                                System.out.println("You found <Youngster Joey> on the route, and challenged him to a duel!\n");
                                opponentPokemonParty.get(0).setImportPokemonData("Rattata",5);
                                opponentPokemonParty.get(0).move1 = "Tackle";
                                opponentPokemonParty.get(0).move2 = "Quick Attack";
                                opponentPokemonParty.get(1).setImportPokemonData("Rattata",5);
                                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                                opponentPokemonParty.get(1).move1 = "Quick Attack";
                                opponentPokemonParty.get(1).move2 = "Tackle";
                                op4 = startBattle.mainBattleController();
                                if (op4) {
                                    n++;
                                    playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(12,24);
                                }
                                break;
                            case 2:
                                op3 = 0;
                                op4 = false;
                                startBattle.trainer = true;
                                System.out.println("You found <Birdkeeper !@#$%^&*()> on the route, and challenged her to a duel!\n");
                                opponentPokemonParty.get(0).setImportPokemonData("Pidgey",5);
                                opponentPokemonParty.get(0).move1 = "Quick Attack";
                                opponentPokemonParty.get(0).move2 = "Gust";
                                opponentPokemonParty.get(1).setImportPokemonData("Pidove",6);
                                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                                opponentPokemonParty.get(1).move1 = "Quick Attack";
                                opponentPokemonParty.get(1).move2 = "Peck";
                                op4 = startBattle.mainBattleController();
                                if (op4) {
                                    n++;
                                    playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(12,24);
                                }
                                break;
                            case 3:
                                op3 = 0;
                                op4 = false;
                                startBattle.trainer = true;
                                System.out.println("You found <Bugcatcher Cathrine> on the route, and challenged her to a duel!\n");
                                opponentPokemonParty.get(0).setImportPokemonData("Caterpie",5);
                                opponentPokemonParty.get(0).move1 = "Tackle";
                                opponentPokemonParty.get(0).move2 = "Bug Bite";
                                opponentPokemonParty.get(1).setImportPokemonData("Weedle",5);
                                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                                opponentPokemonParty.get(1).move1 = "Poison Sting";
                                opponentPokemonParty.get(1).move2 = "Bug Bite";
                                opponentPokemonParty.get(2).setImportPokemonData("Surskit",5);
                                opponentPokemonParty.get(2).remainingHp = opponentPokemonParty.get(2).hp;
                                opponentPokemonParty.get(2).move1 = "Bubble";
                                opponentPokemonParty.get(2).move2 = "Bug Bite";
                                opponentPokemonParty.get(2).move3 = "Quick Attack";
                                op4 = startBattle.mainBattleController();
                                if (op4) {
                                    n++;
                                    playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(12,24);
                                }
                                break;
                        }
                        break;
                    case "9":
                    default:
                        System.out.println("Please make a valid choice.\n");
                }
        }
    }
    void routeTwo(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);
        int minValue = 1;
        int maxValue = 4;
        op1 = "";
        op2 = 0;
        op3 = 0;
        while (true) {

            if (n >= 4) {
                route2 = true;
                System.out.println("\nThe first Pokemon Gym have been unlocked!\n");
                n = 0;
            }

            startBattle.trainer = false;
            opponentPokemonParty.get(0).remainingHp = 0;
            opponentPokemonParty.get(1).remainingHp = 0;
            opponentPokemonParty.get(2).remainingHp = 0;
            opponentPokemonParty.get(3).remainingHp = 0;
            opponentPokemonParty.get(4).remainingHp = 0;
            opponentPokemonParty.get(5).remainingHp = 0;

            if (op1.equals("9")) break;
            System.out.println("<Route 2>\n");
            System.out.println("Select what you will do:");
            System.out.println("1. Enter the tall grass to look for wild pokemon.");
            System.out.println("2. Find and challenge a trainer on this route.");
            System.out.println("9. Return to the <Route Menu>");
            op1 = tastatur.next();
            switch (op1) {
                case "1":
                    op1 = "";
                    op2 = randomNumberGenerator();
                    if (op2 < 6) {
                        opponentPokemonParty.get(0).setImportPokemonData("Swinub",randomNumberRange(6,9));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Flail";
                        opponentPokemonParty.get(0).move2 = "Powder Snow";
                        opponentPokemonParty.get(0).move3 = "Bite";
                    } else if (op2 < 31) {
                        opponentPokemonParty.get(0).setImportPokemonData("Surskit",randomNumberRange(6,9));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Bubble";
                        opponentPokemonParty.get(0).move2 = "Bug Bite";
                        opponentPokemonParty.get(0).move3 = "Quick Attack";
                    } else if (op2 < 46) {
                        opponentPokemonParty.get(0).setImportPokemonData("Nidoran♂", randomNumberRange(7, 9));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Poison Sting";
                        opponentPokemonParty.get(0).move2 = "Scratch";
                        opponentPokemonParty.get(0).move3 = "Bite";
                    }else if (op2 < 66) {
                        opponentPokemonParty.get(0).setImportPokemonData("Nidoran♀",randomNumberRange(7,10));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Poison Sting";
                        opponentPokemonParty.get(0).move2 = "Scratch";
                        opponentPokemonParty.get(0).move3 = "Bite";
                    } else if (op2 <= 100) {
                        opponentPokemonParty.get(0).setImportPokemonData("Lotad",randomNumberRange(6,10));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Water Gun";
                        opponentPokemonParty.get(0).move2 = "Absorb";
                        opponentPokemonParty.get(0).move3 = "Tackle";
                    }
                    System.out.println("A wild "+opponentPokemonParty.get(0).pokemonName+" has appeared!\n");
                    startBattle.mainBattleController();
                    break;
                case "2":
                    op1 = "";
                    op3 = randomNumberRange(minValue,maxValue);
                    switch (op3) {
                        case 1:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Nature Enthusiast Carl> on the route, and challenged him to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Bibarel",11);
                            opponentPokemonParty.get(0).move1 = "Headbutt";
                            opponentPokemonParty.get(0).move2 = "Water Gun";
                            opponentPokemonParty.get(0).move3 = "Bite";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(18,30);
                            }
                            break;
                        case 2:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Ace Trainer Cyn> on the route, and challenged her to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Eevee",10);
                            opponentPokemonParty.get(0).move1 = "Take Down";
                            opponentPokemonParty.get(0).move2 = "Shadow Ball";
                            opponentPokemonParty.get(0).move3 = "Quick Attack";
                            opponentPokemonParty.get(0).move4 = "Bite";
                            opponentPokemonParty.get(1).setImportPokemonData("Piplup",11);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Water Gun";
                            opponentPokemonParty.get(1).move2 = "Peck";
                            opponentPokemonParty.get(1).move3 = "Rock Tomb";
                            opponentPokemonParty.get(1).move4 = "Pound";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(18,30);
                            }
                            break;
                        case 3:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Lemonade Stand Seller Ashley> on the route, and challenged her to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Nidoran♂",10);
                            opponentPokemonParty.get(0).move1 = "Poison Sting";
                            opponentPokemonParty.get(0).move2 = "Bite";
                            opponentPokemonParty.get(0).move3 = "Scratch";
                            opponentPokemonParty.get(1).setImportPokemonData("Nidoran♀",10);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Poison Sting";
                            opponentPokemonParty.get(1).move2 = "Bite";
                            opponentPokemonParty.get(1).move3 = "Scratch";
                            opponentPokemonParty.get(2).setImportPokemonData("Bidoof",11);
                            opponentPokemonParty.get(2).remainingHp = opponentPokemonParty.get(2).hp;
                            opponentPokemonParty.get(2).move1 = "Water Gun";
                            opponentPokemonParty.get(2).move2 = "Take Down";
                            opponentPokemonParty.get(2).move3 = "Bulldoze";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(18,30);
                            }
                            break;
                        case 4:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Lemonade Stand Seller Ashley> on the route, and challenged her to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Pidove",10);
                            opponentPokemonParty.get(0).move1 = "Quick Attack";
                            opponentPokemonParty.get(0).move2 = "Gust";
                            opponentPokemonParty.get(1).setImportPokemonData("Lotad",10);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Absorb";
                            opponentPokemonParty.get(1).move2 = "Water Gun";
                            opponentPokemonParty.get(1).move3 = "Tackle";
                            opponentPokemonParty.get(2).setImportPokemonData("Surskit",12);
                            opponentPokemonParty.get(2).remainingHp = opponentPokemonParty.get(2).hp;
                            opponentPokemonParty.get(2).move1 = "Water Gun";
                            opponentPokemonParty.get(2).move2 = "Absorb";
                            opponentPokemonParty.get(2).move3 = "Take Down";
                            opponentPokemonParty.get(2).move4 = "Quick Attack";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(18,30);
                            }
                            break;
                    }
                    break;
                case "9":
                default:
                    System.out.println("Please make a valid choice.\n");
            }
        }
    }
    void routeThree(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);
        int minValue = 1;
        int maxValue = 7;
        op1 = "";
        op2 = 0;
        op3 = 0;
        while (true) {
            if (n >= 6) {
                route1 = true;
                n = 0;
                System.out.println("\nRoute 2 have been unlocked!\n");
            }
            startBattle.trainer = false;
            opponentPokemonParty.get(0).remainingHp = 0;
            opponentPokemonParty.get(1).remainingHp = 0;
            opponentPokemonParty.get(2).remainingHp = 0;
            opponentPokemonParty.get(3).remainingHp = 0;
            opponentPokemonParty.get(4).remainingHp = 0;
            opponentPokemonParty.get(5).remainingHp = 0;

            if (op1.equals("9")) break;
            System.out.println("<Route 1>\n");
            System.out.println("Select what you will do:");
            System.out.println("1. Enter the tall grass to look for wild pokemon.");
            System.out.println("2. Find and challenge a trainer on this route.");
            System.out.println("9. Return to the <Route Menu>");
            op1 = tastatur.next();
            switch (op1) {
                case "1":
                    op1 = "";
                    op2 = randomNumberGenerator();
                    if (op2 < 11) {
                        opponentPokemonParty.get(0).setImportPokemonData("Bidoof",randomNumberRange(3,5));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Tackle";
                        opponentPokemonParty.get(0).move2 = "Water Gun";
                    } else if (op2 < 41) {
                        opponentPokemonParty.get(0).setImportPokemonData("Rattata",randomNumberRange(2,4));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Quick Attack";
                        opponentPokemonParty.get(0).move2 = "Tackle";
                    } else if (op2 < 71) {
                        opponentPokemonParty.get(0).setImportPokemonData("Pidgey",randomNumberRange(2,4));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Tackle";
                        opponentPokemonParty.get(0).move2 = "Gust";
                    } else if (op2 <= 100) {
                        opponentPokemonParty.get(0).setImportPokemonData("Ekans",randomNumberRange(2,4));
                        opponentPokemonParty.get(0).remainingHp = opponentPokemonParty.get(0).hp;
                        opponentPokemonParty.get(0).move1 = "Wrap";
                        opponentPokemonParty.get(0).move2 = "Tackle";
                    }
                    System.out.println("A wild "+opponentPokemonParty.get(0).pokemonName+" has appeared!\n");
                    startBattle.mainBattleController();
                    break;
                case "2":
                    op1 = "";
                    op3 = randomNumberRange(minValue,maxValue);
                    switch (op3) {
                        case 1:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Youngster Joey> on the route, and challenged him to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Rattata",5);
                            opponentPokemonParty.get(0).move1 = "Tackle";
                            opponentPokemonParty.get(0).move2 = "Quick Attack";
                            opponentPokemonParty.get(1).setImportPokemonData("Rattata",5);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Quick Attack";
                            opponentPokemonParty.get(1).move2 = "Tackle";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                System.out.println();
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(26,38);
                            }
                            break;
                        case 2:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Birdkeeper !@#$%^&*()> on the route, and challenged her to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Pidgey",5);
                            opponentPokemonParty.get(0).move1 = "Quick Attack";
                            opponentPokemonParty.get(0).move2 = "Gust";
                            opponentPokemonParty.get(1).setImportPokemonData("Pidove",6);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Quick Attack";
                            opponentPokemonParty.get(1).move2 = "Peck";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(26,38);
                            }
                            break;
                        case 3:
                            op3 = 0;
                            op4 = false;
                            startBattle.trainer = true;
                            System.out.println("You found <Bugcatcher Cathrine> on the route, and challenged her to a duel!\n");
                            opponentPokemonParty.get(0).setImportPokemonData("Caterpie",5);
                            opponentPokemonParty.get(0).move1 = "Tackle";
                            opponentPokemonParty.get(0).move2 = "Bug Bite";
                            opponentPokemonParty.get(1).setImportPokemonData("Weedle",5);
                            opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                            opponentPokemonParty.get(1).move1 = "Poison Sting";
                            opponentPokemonParty.get(1).move2 = "Bug Bite";
                            opponentPokemonParty.get(2).setImportPokemonData("Surskit",5);
                            opponentPokemonParty.get(2).remainingHp = opponentPokemonParty.get(2).hp;
                            opponentPokemonParty.get(2).move1 = "Bubble";
                            opponentPokemonParty.get(2).move2 = "Bug Bite";
                            opponentPokemonParty.get(2).move3 = "Quick Attack";
                            op4 = startBattle.mainBattleController();
                            if (op4) {
                                n++;
                                playerBag.pokeDollars = playerBag.pokeDollars + randomNumberRangeForMoney(26,38);
                            }
                            break;
                    }
                    break;
                case "9":
                default:
                    System.out.println("Please make a valid choice.\n");
            }
        }
    }
    int randomNumberGenerator() {
        return ThreadLocalRandom.current().nextInt(1, 100+1); }
    int randomNumberRange(int minValue, int maxValue)
    { return ThreadLocalRandom.current().nextInt(minValue,maxValue+1); }
    int randomNumberRangeForMoney(int minValue, int maxValue) {
        int awardedPokeDollars = ThreadLocalRandom.current().nextInt(minValue,maxValue+1);
        System.out.println("You were awarded "+awardedPokeDollars+" p$!");
        return awardedPokeDollars; }
}
