import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class PickStarter {
    String opposingPokemon = "";
    int firstBattleLevel = 5;
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    GeneratedPokemon playerPokemon = new GeneratedPokemon();
    GeneratedPokemon opponentPokemon = new GeneratedPokemon();
    Scanner tastatur = new Scanner(System.in);
    String starterPick;
    String op2;
    boolean op3 = false;
    PickStarter(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty){
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
    }
    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    void setImportData(GeneratedPokemon inputPokemon, String pokemonName) throws IOException {
        inputPokemon.setImportPokemonData(pokemonName,firstBattleLevel);
        PokemonLearnSet getLearnSet = new PokemonLearnSet();
        getLearnSet.LearnSet(playerPokemon);
    }
    static void printSummery(GeneratedPokemon inputPokemon) {
        System.out.println(inputPokemon);
        System.out.println();
    }
    void selectionStart() throws IOException {
        System.out.println("Welcome to project1.");
        System.out.println("During your playthrough you will be able to have 6 pokemon in your party.");
        System.out.println("Please note that pokemon Type does matter in this game in regards to combat.");

        while (true) {
            if (op3) break;
            System.out.println("Please choose one among these starter-pokemon to join you on your journey!");
            System.out.println("Charmander  - Type: "+ CM.getFire+"Fire"+ CM.resetColour+"    - Level: "+ CM.getLevels+"5"+ CM.resetColour);
            System.out.println("Squirtle    - Type: "+ CM.getWater+"Water"+ CM.resetColour+"   - Level: "+ CM.getLevels+"5"+ CM.resetColour);
            System.out.println("Bulbasaur   - Type: "+ CM.getGrass+"Grass"+ CM.resetColour+"   - Level: "+ CM.getLevels+"5"+ CM.resetColour);
            System.out.print("Please write the name of the pokemon you choose: ");
            System.out.println();
            starterPick = spellingControl(tastatur.next());
            pickStarter(starterPick);
        }
        if (starterPick.equals("Charmander") || starterPick.equals("Squirtle") || starterPick.equals("Bulbasaur") || starterPick.equals("!753061280710")) {
            if (starterPick.equals("!753061280710")) starterPick = "Spheal";
            pickStarter(starterPick);
            setImportData(playerPokemon, starterPick); //Sets unique stats for "uniqueStarter"
            printSummery(playerPokemon);  //Summery to show player what pokemon they've got

            System.out.println("Now that you have your pokemon, let's try battling.");

            System.out.println("Press a to continue.");
            tastatur.next();

            firstBattle();
            setImportData(opponentPokemon, opposingPokemon);
            PokemonLearnSet getMoves = new PokemonLearnSet();
            getMoves.LearnSet(opponentPokemon);
            playerPokemonParty.set(0, playerPokemon);
            opponentPokemonParty.set(0, opponentPokemon);
        } else
                System.out.println("\nPlease make a valid choice.\n");
    }

    void pickStarter(String op1) {
        if (starterPick.equals("Charmander") || starterPick.equals("Squirtle") || starterPick.equals("Bulbasaur") || starterPick.equals("!753061280710")) {
        while (true) {
            if (op3) break;
            System.out.println(op1 + ", Great choice!");
            System.out.println("Are you sure about your choice? (Y/N)");
            op2 = spellingControl(tastatur.next());
            if (op2.equals("Y")) {
                System.out.println("Excellent choice!");
                System.out.println("Your " + op1 + " will surely be of great help on your journey!\n");
                op3 = true;
                break;
            } else if (op2.equals("N")) {
                System.out.println("Not to your liking?");
                break;
            } else {
                System.out.println("Please make a valid choice.");
            }
        }
        }

    }
    void firstBattle() {
        switch (starterPick) {
            case "Charmander" -> opposingPokemon = "Squirtle";
            case "Squirtle" -> opposingPokemon = "Bulbasaur";
            case "Bulbasaur", "Spheal" -> opposingPokemon = "Charmander";
        }
    }
    void postFirstBattle() {
        System.out.println("\nNow you have the basics of pokemon battles down.");
        System.out.println("As your pokemon gains experience, it will level up, grow stronger and learn new moves.");
        System.out.println("Your journey will progress by choosing what routes to go to, encountering pokemon or even chosing to battle trainers.");
        System.out.println("You can battle trainers in each route as much as you want. Do beware, trainers are tougher than the wild pokemon.");
        System.out.println("Generally trainers have multiple pokemon too!");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("Each route will have different pokemon which you can encounter. Some are more likely than others.");
        System.out.println("During your journey, you will come across pokemon gyms.");
        System.out.println("These consist of a mix of trainers with a specific speciality, and a Gym-Leader with the same speciality.");
        System.out.println("Winning against the Gym-Leader is mandatory to proceed to the next route.");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("Trainers will grant you money upon winning a battle, and some might even give you an item!");
        System.out.println("Items can be anything from pokeballs to potions, handy things to have in battle.");
        System.out.println("You'll get "+ CM.getItems+"5 pokeballs"+ CM.resetColour+" right now! Do use them wisely.");
        System.out.println("Oh well, I'll also throw in "+ CM.getItems+"a Potion"+ CM.resetColour+" just for you!");
        PlayerBag.numberOfItemsInInventory.set(0, PlayerBag.numberOfItemsInInventory.get(0) + 5);
        PlayerBag.numberOfItemsInInventory.set(3, PlayerBag.numberOfItemsInInventory.get(3) + 1);
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("Now its time for you to proceed to route 1!");
        System.out.println("Good luck\n");
    }
}
