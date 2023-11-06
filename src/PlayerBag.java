import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerBag {
    public List<String> nameOfItemsInInventory = new ArrayList<>();
    public List<Integer> numberOfItemsInInventory = new ArrayList<>();
    List<GeneratedPokemon> playerPokemonParty;
    Scanner tastatur = new Scanner(System.in);
    List<Integer> itemSlotCounter;
    int pokeDollars = 0;
    int pokeballs = 0;
    int greatballs = 0;
    int ultraballs = 0;
    int potion = 0;
    int superPotion = 0;
    int hyperPotion = 0;
    int rareCandy = 0;
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
        itemSlotCounter = new ArrayList<>();
        int i = 1;
        System.out.println("\nPlayer Bag\n");
        System.out.println("PokeDollars: "+CM.getItems+pokeDollars+"p$"+CM.resetColour+"\n");
        if (pokeballs > 0) {
            System.out.println(i + ". "+ CM.getItems+"Pokeball"+ CM.resetColour+" x"+pokeballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Pokeball");
            numberOfItemsInInventory.set(i,pokeballs);
            i++;
        }
        if (greatballs > 0) {
            System.out.println(i + ". "+ CM.getItems+"Greatball"+ CM.resetColour+" x"+greatballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Greatball");
            numberOfItemsInInventory.set(i,greatballs);
            i++;
        }
        if (ultraballs > 0) {
            System.out.println(i + ". "+ CM.getItems+"Ultraball"+ CM.resetColour+" x"+ultraballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Ultraball");
            numberOfItemsInInventory.set(i,ultraballs);
            i++;
        }
        if (potion > 0) {
            System.out.println(i + ". "+ CM.getItems+"Potion"+ CM.resetColour+" x"+potion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Potion");
            numberOfItemsInInventory.set(i,potion);
            i++;
        }
        if (superPotion > 0) {
            System.out.println(i + ". "+ CM.getItems+"Super Potion"+ CM.resetColour+" x"+superPotion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Super Potion");
            numberOfItemsInInventory.set(i,superPotion);
            i++;

        }
        if (hyperPotion > 0) {
            System.out.println(i + ". "+ CM.getItems+"Hyper Potion"+ CM.resetColour+" x"+hyperPotion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Hyper Potion");
            numberOfItemsInInventory.set(i,hyperPotion);
            i++;
        }
        if (rareCandy > 0) {
            System.out.println(i + ". "+ CM.getItems+"Rare Candy"+ CM.resetColour+" x"+rareCandy);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Rare Candy");
            numberOfItemsInInventory.set(i,rareCandy);
            i++;
        }
    }
    void printItemEffect(List<String> nameOfItemsInInventory) throws IOException {
        ItemDesciptions getItem = new ItemDesciptions();
        
        while (true) {
            System.out.println("\n9. to exit bag");
            System.out.println("Select item: ");
            int op1 = tastatur.nextInt();
            if (op1 == 9) break;
            if (!nameOfItemsInInventory.get(op1).isEmpty() && numberOfItemsInInventory.get(op1) > 0) {
                System.out.println(CM.getItems + nameOfItemsInInventory.get(op1) + CM.resetColour);
                getItem.findItemDescription(nameOfItemsInInventory.get(op1));
                if (nameOfItemsInInventory.get(op1).equals("Rare Candy") && rareCandy > 0) {
                    useRareCandy();
                    numberOfItemsInInventory.set(op1, numberOfItemsInInventory.get(op1) - 1);
                    rareCandy--;
                }
            }
            printPlayerBag();
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
                levelUp(playerPokemonParty.get(op3));
                break;
            }
        }
    }
}

