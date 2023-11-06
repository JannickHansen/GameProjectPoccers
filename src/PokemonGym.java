import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PokemonGym {
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    PlayerBag playerBag;
    Scanner tastatur = new Scanner(System.in);
    boolean pokemonGym1 = false;
    boolean pokemonGym2 = false;
    boolean pokemonGym3 = false;
    boolean pokemonGym4 = false;
    boolean pokemonGym5 = false;
    boolean pokemonGym6 = false;
    boolean pokemonGym7 = false;
    boolean pokemonGym8 = false;
    PokemonGym(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) {
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
        this.playerBag = playerBag;
    }
    void pokemonGym1(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        boolean op4 = false;
        opponentPokemonParty.get(0).remainingHp = 0;
        opponentPokemonParty.get(1).remainingHp = 0;
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);

        System.out.println("Welcome to the first Pokemon Gym!");
        System.out.println("You will now face 2 trainers and a Gym Leader.");
        System.out.println("All 3 trainers will have to be defeated in a row to win the gym.");
        System.out.println("Your pokemon will be healed in between fights.");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("The speciality of this Pokemon Gym is: "+CM.getNormal+"Normal"+CM.resetColour+" Types!");
        System.out.println("Are you ready to start the challenge? (Yes / No)");
        while (true) {
            String op1 = tastatur.next();
            op1 = spellingControl(op1);
            if (op1.equals("Yes") && !pokemonGym1) {
                System.out.println("The first trainer of the challenge is <School Kid Martha>\n");
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Rattata",12);
                opponentPokemonParty.get(0).move1 = "Tackle";
                opponentPokemonParty.get(0).move2 = "Quick Attack";
                opponentPokemonParty.get(0).move3 = "Bite";
                opponentPokemonParty.get(1).setImportPokemonData("Eevee",12);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Take Down";
                opponentPokemonParty.get(1).move2 = "Shadow Ball";
                opponentPokemonParty.get(1).move3 = "Quick Attack";
                opponentPokemonParty.get(1).move4 = "Bite";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                System.out.println("\nGood job! You've beat the first trainer.");
                System.out.println("The second trainer of the challenge is <Youngster Brady>\n");
                System.out.println("Press a to continue");
                tastatur.next();
                opponentPokemonParty.get(0).remainingHp = 0;
                opponentPokemonParty.get(1).remainingHp = 0;
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Pidgeotto",12);
                opponentPokemonParty.get(0).move1 = "Twister";
                opponentPokemonParty.get(0).move2 = "Quick Attack";
                opponentPokemonParty.get(0).move3 = "Wing Attack";
                opponentPokemonParty.get(1).setImportPokemonData("Raticate",11);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Quick Attack";
                opponentPokemonParty.get(1).move2 = "Super Fang";
                opponentPokemonParty.get(1).move3 = "Bite";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                System.out.println("That's the gym trainers!");
                System.out.println("Up next is the Gym Leader <Bill the bull>");
                System.out.println("His signature "+CM.getNormal+"Taurus"+CM.resetColour+" have devestated plenty up-and-coming trainers.");
                System.out.println("Best of luck!");
                System.out.println("Press a to continue");
                tastatur.next();
                opponentPokemonParty.get(0).remainingHp = 0;
                opponentPokemonParty.get(1).remainingHp = 0;
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Buneary",12);
                opponentPokemonParty.get(0).move1 = "Fire Punch";
                opponentPokemonParty.get(0).move2 = "Ice Punch";
                opponentPokemonParty.get(0).move3 = "Thunder Punch";
                opponentPokemonParty.get(0).move4 = "Quick Attack";
                opponentPokemonParty.get(1).setImportPokemonData("Taurus",13);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Horn Attack";
                opponentPokemonParty.get(1).move2 = "Iron Head";
                opponentPokemonParty.get(1).move3 = "Bulldoze";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                pokemonGym1 = true;
                System.out.println("Well done, young'un!");
                System.out.println("Your journey have officially started.. I can't wait to see what you'll accomplish!");
                System.out.println("Press a to continue");
                tastatur.next();
                System.out.println("You were awarded "+CM.getItems+"176 p$"+CM.resetColour+"!");
                System.out.println("You were awarded "+CM.getItems+"a Super Potion"+CM.resetColour+".");
                playerBag.pokeDollars = playerBag.pokeDollars + 128;
                playerBag.superPotion = playerBag.superPotion + 1;
                System.out.println("Press a to continue");
                System.out.println("As you have now bested me, I shall grant you entrance to the "+CM.getItems+"pokeMall"+CM.resetColour+"!");
                System.out.println("The "+CM.getItems+"pokeMall"+CM.resetColour+" contains different shops with different items for sale.");
                System.out.println("This includes "+CM.getItems+"medicines"+CM.resetColour+", "+CM.getItems+"pokeballs"+CM.resetColour+" and even "+CM.getItems+"moveTMs"+CM.resetColour+"!");
                System.out.println("However, each Gym Badge you earn will slowly unlock the different items up for graps.");
                System.out.println("Press a to continue");
                System.out.println("You can find the pokeMall in the <Overworld Menu>");
                System.out.println("Now go on!");
                System.out.println("Press a to continue");
                tastatur.next();
                break;
            }
            else if (op1.equals("No")) {
                break;
            } else {
                System.out.println("Please write a valid response.");
            }
        }

    }
    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
