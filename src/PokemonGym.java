import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PokemonGym {
    List<GeneratedPokemon> playerPokemonParty;
    List<GeneratedPokemon> opponentPokemonParty;
    PlayerBag playerBag;
    Scanner tastatur = new Scanner(System.in);
    String op1;
    boolean pokemonGym1;
    boolean pokemonGym2;
    boolean pokemonGym3;
    boolean pokemonGym4;
    boolean pokemonGym5;
    boolean pokemonGym6;
    boolean pokemonGym7;
    boolean pokemonGym8;
    PokemonGym(List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) {
        this.playerPokemonParty = playerPokemonParty;
        this.opponentPokemonParty = opponentPokemonParty;
        this.playerBag = playerBag;
    }
    void pokemonGym1 (List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        boolean op4 = false;
        opponentPokemonParty.get(0).remainingHp = 0;
        opponentPokemonParty.get(1).remainingHp = 0;
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);

        System.out.println("Welcome to the first Pokemon Gym!");
        System.out.println("You will now face 2 trainers and a Gym Leader.");
        System.out.println("All 3 opponents will have to be defeated in a row to win the gym.");
        System.out.println("Your pokemon will be healed in between fights.");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("The speciality of this Pokemon Gym is: Normal Types!");
        System.out.println("Are you ready to start the challenge? (Yes / No)");
        while (true) {
            op1 = tastatur.nextLine();
            op1 = spellingControl(op1);
            if (op1.equals("Yes") && !pokemonGym1) {
                System.out.println("The first trainer of the challenge is <School Kid Martha>\n");
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Rattata",11);
                opponentPokemonParty.get(0).move1 = "Tackle";
                opponentPokemonParty.get(0).move2 = "Quick Attack";
                opponentPokemonParty.get(0).move3 = "Bite";
                opponentPokemonParty.get(1).setImportPokemonData("Eevee",11);
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
                System.out.println("His signature Taurus have devestated plenty up-and-coming trainers.");
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
                opponentPokemonParty.get(0).move3 = "Quick Attack";
                opponentPokemonParty.get(1).setImportPokemonData("Tauros",12);
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
                System.out.println("You were awarded 176 p$!");
                System.out.println("You were awarded "+CM.getItems+"a Super Potion"+CM.resetColour+".");
                playerBag.pokeDollars = playerBag.pokeDollars + 128;
                PlayerBag.numberOfItemsInInventory.set(4, PlayerBag.numberOfItemsInInventory.get(4) + 1);
                System.out.println("Press a to continue");
                System.out.println("As you have now bested me, I shall grant you entrance to the pokeMall!");
                System.out.println("The pokeMall contains different shops with different items for sale.");
                System.out.println("This includes "+CM.getItems+"medicines"+CM.resetColour+", "+CM.getItems+"pokeballs"+CM.resetColour+" and even "+CM.getItems+"moveTMs"+CM.resetColour+"!");
                System.out.println("However, each Gym Badge you earn will unlock more items up for graps.");
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
    void pokemonGym2 (List<GeneratedPokemon> playerPokemonParty, List<GeneratedPokemon> opponentPokemonParty, PlayerBag playerBag) throws IOException {
        boolean op4 = false;
        opponentPokemonParty.get(0).remainingHp = 0;
        opponentPokemonParty.get(1).remainingHp = 0;
        BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);

        System.out.println("Welcome to the second Pokemon Gym!");
        System.out.println("You will now face 3 trainers and a Gym Leader.");
        System.out.println("All 4 opponents will have to be defeated in a row to win the gym.");
        System.out.println("Your pokemon will be healed in between fights.");
        System.out.println("Press a to continue");
        tastatur.next();
        System.out.println("The speciality of this Pokemon Gym is: Grass Types!");
        System.out.println("Are you ready to start the challenge? (Yes / No)");
        while (true) {
            op1 = tastatur.nextLine();
            op1 = spellingControl(op1);
            if (op1.equals("Yes") && !pokemonGym2) {
                System.out.println("The first trainer of the challenge is <Backpacker Jim>\n");
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Lombre",20);
                opponentPokemonParty.get(0).move1 = "Fury Swipes";
                opponentPokemonParty.get(0).move2 = "Quick Attack";
                opponentPokemonParty.get(0).move3 = "Water Gun";
                opponentPokemonParty.get(0).move4 = "Mega Drain";
                opponentPokemonParty.get(1).setImportPokemonData("Gloom",21);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Vine Whip";
                opponentPokemonParty.get(1).move2 = "Leech Seed";
                opponentPokemonParty.get(1).move3 = "Mega Drain";
                opponentPokemonParty.get(1).move4 = "Acid";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                System.out.println("\nGood job! You've beat the first trainer.");
                System.out.println("The second trainer of the challenge is <Pretty Girl Britanny>\n");
                System.out.println("Press a to continue");
                tastatur.next();
                opponentPokemonParty.get(0).remainingHp = 0;
                opponentPokemonParty.get(1).remainingHp = 0;
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Ivysaur",23);
                opponentPokemonParty.get(0).move1 = "Bullet Seed";
                opponentPokemonParty.get(0).move2 = "Giga Drain";
                opponentPokemonParty.get(0).move3 = "Sludge";
                opponentPokemonParty.get(0).move4 = "Stomp";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                System.out.println("\nGood job! You've beat the second trainer.");
                System.out.println("The third trainer of the challenge is <Forest Enthusiast>\n");
                System.out.println("Press a to continue");
                tastatur.next();
                opponentPokemonParty.get(0).remainingHp = 0;
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Phantump",20);
                opponentPokemonParty.get(0).move1 = "Branch Poke";
                opponentPokemonParty.get(0).move2 = "Shadow Sneak";
                opponentPokemonParty.get(1).setImportPokemonData("Skiploom",21);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Air Cutter";
                opponentPokemonParty.get(1).move2 = "Bullet Seed";
                opponentPokemonParty.get(1).move3 = "Mega Drain";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                System.out.println("That's the gym trainers!");
                System.out.println("Up next is the Gym Leader <Florania>");
                System.out.println("Her sweet looks often make trainers underestimate just how strong the grass-type can be.");
                System.out.println("Best of luck!");
                System.out.println("Press a to continue");
                tastatur.next();
                opponentPokemonParty.get(0).remainingHp = 0;
                opponentPokemonParty.get(1).remainingHp = 0;
                startBattle.trainer = true;
                opponentPokemonParty.get(0).setImportPokemonData("Bellossom",23);
                opponentPokemonParty.get(0).move1 = "Mega Drain";
                opponentPokemonParty.get(0).move2 = "Energy Ball";
                opponentPokemonParty.get(0).move3 = "Recover";
                opponentPokemonParty.get(0).move4 = "Moonblast";
                opponentPokemonParty.get(1).setImportPokemonData("Trevenant",24);
                opponentPokemonParty.get(1).remainingHp = opponentPokemonParty.get(1).hp;
                opponentPokemonParty.get(1).move1 = "Horn Leech";
                opponentPokemonParty.get(1).move2 = "Shadow Claw";
                opponentPokemonParty.get(1).move3 = "Take Down";
                opponentPokemonParty.get(1).move4 = "Poison Jab";
                op4 = startBattle.mainBattleController();
                if (!op4) {
                    break;
                }
                pokemonGym2 = true;
                System.out.println("Well fought!");
                System.out.println("You overcame your biggest challenge so far, and have bested me.");
                System.out.println("Press a to continue");
                tastatur.next();
                System.out.println("You were awarded 651 p$!");
                System.out.println("You were awarded "+CM.getItems+"3 Super Potions"+CM.resetColour+".");
                playerBag.pokeDollars = playerBag.pokeDollars + 651;
                PlayerBag.numberOfItemsInInventory.set(4, PlayerBag.numberOfItemsInInventory.get(4) + 3);
                System.out.println("Press a to continue");
                System.out.println("As you have now defeated your second gym, the Pokemall will feature additional items, aswell as the Poke-kennel!");
                System.out.println("The Poke-kennel will occassionally offer pokemon up for adoption.");
                System.out.println("Those pokemon are usually not widely found in the wild.");
                System.out.println("You can find the Poke-kennel in the <Pokemall Menu>");
                System.out.println("Have a pleasant journey!");
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
