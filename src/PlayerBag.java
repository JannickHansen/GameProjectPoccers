import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerBag {
    public List<String> nameOfItemsInInventory = new ArrayList<>();
    public List<Integer> numberOfItemsInInventory = new ArrayList<>();
    Scanner tastatur = new Scanner(System.in);
    List<Integer> itemSlotCounter;
    int pokeDollars;
    int pokeballs;
    int greatballs;
    int ultraballs;
    int potion;
    int superPotion;
    int hyperPotion;
    PlayerBag() {

        nameOfItemsInInventory.add("Pokeballs");
        nameOfItemsInInventory.add("Greatballs");
        nameOfItemsInInventory.add("Ultraballs");
        nameOfItemsInInventory.add("Potion");
        nameOfItemsInInventory.add("Super Potion");
        nameOfItemsInInventory.add("Hyper Potion");

        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
        numberOfItemsInInventory.add(0);
    }
    void printPlayerBag () {
        itemSlotCounter = new ArrayList<>();
        int i = 1;
        System.out.println("\nPlayer Bag\n");
        System.out.println("PokeDollars: "+pokeDollars+"\n");
        if (pokeballs > 0) {
            System.out.println(i + ". Pokeball x"+pokeballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Pokeball");
            numberOfItemsInInventory.set(i,pokeballs);
            i++;
        }
        if (greatballs > 0) {
            System.out.println(i + ". Greatball x"+greatballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Greatball");
            numberOfItemsInInventory.set(i,greatballs);
            i++;
        }
        if (ultraballs > 0) {
            System.out.println(i + ". Ultraball x"+ultraballs);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Ultraball");
            numberOfItemsInInventory.set(i,ultraballs);
            i++;
        }
        if (potion > 0) {
            System.out.println(i + ". Potion x"+potion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Potion");
            numberOfItemsInInventory.set(i,potion);
            i++;
        }
        if (superPotion > 0) {
            System.out.println(i + ". Super Potion x"+superPotion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Super Potion");
            numberOfItemsInInventory.set(i,superPotion);
            i++;

        }
        if (hyperPotion > 0) {
            System.out.println(i + ". Hyper Potion x"+hyperPotion);
            itemSlotCounter.add(i);
            nameOfItemsInInventory.set(i,"Hyper Potion");
            numberOfItemsInInventory.set(i,hyperPotion);
            i++;
        }
    }
    void printItemEffect(List<String> nameOfItemsInInventory)  {
        ItemDesciptions getItem = new ItemDesciptions();
        while (true) {
            System.out.println("\n9. to exit bag");
            System.out.println("Select item: ");
            int op1 = tastatur.nextInt();
            if (op1 == 9) break;
            if (!nameOfItemsInInventory.get(op1).isEmpty()) {
                System.out.println(nameOfItemsInInventory.get(op1));
                getItem.findItemDescription(nameOfItemsInInventory.get(op1));
            }

        }
    }
}

