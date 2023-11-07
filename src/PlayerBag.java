import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PlayerBag {
    public static List<String> nameOfItemsInInventory = new ArrayList<>();
    public static List<Integer> numberOfItemsInInventory = new ArrayList<>();
    List<GeneratedPokemon> playerPokemonParty;
    public static List<Integer> itemSlotCounter = new ArrayList<>();
    Scanner tastatur = new Scanner(System.in);
    int pokeDollars = 0;
    PlayerBag(List<GeneratedPokemon> playerPokemonParty) {

        nameOfItemsInInventory.add("Pokeball");
        nameOfItemsInInventory.add("Greatball");
        nameOfItemsInInventory.add("Ultraball");
        nameOfItemsInInventory.add("Potion");
        nameOfItemsInInventory.add("Super Potion");
        nameOfItemsInInventory.add("Hyper Potion");
        nameOfItemsInInventory.add("Rare Candy");

        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);

        this.playerPokemonParty = playerPokemonParty;
    }
    void printPlayerBag () {
        int i = 1;
        System.out.println("\nPlayer Bag\n");
        System.out.println("PokeDollars: "+CM.getItems+pokeDollars+"p$"+CM.resetColour+"\n");
        if (numberOfItemsInInventory.get(0) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Pokeball"+ CM.resetColour+" x"+ numberOfItemsInInventory.get(0));
            nameOfItemsInInventory.set(0,"Pokeball");
            itemSlotCounter.add(0);
            i++;
        }
        if (numberOfItemsInInventory.get(1) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Greatball"+ CM.resetColour+" x"+numberOfItemsInInventory.get(1));
            nameOfItemsInInventory.set(1,"Greatball");
            itemSlotCounter.add(1);
            i++;
        }
        if (numberOfItemsInInventory.get(2) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Ultraball"+ CM.resetColour+" x"+numberOfItemsInInventory.get(2));
            nameOfItemsInInventory.set(2,"Ultraball");
            itemSlotCounter.add(2);
            i++;
        }
        if (numberOfItemsInInventory.get(3) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Potion"+ CM.resetColour+" x"+numberOfItemsInInventory.get(3));
            nameOfItemsInInventory.set(3,"Potion");
            itemSlotCounter.add(3);
            i++;
        }
        if (numberOfItemsInInventory.get(4) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Super Potion"+ CM.resetColour+" x"+numberOfItemsInInventory.get(4));
            nameOfItemsInInventory.set(4,"Super Potion");
            itemSlotCounter.add(4);
            i++;

        }
        if (numberOfItemsInInventory.get(5) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Hyper Potion"+ CM.resetColour+" x"+numberOfItemsInInventory.get(5));
            nameOfItemsInInventory.set(5,"Hyper Potion");
            itemSlotCounter.add(5);
            i++;
        }
        if (numberOfItemsInInventory.get(6) > 0) {
            System.out.println(i + ". "+ CM.getItems+"Rare Candy"+ CM.resetColour+" x"+numberOfItemsInInventory.get(6));
            nameOfItemsInInventory.set(6,"Rare Candy");
            itemSlotCounter.add(6);
            i++;
        }
    }
    void printItemEffect(List<String> nameOfItemsInInventory) throws IOException {
        ItemDesciptions getItem = new ItemDesciptions();

        while (true) {
            System.out.println("\n9. to exit bag");
            System.out.print("Select Item: ");

            try {
                int itemIndex = tastatur.nextInt();

                if (itemIndex == 9) {
                    break;
                }
                itemIndex = itemSlotCounter.get(itemIndex - 1);

                if (itemIndex >= 0 && itemIndex < numberOfItemsInInventory.size() && numberOfItemsInInventory.get(itemIndex) > 0) {
                    String itemName = nameOfItemsInInventory.get(itemIndex);
                    getItem.findItemDescription(itemName);
                    if (itemName.equals("Rare Candy") && numberOfItemsInInventory.get(6) > 0) {
                        useRareCandy();
                    }
                } else {
                    System.out.println("\nPlease make a valid choice.\n");
                }

                printPlayerBag();
            } catch (InputMismatchException e) {
                System.out.println("\nPlease make a valid choice.\n");
                tastatur.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nPlease make a valid choice.\n");
            }
        }
    }
        void levelUp (GeneratedPokemon insertPokemon) throws IOException {
            PokemonLearnSet getMoves = new PokemonLearnSet();
            insertPokemon.StatGainLevelUp(insertPokemon);
            getMoves.LearnSet(insertPokemon);
            System.out.println(insertPokemon);
            System.out.println("Press a to continue");
            tastatur.next();
        }
        public String spellingControl (String str){
            if (str == null || str.isEmpty()) return str;
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        void useRareCandy () throws IOException {
        while (true) {
        System.out.println("Will you use this item? (Yes / No)");
            String op2 = tastatur.next();
            op2 = spellingControl(op2);
            if (op2.equals("No")) {
                break;
            } else if (op2.equals("Yes")) {
                int op3;
                System.out.println("\nSelect a pokemon:");
                for (int i = 0; i < playerPokemonParty.size(); i++) {
                    System.out.println((i + 1) + ". " + CM.cM(playerPokemonParty.get(i).pokemonType1) + playerPokemonParty.get(i).pokemonName + CM.resetColour);
                }
                op3 = tastatur.nextInt() -1;
                playerPokemonParty.get(op3).exp = playerPokemonParty.get(op3).expToNextLvl;
                numberOfItemsInInventory.set(6, numberOfItemsInInventory.get(6) - 1);
                levelUp(playerPokemonParty.get(op3));
                break;
            }
        }
    }
}

