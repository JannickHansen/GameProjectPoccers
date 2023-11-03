import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainGameControl {
    List<GeneratedPokemon> playerPokemonParty = new ArrayList<>();
    List<GeneratedPokemon> opponentPokemonParty = new ArrayList<>();
    PlayerBag playerBag = new PlayerBag();
    GeneratedPokemon uniqueOpponent1 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent2 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent3 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent4 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent5 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent6 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon1 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon2 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon3 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon4 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon5 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon6 = new GeneratedPokemon();
    PickStarter pickStarter = new PickStarter(playerPokemonParty, opponentPokemonParty, playerBag);
    BattleController startBattle = new BattleController(playerPokemonParty, opponentPokemonParty, playerBag);
    OverworldControl overworldHub = new OverworldControl(playerPokemonParty, opponentPokemonParty, playerBag);
    MainGameControl() {
    }

    void mainGameHub() throws IOException {
        initiateGame();
        pickStarter.selectionStart(); // 75306128
        startBattle.mainBattleController();
        pickStarter.postFirstBattle();
        overworldHub.overworldMenu();

        //MAIN PRIORITY LIST
        // ADD COLOUR TO ITEMS, MOVES, TYPES, POKEMON <-- TYPES, RED HP ETC
        // Create method which can be called whenever an item, pokemon or type is printed within that method, so that it can identify and change colour accordingly by itself.


        // POKEMALL

        // OTHER TO-DO LIST
        // Add legendary roaming pokemon - 1/1000 chance everywhere? release after certain gym? random route with 1/50 chance based on trainer comments post battle?
        // add a cave, poketower or something cool like that, forest? <-- make routes have themes regarding their pokemon
        // Add evolutions (mandatory evolution for now at a set level)
        // Make better OpponentAI and give it randomness // 50/50 to use best move etc
        // PIN MISSILE, FURY SWIPES MULTIPLE HITS EACH ROUND
        // SUPER FANG TAKES HALF THE OPPONENTS REMAINING HP <-- CODE THIS
        // BRINE DOUBLE DMG IF TARGET.REMAININGHP < 50%
    }
    void initiateGame() {

        playerPokemonParty.add(playerPokemon1);
        playerPokemonParty.add(playerPokemon2);
        playerPokemonParty.add(playerPokemon3);
        playerPokemonParty.add(playerPokemon4);
        playerPokemonParty.add(playerPokemon5);
        playerPokemonParty.add(playerPokemon6);

        opponentPokemonParty.add(uniqueOpponent1);
        opponentPokemonParty.add(uniqueOpponent2);
        opponentPokemonParty.add(uniqueOpponent3);
        opponentPokemonParty.add(uniqueOpponent4);
        opponentPokemonParty.add(uniqueOpponent5);
        opponentPokemonParty.add(uniqueOpponent6);
    }
}
