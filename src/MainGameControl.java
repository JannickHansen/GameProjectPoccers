import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGameControl {
    GeneratedPokemon uniqueStarter = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent1 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent2 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent3 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent4 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent5 = new GeneratedPokemon();
    GeneratedPokemon uniqueOpponent6 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon2 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon3 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon4 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon5 = new GeneratedPokemon();
    GeneratedPokemon playerPokemon6 = new GeneratedPokemon();

    PickStarter pickStarter = new PickStarter(uniqueStarter, uniqueOpponent1);
    BattleController startBattle = new BattleController(uniqueStarter, playerPokemon2, playerPokemon3, playerPokemon4, playerPokemon5, playerPokemon6, uniqueOpponent1, uniqueOpponent2, uniqueOpponent3, uniqueOpponent4, uniqueOpponent5, uniqueOpponent6);
    OverworldControl overworldHub = new OverworldControl(uniqueStarter, playerPokemon2, playerPokemon3, playerPokemon4, playerPokemon5, playerPokemon6);
    MainGameControl() {
    }

    void mainGameHub() throws IOException { // no methods!
        pickStarter.selectionStart();
        startBattle.mainBattleController();
        pickStarter.postFirstBattle();
        overworldHub.overworldMenu();

        // Make route 1 functional, with random encounters + trainers
        // Make better OpponentAI and give it randomness // 50/50 to use best move etc
        // ADD PIPLUP
        // ADD SPHEAL
    }
}
