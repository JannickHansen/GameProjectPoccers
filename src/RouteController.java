import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RouteController {
    GeneratedPokemon uniqueStarter;
    Scanner tastatur = new Scanner(System.in);
    GeneratedPokemon opposingPokemon1 = new GeneratedPokemon();
    GeneratedPokemon opposingPokemon2 = new GeneratedPokemon();
    GeneratedPokemon opposingPokemon3 = new GeneratedPokemon();
    GeneratedPokemon opposingPokemon4 = new GeneratedPokemon();
    GeneratedPokemon opposingPokemon5 = new GeneratedPokemon();
    GeneratedPokemon opposingPokemon6 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon2;
    GeneratedPokemon playerPokemon3;
    GeneratedPokemon playerPokemon4;
    GeneratedPokemon playerPokemon5;
    GeneratedPokemon playerPokemon6;
    boolean route2 = false;
    boolean route3 = false;
    boolean route4 = false;
    boolean route5 = false;
    boolean route6 = false;
    String op1;
    int op2;
    int op3;
    RouteController(GeneratedPokemon uniqueStarter, GeneratedPokemon playerPokemon2, GeneratedPokemon playerPokemon3, GeneratedPokemon playerPokemon4, GeneratedPokemon playerPokemon5, GeneratedPokemon playerPokemon6) {
        this.uniqueStarter = uniqueStarter;
        this.playerPokemon2 = playerPokemon2;
        this.playerPokemon3 = playerPokemon3;
        this.playerPokemon4 = playerPokemon4;
        this.playerPokemon5 = playerPokemon5;
        this.playerPokemon6 = playerPokemon6;
    }

    void routeOne(GeneratedPokemon uniqueStarter, GeneratedPokemon playerPokemon2, GeneratedPokemon playerPokemon3, GeneratedPokemon playerPokemon4, GeneratedPokemon playerPokemon5, GeneratedPokemon playerPokemon6) throws IOException {
        BattleController startBattle = new BattleController(uniqueStarter, playerPokemon2, playerPokemon3, playerPokemon4, playerPokemon5, playerPokemon6, opposingPokemon1, opposingPokemon2, opposingPokemon3, opposingPokemon4, opposingPokemon5, opposingPokemon6);
        int minValue = 1;
        int maxValue = 4;
        op1 = "";
        op2 = 0;
        op3 = 0;
        while (true) {
            opposingPokemon1.remainingHp = 0;
            opposingPokemon2.remainingHp = 0;
            opposingPokemon3.remainingHp = 0;
            opposingPokemon4.remainingHp = 0;
            opposingPokemon5.remainingHp = 0;
            opposingPokemon6.remainingHp = 0;
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
                                opposingPokemon1.setImportPokemonData("Bidoof",randomNumberRange(3,5));
                                opposingPokemon1.remainingHp = opposingPokemon1.hp;
                                opposingPokemon1.move1 = "Tackle";
                                opposingPokemon1.move2 = "Bubble";
                            } else if (op2 < 41) {
                                opposingPokemon1.setImportPokemonData("Rattata",randomNumberRange(2,4));
                                opposingPokemon1.remainingHp = opposingPokemon1.hp;
                                opposingPokemon1.move1 = "Quick Attack";
                                opposingPokemon1.move2 = "Tackle";
                            } else if (op2 < 71) {
                                opposingPokemon1.setImportPokemonData("Pidgey",randomNumberRange(2,4));
                                opposingPokemon1.remainingHp = opposingPokemon1.hp;
                                opposingPokemon1.move1 = "Tackle";
                                opposingPokemon1.move2 = "Gust";
                            } else if (op2 <= 100) {
                                opposingPokemon1.setImportPokemonData("Ekans",randomNumberRange(2,4));
                                opposingPokemon1.remainingHp = opposingPokemon1.hp;
                                opposingPokemon1.move1 = "Wrap";
                                opposingPokemon1.move2 = "Tackle";
                            }
                        System.out.println("A wild "+opposingPokemon1.pokemonName+" has appeared!\n");
                        startBattle.mainBattleController();
                        break;
                    case "2":
                        op1 = "";
                        op3 = randomNumberRange(minValue,maxValue);
                        switch (op3) {
                            case 1:
                                op3 = 0;
                                System.out.println("You found <Youngster Joey> on the route, and challenged him to a duel!\n");
                                opposingPokemon1.setImportPokemonData("Rattata",5);
                                opposingPokemon1.move1 = "Tackle";
                                opposingPokemon1.move2 = "Quick Attack";
                                opposingPokemon2.setImportPokemonData("Rattata",5);
                                opposingPokemon2.remainingHp = opposingPokemon2.hp;
                                opposingPokemon2.move1 = "Quick Attack";
                                opposingPokemon2.move2 = "Tackle";
                                startBattle.mainBattleController();
                                break;
                            case 2:
                                op3 = 0;
                                System.out.println("You found <Birdkeeper Symbs on the route, and challenged her to a duel!\n");
                                opposingPokemon1.setImportPokemonData("Pidgey",5);
                                opposingPokemon1.move1 = "Quick Attack";
                                opposingPokemon1.move2 = "Gust";
                                opposingPokemon2.setImportPokemonData("Pidove",6);
                                opposingPokemon2.remainingHp = opposingPokemon2.hp;
                                opposingPokemon2.move1 = "Quick Attack";
                                opposingPokemon2.move2 = "Peck";
                                startBattle.mainBattleController();
                                break;
                            case 3:
                                op3 = 0;
                                System.out.println("You found <Bugcatcher Cathrine> on the route, and challenged her to a duel!\n");
                                opposingPokemon1.setImportPokemonData("Caterpie",5);
                                opposingPokemon1.move1 = "Tackle";
                                opposingPokemon1.move2 = "Bug Bite";
                                opposingPokemon2.setImportPokemonData("Weedle",5);
                                opposingPokemon2.remainingHp = opposingPokemon2.hp;
                                opposingPokemon2.move1 = "Poison Sting";
                                opposingPokemon2.move2 = "Bug Bite";
                                opposingPokemon3.setImportPokemonData("Surskit",5);
                                opposingPokemon3.remainingHp = opposingPokemon3.hp;
                                opposingPokemon3.move1 = "Bubble";
                                opposingPokemon3.move2 = "Bug Bite";
                                opposingPokemon3.move3 = "Quick Attack";
                                startBattle.mainBattleController();
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
}
