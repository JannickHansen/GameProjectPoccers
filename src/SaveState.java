import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveState {
    SaveState () {
    }
    public void SaveStateSave(List<GeneratedPokemon> playerPokemonParty, PlayerBag playerBag, RouteController unlockedRoute, PokemonGym unlockedGym) throws IOException {
        FileWriter fil = new FileWriter("SaveState.txt");
        BufferedWriter bw = new BufferedWriter(fil);
        PrintWriter ud = new PrintWriter(bw);

        for (int i = 0; i < 5; i++) {
            GeneratedPokemon readPokemon = playerPokemonParty.get(i);
            ud.print(readPokemon.pokemonName+","+readPokemon.lvl+","+readPokemon.expToNextLvl+","+readPokemon.exp+","+readPokemon.atk+","+readPokemon.def+","+readPokemon.spd+","+readPokemon.hp+","+readPokemon.pokemonType1+","+readPokemon.pokemonType2+","+readPokemon.IVAtk+","+readPokemon.IVDef+","+readPokemon.IVSpd+","+readPokemon.IVHp+","+readPokemon.natureStatsAtk+","+readPokemon.natureStatsDef+","+readPokemon.natureStatsSpd+","+readPokemon.pokemonNature+","+readPokemon.move1+","+readPokemon.move2+","+readPokemon.move3+","+readPokemon.move4+","+readPokemon.expYield+","+readPokemon.catchRate+","+readPokemon.basePower1+","+readPokemon.basePower2+","+readPokemon.basePower3+","+readPokemon.basePower4+","+readPokemon.hasBeenGenerated+",");
        }
        ud.print(playerBag.pokeDollars+",");

        for (Integer l : playerBag.getNumberOfItemsInInventory()) {
            ud.print(l+",");
        }
        ud.print(unlockedRoute.route1+","+unlockedRoute.route2+","+unlockedRoute.route3+","+unlockedRoute.route4+","+unlockedRoute.route5+","+unlockedRoute.route6+","+unlockedRoute.route7+","+unlockedRoute.route8+","+unlockedRoute.well+","+unlockedRoute.mayVilleFarm+",");
        ud.print(unlockedGym.pokemonGym1+","+unlockedGym.pokemonGym2+","+unlockedGym.pokemonGym3+","+unlockedGym.pokemonGym4+","+unlockedGym.pokemonGym5+","+unlockedGym.pokemonGym6+","+unlockedGym.pokemonGym7+","+unlockedGym.pokemonGym8+",");
        ud.close();
    }

    public void SaveStateLoad(List<GeneratedPokemon> playerPokemonParty, PlayerBag playerBag, RouteController unlockedRoute, PokemonGym unlockedGym) throws IOException {
        FileReader pokemonList = new FileReader("SaveState.txt");
        BufferedReader readIn = new BufferedReader(pokemonList);
        String line = readIn.readLine();

        int currentLocation = 0;

        for (int i = 0; i < 5; i++) {

            playerPokemonParty.get(i).pokemonName = extractData(line, currentLocation++);
            playerPokemonParty.get(i).lvl = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).expToNextLvl = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).exp = ConvertReadStats.convert(extractData(line, currentLocation++));

            playerPokemonParty.get(i).atk = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).def = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).spd = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).hp = ConvertReadStats.convert(extractData(line, currentLocation++));

            playerPokemonParty.get(i).pokemonType1 = extractData(line, currentLocation++);
            playerPokemonParty.get(i).pokemonType2 = extractData(line, currentLocation++);

            playerPokemonParty.get(i).IVAtk = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).IVDef = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).IVSpd = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).IVHp = ConvertReadStats.convert(extractData(line, currentLocation++));

            playerPokemonParty.get(i).natureStatsAtk = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).natureStatsDef = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).natureStatsSpd = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).pokemonNature = extractData(line, currentLocation++);

            playerPokemonParty.get(i).move1 = extractData(line, currentLocation++);
            playerPokemonParty.get(i).move2 = extractData(line, currentLocation++);
            playerPokemonParty.get(i).move3 = extractData(line, currentLocation++);
            playerPokemonParty.get(i).move4 = extractData(line, currentLocation++);

            playerPokemonParty.get(i).expYield = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).catchRate = ConvertReadStats.convert(extractData(line, currentLocation++));

            playerPokemonParty.get(i).basePower1 = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).basePower2 = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).basePower3 = ConvertReadStats.convert(extractData(line, currentLocation++));
            playerPokemonParty.get(i).basePower4 = ConvertReadStats.convert(extractData(line, currentLocation++));

          playerPokemonParty.get(i).hasBeenGenerated = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
          currentLocation++;

        }

        playerBag.pokeDollars = ConvertReadStats.convert(extractData(line,currentLocation));
        currentLocation++;

        for (int i = 0; i < 7; i++) {
            playerBag.setNumberOfItemsInInventory(i, ConvertReadStats.convert(extractData(line,currentLocation)));
            currentLocation++;
        }

        unlockedRoute.route1 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route2 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route3 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route4 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route5 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route6 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route7 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.route8 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.well = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedRoute.mayVilleFarm = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;

        unlockedGym.pokemonGym1 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym2 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym3 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym4 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym5 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym6 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym7 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);
        currentLocation++;
        unlockedGym.pokemonGym8 = convertBoolean.getOrDefault(extractData(line,currentLocation),false);

    }
    public String extractData(String line, int i) {
        String[] parts = line.split(",");
        return parts[i];
    }

    private static final Map<String, Boolean> convertBoolean = new HashMap<>();
    static {
        convertBoolean.put("true",true);
        convertBoolean.put("false",false);
    }
}
