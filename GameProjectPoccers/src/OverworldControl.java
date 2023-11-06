import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverworldControl {
    Scanner tastatur = new Scanner(System.in);
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    PlayerBag playerBag;
    RouteController unlockedRoute = new RouteController(playerPokemonParty, opponentPokemonParty, playerBag);
    PokemonGym unlockedGym = new PokemonGym(playerPokemonParty, opponentPokemonParty, playerBag);
    String op1 = "";
    String op2 = "";

    OverworldControl(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) {
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
        this.playerBag = playerBag;
    }

    void overworldMenu() throws IOException {
        while (true) {
            if (op1.equals("9")) break;
            op1 = " ";
            op2 = " ";

            while (true) {
                System.out.println("\n<Overworld Menu>\n");
                System.out.println("1. Pokemon Party Overview");
                System.out.println("2. Bag");
                System.out.println("3. Route Selection");
                System.out.println("4. Challenge Pokemon Gym");
                if (unlockedGym.pokemonGym1) {
                    System.out.println("5. pokeMall");
                }
                System.out.println("9 to quit game // dev command // ");
                op1 = tastatur.next();
                if (op1.equals("1") || op1.equals("2") || op1.equals("3") || op1.equals("4") || (op1.equals("5") && unlockedGym.pokemonGym1) || op1.equals("9"))
                    break;
                else System.out.println("\nPlease make a valid choice.\n");
            }
            switch (op1) {
                case "1":
                    while (true) {
                        if (op2.equals("9")) break;
                        op2 = "0";
                        System.out.println("\nSelect a Pokemon to see it's summary:");
                        System.out.println("1. " + playerPokemonParty.get(0).pokemonName);
                        System.out.println("2. " + playerPokemonParty.get(1).pokemonName);
                        System.out.println("3. " + playerPokemonParty.get(2).pokemonName);
                        System.out.println("4. " + playerPokemonParty.get(3).pokemonName);
                        System.out.println("5. " + playerPokemonParty.get(4).pokemonName);
                        System.out.println("6. " + playerPokemonParty.get(5).pokemonName);
                        System.out.println("9. Return to the <Overworld Menu>");
                        while (true) {
                            op2 = tastatur.next();
                            if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("6") || op2.equals("9"))
                                break;
                            else System.out.println("\nPlease make a valid choice.\n");
                        }
                        switch (op2) {
                            case "1":
                                if (playerPokemonParty.get(0).hasBeenGenerated) {
                                    System.out.println("\n" + playerPokemonParty.get(0));
                                }
                                break;
                            case "2":
                                if (playerPokemonParty.get(1).hasBeenGenerated) {
                                    System.out.println(playerPokemonParty.get(1));
                                } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                                break;
                            case "3":
                                if (playerPokemonParty.get(2).hasBeenGenerated) {
                                    System.out.println(playerPokemonParty.get(2));
                                } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                                break;
                            case "4":
                                if (playerPokemonParty.get(3).hasBeenGenerated) {
                                    System.out.println(playerPokemonParty.get(3));
                                } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                                break;
                            case "5":
                                if (playerPokemonParty.get(4).hasBeenGenerated) {
                                    System.out.println(playerPokemonParty.get(4));
                                } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                                break;
                            case "6":
                                if (playerPokemonParty.get(5).hasBeenGenerated) {
                                    System.out.println(playerPokemonParty.get(5));
                                } else System.out.println("\nYou do not have a pokemon to fill this slot yet.\n");
                                break;
                            case "9":
                                break;
                        }
                    }
                    break;
                case "2":
                    playerBag.printPlayerBag();
                    playerBag.printItemEffect(playerBag.nameOfItemsInInventory);
                    break;
                case "3":
                    while (true) {
                        if (op2.equals("9")) break;
                        System.out.println("\nSelect Route:");
                        System.out.println("1. Route 1");
                        printRouteInMenu(2, unlockedRoute.route1);
                        printRouteInMenu(3, unlockedGym.pokemonGym1);
                        printRouteInMenu(4, unlockedRoute.route3);
                        printRouteInMenu(5, unlockedRoute.route4);
                        printRouteInMenu(6, unlockedRoute.route5);
                        printRouteInMenu(7, unlockedRoute.route6);
                        printRouteInMenu(8, unlockedRoute.route7);
                        System.out.println("9. Return to the <Overworld Menu>");
                        while (true) {
                            op2 = tastatur.next();
                            if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("6") || op2.equals("9"))
                                break;
                            else System.out.println("\nPlease make a valid choice.\n");
                        }
                        switch (op2) {
                            case "1":
                                unlockedRoute.routeOne(playerPokemonParty, opponentPokemonParty, playerBag);
                                break;
                            case "2":
                                if (unlockedRoute.route1) {
                                    unlockedRoute.routeTwo(playerPokemonParty, opponentPokemonParty, playerBag);
                                } else {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "3":
                                if (unlockedGym.pokemonGym1) {
                                    unlockedRoute.routeThree(playerPokemonParty, opponentPokemonParty, playerBag);
                                } else {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "4":
                                if (!unlockedRoute.route4) {
                                    System.out.println("You have not unlocked this Route yet.");
                                    break;
                                }
                            case "5":
                                if (!unlockedRoute.route5) {
                                    System.out.println("You have not unlocked this Route yet.");
                                    break;
                                }
                            case "6":
                                if (!unlockedRoute.route6) {
                                    System.out.println("You have not unlocked this Route yet.");
                                    break;
                                }
                            case "7":
                                if (!unlockedRoute.route7) {
                                    System.out.println("You have not unlocked this Route yet.");
                                    break;
                                }
                            case "8":
                                if (!unlockedRoute.route8) {
                                    System.out.println("You have not unlocked this Route yet.");
                                    break;
                                }
                            case "9":
                                break;
                        }
                    }
                    break;
                case "4": // POKEMON GYMS ARE MADE HERE
                    while (true) {
                        if (op2.equals("9")) break;
                        System.out.println("\nSelect Pokemon Gym:");
                        printGymInMenu(1, unlockedRoute.route2, "Normal");
                        printGymInMenu(2, unlockedGym.pokemonGym2, "");
                        printGymInMenu(3, unlockedGym.pokemonGym3, "");
                        printGymInMenu(4, unlockedGym.pokemonGym4, "");
                        printGymInMenu(5, unlockedGym.pokemonGym5, "");
                        printGymInMenu(6, unlockedGym.pokemonGym6, "");
                        printGymInMenu(7, unlockedGym.pokemonGym7, "");
                        printGymInMenu(8, unlockedGym.pokemonGym8, "");
                        System.out.println("9. Return to the <Overworld Menu>");
                        while (true) {
                            op2 = tastatur.next();
                            if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("6") || op2.equals("9"))
                                break;
                            else System.out.println("\nPlease make a valid choice.\n");
                        }
                        switch (op2) {
                            case "1":
                                if (unlockedRoute.route2) {
                                    unlockedGym.pokemonGym1(playerPokemonParty, opponentPokemonParty, playerBag);
                                    break;
                                } else
                                    System.out.println("You have not unlocked this Gym yet.");
                                break;
                            case "2":
                                if (!unlockedGym.pokemonGym1) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            /*case "3":
                                if (!unlockedGym.unlockedGym3) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            case "4":
                                if (!unlockedGym.unlockedGym4) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            case "5":
                                if (!unlockedGym.unlockedGym5) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            case "6":
                                if (!unlockedGym.unlockedGym6) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            case "7":
                                if (!unlockedGym.unlockedGym7) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }
                            case "8":
                                if (!unlockedGym.unlockedGym8) {
                                    System.out.println("You have not unlocked this Gym yet.");
                                    break;
                                }*/
                            case "9":
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                    break;
                case "5":
                    while (true) {
                        System.out.println("\n<PokeMall>\n");
                        System.out.println("1. General Store");
                        System.out.println("2. Pokemon Kennel");
                        System.out.println("3. TM-Moves Store");
                        System.out.println("4. Evolution Stones Store");
                        System.out.println("5. Restaurant");
                        System.out.println("9. Return to the <Overworld Menu>");
                        op2 = tastatur.next();
                        if (op2.equals("1") || op2.equals("2") || op2.equals("3") || op2.equals("4") || op2.equals("5") || op2.equals("9"))
                            break;
                        else System.out.println("\nPlease make a valid choice.\n");
                    }
                    switch (op2) {
                        case "1":
                            generalStoreLayout();
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "9":
                    }
                    break;
            }
        }
    }

    void printRouteInMenu(int routeNumber, boolean route) {
        if (route) {
            System.out.println(routeNumber + ". Route " + routeNumber);
        } else {
            System.out.println(routeNumber + ". ");
        }
    }

    void printGymInMenu(int gymNumber, boolean gym, String gymType) {
        if (gym) {
            System.out.println(gymNumber + ". Pokemon Gym " + gymNumber + "(" + gymType + ")");
        } else {
            System.out.println(gymNumber + ". ");
        }
    }

    void generalStoreLayout() {
        ArrayList<String> storeItem = new ArrayList<>();
        ArrayList<Integer> storeItemPrice = new ArrayList<>();
        String op3;

        storeItem.add("Pokeball");
        storeItemPrice.add(50);

        if (unlockedGym.pokemonGym2) {
            storeItem.add("Greatball");
            storeItemPrice.add(100);
        }

        if (unlockedGym.pokemonGym5) {
            storeItem.add("Ultraball");
            storeItemPrice.add(175);
        }

        storeItem.add("Potion");
        storeItemPrice.add(50);

        if (unlockedGym.pokemonGym3) {
            storeItem.add("Super Potion");
            storeItemPrice.add(75);
        }

        if (unlockedGym.pokemonGym6) {
            storeItem.add("Hyper Potion");
            storeItemPrice.add(175);
        }

        while (true) {
            System.out.println("\n<General Store>\n");
            System.out.println("p$: "+CM.getItems+playerBag.pokeDollars+ CM.resetColour+ "\n");
            for (int i = 0; i < storeItem.size(); i++) {
                System.out.println((i + 1) + ". " + storeItem.get(i) + "\t" + storeItemPrice.get(i) + "p$");
            }
            System.out.println("9. Return to <PokeMall>");
            op3 = tastatur.next();

            if (op3.equals("9")) {
                break;
            }

            int selectedItem = Integer.parseInt(op3) - 1;

            if (selectedItem >= 0 && selectedItem < storeItem.size()) {
                String itemName = storeItem.get(selectedItem);
                int itemPrice = storeItemPrice.get(selectedItem);

                if (playerBag.pokeDollars >= itemPrice) {
                    playerBag.pokeDollars = playerBag.pokeDollars - itemPrice;

                    switch (itemName) {
                        case "Pokeball" -> playerBag.pokeballs++;
                        case "Greatball" -> playerBag.greatballs++;
                        case "Ultraball" -> playerBag.ultraballs++;
                        case "Potion" -> playerBag.potion++;
                        case "Super Potion" -> playerBag.superPotion++;
                        case "Hyper Potion" -> playerBag.hyperPotion++;
                    }

                    System.out.println("You purchased a " + itemName + " for " + itemPrice + "p$!");
                } else {
                    System.out.println("You don't have enough money to purchase this item.");
                }
            }
        }
    }
}
