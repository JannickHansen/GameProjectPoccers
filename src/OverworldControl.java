import javax.annotation.processing.Generated;
import java.io.IOException;
import java.util.Scanner;

public class OverworldControl {
    Scanner tastatur = new Scanner(System.in);
    GeneratedPokemon uniqueStarter;
    GeneratedPokemon playerPokemon2;
    GeneratedPokemon playerPokemon3;
    GeneratedPokemon playerPokemon4;
    GeneratedPokemon playerPokemon5;
    GeneratedPokemon playerPokemon6;
    RouteController unlockedRoute = new RouteController(uniqueStarter, playerPokemon2, playerPokemon3, playerPokemon4, playerPokemon5, playerPokemon6);
    String op1 = "";
    String op2 = "";
    OverworldControl(GeneratedPokemon uniqueStarter, GeneratedPokemon playerPokemon2, GeneratedPokemon playerPokemon3, GeneratedPokemon playerPokemon4, GeneratedPokemon playerPokemon5, GeneratedPokemon playerPokemon6) {
    this.uniqueStarter = uniqueStarter;
    this.playerPokemon2 = playerPokemon2;
    this.playerPokemon3 = playerPokemon3;
    this.playerPokemon4 = playerPokemon4;
    this.playerPokemon5 = playerPokemon5;
    this.playerPokemon6 = playerPokemon6;
    }
    void overworldMenu() throws IOException {
        while (true) {
            if (op1.equals("9")) break;
            op1 = " ";
            op2 = " ";

            while (true) {
                System.out.println("<Overworld Menu>\n");
                System.out.println("1. Pokemon Party Overview");
                System.out.println("2. Route Selection");
                System.out.println("3. Challenge Pokemon Gym");
                System.out.println("9 to quit game // dev command // ");
                op1 = tastatur.next();
                if (op1.equals("1") || op1.equals("2") || op1.equals("3") || op1.equals("9")) break;
                else System.out.println("\nPlease make a valid choice.\n");
            }
            switch (op1) {
                case "1":
                    while (true) {
                        if (op2.equals("9")) break;
                        op2 = "0";
                        System.out.println("\nSelect a Pokemon to see it's summary:");
                        System.out.println("1. " + uniqueStarter.pokemonName);
                        System.out.println("2. " + playerPokemon2.pokemonName);
                        System.out.println("3. " + playerPokemon3.pokemonName);
                        System.out.println("4. " + playerPokemon4.pokemonName);
                        System.out.println("5. " + playerPokemon5.pokemonName);
                        System.out.println("6. " + playerPokemon6.pokemonName);
                        System.out.println("9. Return to the <Overworld Menu>");
                        while (true) {
                            op2 = tastatur.next();
                            if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("6") || op2.equals("9"))
                                break;
                            else System.out.println("\nPlease make a valid choice.\n");
                        }
                    switch (op2) {
                        case "1":
                            if (uniqueStarter.hasBeenGenerated) {
                                System.out.println("\n"+uniqueStarter);
                            }
                            break;
                        case "2":
                            if (playerPokemon2.hasBeenGenerated) {
                                System.out.println(playerPokemon2);
                            } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                            break;
                        case "3":
                            if (playerPokemon3.hasBeenGenerated) {
                                System.out.println(playerPokemon3);
                            } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                            break;
                        case "4":
                            if (playerPokemon4.hasBeenGenerated) {
                                System.out.println(playerPokemon4);
                            } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                            break;
                        case "5":
                            if (playerPokemon5.hasBeenGenerated) {
                                System.out.println(playerPokemon5);
                            } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                            break;
                        case "6":
                            if (playerPokemon6.hasBeenGenerated) {
                                System.out.println(playerPokemon6);
                            } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                            break;
                        case "9":
                            break;
                    }
                }
            case "2":
                while (true) {
                    if (op2.equals("9")) break;
                    System.out.println("\nSelect Route:");
                    System.out.println("1. Route 1");
                    System.out.println("2. ");
                    System.out.println("3. ");
                    System.out.println("4. ");
                    System.out.println("5. ");
                    System.out.println("6. ");
                    System.out.println("9. Return to the <Overworld Menu>");
                    while (true) {
                        op2 = tastatur.next();
                        if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("6") || op2.equals("9"))
                            break;
                        else System.out.println("\nPlease make a valid choice.\n");
                    }
                    switch (op2) {
                        case "1":
                            unlockedRoute.routeOne(uniqueStarter, playerPokemon2, playerPokemon3, playerPokemon4, playerPokemon5, playerPokemon6);
                            break;
                        case "2":
                            if (!unlockedRoute.route2) {
                                System.out.println("You have not unlocked this Route yet.");
                                break;
                            }
                        case "3":
                            if (!unlockedRoute.route3) {
                                System.out.println("You have not unlocked this Route yet.");
                                break;
                            }
                        case "4":
                            if (!unlockedRoute.route4) {
                                System.out.println("You have not unlocked this Route yet.");
                                break;
                            }
                        case "6":
                            if (!unlockedRoute.route5) {
                                System.out.println("You have not unlocked this Route yet.");
                                break;
                            }
                        case "7":
                            if (!unlockedRoute.route6) {
                                System.out.println("You have not unlocked this Route yet.");
                                break;
                            }
                        case "9":
                            break;
                    }
                }
            case "3":
                break;
        }
        }
    }
}
