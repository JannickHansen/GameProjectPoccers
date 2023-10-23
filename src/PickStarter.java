import java.io.IOException;
import java.util.Scanner;

public class PickStarter {
    String opposingPokemon = "";
    int firstBattleLevel = 5;
    GeneratedPokemon uniqueStarter;
    GeneratedPokemon uniqueOpponent;
    Scanner tastatur = new Scanner(System.in);
    String starterPick;
    String op2;
    boolean op3 = false;
    PickStarter(GeneratedPokemon uniqueStarter, GeneratedPokemon uniqueOpponent){
        this.uniqueStarter = uniqueStarter;
        this.uniqueOpponent = uniqueOpponent;
    }
    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    void setImportData(GeneratedPokemon inputPokemon, String pokemonName) throws IOException {
        inputPokemon.setImportPokemonData(pokemonName,firstBattleLevel);
        PokemonLearnSet getLearnSet = new PokemonLearnSet();
        getLearnSet.LearnSet(uniqueStarter);
    }
    static void printSummery(GeneratedPokemon inputPokemon) {
        System.out.println(inputPokemon);
        System.out.println();
    }
    void selectionStart() throws IOException {
        System.out.println("Welcome to project1.");
        System.out.println("During your playthrough you will be able to have 1 pokemon in your party.");
        System.out.println("Please note that pokemon Type does matter in this game in regards to combat.");

        while (true) {
            if (op3) break;
            System.out.println("Please choose one among these starter-pokemon to join you on your journey!");
            System.out.println("Charmander  - Type: Fire    - Level: 5");
            System.out.println("Squirtle    - Type: Water   - Level: 5");
            System.out.println("Bulbasaur   - Type: Grass   - Level: 5");
            System.out.print("Please write the name of the pokemon you choose: ");
            System.out.println();
            starterPick = spellingControl(tastatur.next());
            if (starterPick.equals("Charmander") || starterPick.equals("Squirtle") || starterPick.equals("Bulbasaur")) {
                pickStarter(starterPick);
                setImportData(uniqueStarter, starterPick); //Sets unique stats for "uniqueStarter"
                printSummery(uniqueStarter);  //Summery to show player what pokemon they've got

                System.out.println("Now that you have your pokemon, let's try battling.");

                System.out.println("Press a to continue.");
                op2 = tastatur.next();

                firstBattle();
                setImportData(uniqueOpponent, opposingPokemon);
                PokemonLearnSet getMoves = new PokemonLearnSet();
                getMoves.LearnSet(uniqueOpponent);
                break;
            } else
                System.out.println("\nPlease make a valid choice.\n");
        }
    }

    void pickStarter(String op1) {
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
    void firstBattle() {
        switch (starterPick) {
            case "Charmander" -> opposingPokemon = "Squirtle";
            case "Squirtle" -> opposingPokemon = "Bulbasaur";
            case "Bulbasaur" -> opposingPokemon = "Charmander";
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
        System.out.println("Now its time for you to proceed to route 1!");
        System.out.println("Good luck\n");
    }
}
