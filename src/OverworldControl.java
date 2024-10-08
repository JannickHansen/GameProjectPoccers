import java.io.IOException;
import java.sql.SQLOutput;
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
    SaveState ss = new SaveState();
    String op1 = "";
    String op2 = "";
    ArrayList<String> kennelList = new ArrayList<>();

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
                System.out.println("8. Save Game");
                System.out.println("9 to quit game"); // dev command
                op1 = tastatur.next();
                if (op1.equals("1") || op1.equals("2") || op1.equals("3") || op1.equals("4") || (op1.equals("5") && unlockedGym.pokemonGym1) || op1.equals("9") || op1.equals("8"))
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
                        printRouteInMenu(2, 2, unlockedRoute.route1);
                        printSpecialPlaces(3, unlockedGym.pokemonGym1, "Mayville Farm");
                        printSpecialPlaces(4, unlockedRoute.well, "Dark Well");
                        printRouteInMenu(5, 3, unlockedRoute.mayVilleFarm);
                        printRouteInMenu(6, 4, unlockedRoute.route4);
                        printRouteInMenu(7, 5, unlockedRoute.route5);
                        printRouteInMenu(8, 6, unlockedRoute.route6);
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
                                    unlockedRoute.mayVilleFarm(playerPokemonParty, opponentPokemonParty, playerBag);
                                } else {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "4":
                                if (unlockedRoute.well) {
                                    unlockedRoute.well(playerPokemonParty, opponentPokemonParty, playerBag);
                                } else {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "5":
                                if (unlockedRoute.mayVilleFarm) {
                                    unlockedRoute.routeThree(playerPokemonParty, opponentPokemonParty, playerBag);
                                } else {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "6":
                                if (!unlockedRoute.route6) {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "7":
                                if (!unlockedRoute.route7) {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "8":
                                if (!unlockedRoute.route8) {
                                    System.out.println("You have not unlocked this Route yet.");
                                }
                                break;
                            case "9":
                                break;
                        }
                    }
                    break;
                case "4": // POKEMON GYMS ARE MADE HERE
                    while (true) {
                        if (op2.equals("9")) break;
                        System.out.println("\nSelect Pokemon Gym:");
                        printGymInMenu(1, unlockedRoute.route2, CM.getNormal + "Normal" + CM.resetColour);
                        printGymInMenu(2, unlockedRoute.route3, CM.getGrass + "Grass"+ CM.resetColour);
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
                                if (unlockedRoute.route3) {
                                    unlockedGym.pokemonGym2(playerPokemonParty, opponentPokemonParty, playerBag);
                                    break;
                                } else
                                    System.out.println("You have not unlocked this Gym yet.");
                                break;
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
                        System.out.println("2. Poke-Kennel");
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
                            pokeKennelLayout();
                            break;
                        case "3":
                        case "4":
                        case "5":
                        case "9":
                    }
                    break;
                case "8":
                    System.out.println("Saving...");
                    ss.SaveStateSave(playerPokemonParty, playerBag, unlockedRoute, unlockedGym);
                    System.out.println("Your game has been saved.");
                    break;
            }
        }
    }

    void printRouteInMenu(int callNumber, int routeNumber, boolean route) {
        if (route) {
            System.out.println(callNumber + ". Route " + routeNumber);
        } else {
            System.out.println(callNumber + ". ");
        }
    }

    void printSpecialPlaces(int callNumber, boolean requirement, String nameOfPlace) {
        if (requirement) {
            System.out.println(callNumber + ". " + nameOfPlace);
        } else {
            System.out.println(callNumber + ". ");
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
            System.out.println("p$: " + CM.getItems + playerBag.pokeDollars + CM.resetColour + "\n");
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
                    int tempHold = 1;

                    switch (itemName) {
                        case "Pokeball":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(0);
                            PlayerBag.numberOfItemsInInventory.set(0, tempHold);
                            break;
                        case "Greatball":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(1);
                            PlayerBag.numberOfItemsInInventory.set(1, tempHold);
                            break;
                        case "Ultraball":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(2);
                            PlayerBag.numberOfItemsInInventory.set(2, tempHold);
                            break;
                        case "Potion":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(3);
                            PlayerBag.numberOfItemsInInventory.set(3, tempHold);
                            break;
                        case "Super Potion":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(4);
                            PlayerBag.numberOfItemsInInventory.set(4, tempHold);
                            break;
                        case "Hyper Potion":
                            tempHold = tempHold + PlayerBag.numberOfItemsInInventory.get(5);
                            PlayerBag.numberOfItemsInInventory.set(5, tempHold);
                            break;
                    }

                    System.out.println("You purchased a " + itemName + " for " + itemPrice + "p$!");
                } else {
                    System.out.println("You don't have enough money to purchase this item.");
                }
            }
        }
    }

    void pokeKennelLayout() throws IOException {
        ArrayList<String> kennelPokemon = new ArrayList<>();
        String op3;

        if (unlockedGym.pokemonGym2 && !kennelList.contains("Eevee")) {
            kennelPokemon.add("Eevee");
        }

        while (true) {
            System.out.println("\n<Poke-Kennel>\n");
            System.out.println("p$: " + CM.getItems + playerBag.pokeDollars + CM.resetColour + "\n");
            for (int i = 0; i < kennelPokemon.size(); i++) {
                System.out.println((i + 1) + ". " + kennelPokemon.get(i));
            }
            System.out.println("9. Return to <PokeMall>");
            op3 = tastatur.next();

            if (op3.equals("9")) {
                break;
            }

            int selectedItem = Integer.parseInt(op3) - 1;

            if (selectedItem >= 0 && selectedItem < kennelPokemon.size()) {
                String itemName = kennelPokemon.get(selectedItem);
                String savePokemonColour =" ";

                    switch (itemName) {
                        case "Eevee":
                            kennelList.add("Eevee");
                            kennelPokemon.remove(selectedItem);
                            savePokemonColour = "Normal";
                            if (playerPokemonParty.get(0).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(0).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(0).move1 = "Tackle";
                                playerPokemonParty.get(0).move2 = "Quick Attack";
                                playerPokemonParty.get(0).move3 = "Flail";
                            break;
                            } else if (playerPokemonParty.get(1).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(1).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(1).move1 = "Tackle";
                                playerPokemonParty.get(1).move2 = "Quick Attack";
                                playerPokemonParty.get(1).move3 = "Flail";
                                break;
                            } else if (playerPokemonParty.get(2).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(2).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(2).move1 = "Tackle";
                                playerPokemonParty.get(2).move2 = "Quick Attack";
                                playerPokemonParty.get(2).move3 = "Flail";
                                break;
                            } else if (playerPokemonParty.get(3).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(3).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(3).move1 = "Tackle";
                                playerPokemonParty.get(3).move2 = "Quick Attack";
                                playerPokemonParty.get(3).move3 = "Flail";
                                break;
                            } else if (playerPokemonParty.get(4).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(4).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(4).move1 = "Tackle";
                                playerPokemonParty.get(4).move2 = "Quick Attack";
                                playerPokemonParty.get(4).move3 = "Flail";
                                break;
                            } else if (playerPokemonParty.get(5).pokemonName.equals(" ") && !op3.equals("9")) {
                                playerPokemonParty.get(5).setImportPokemonData("Eevee", 15);
                                playerPokemonParty.get(5).move1 = "Tackle";
                                playerPokemonParty.get(5).move2 = "Quick Attack";
                                playerPokemonParty.get(5).move3 = "Flail";
                                break;
                            }
                    }
                System.out.println();
                System.out.println("You recieved the "+CM.cM(savePokemonColour)+itemName+CM.resetColour+"!");
                System.out.println("Please take good care of it.");
                System.out.println("Press a to continue");
                tastatur.next();
            }
        }
    }
    //hvis man vælger en pokemon, giv pokemon til party + tilføj til kennelList (liste over pokemon som spilleren har taget)
}
