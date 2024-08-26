import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonListStatRead {
    int atk;
    int def;
    int spd;
    int hp;
    String name;
    String pokemonType1;
    String pokemonType2;
    int expYield;
    int catchRate;
    PokemonListStatRead(String name) {
        this.name = name;
    }
    public void getBasePokemon(ArrayList<String> foundPokemon) {
        String baseatk = extractData(foundPokemon.get(0), 1);
        String basedef = extractData(foundPokemon.get(0),2);
        String basespd = extractData(foundPokemon.get(0), 3);
        String basehp = extractData(foundPokemon.get(0),4);

        pokemonType1 = extractData(foundPokemon.get(0), 5);
        pokemonType2 = extractData(foundPokemon.get(0), 6);

        String baseExpYield = extractData(foundPokemon.get(0),7);
        String baseCatchRate = extractData(foundPokemon.get(0), 8);

        atk = ConvertReadStats.convert(baseatk);
        def = ConvertReadStats.convert(basedef);
        spd = ConvertReadStats.convert(basespd);
        hp = ConvertReadStats.convert(basehp);
        expYield = ConvertReadStats.convert(baseExpYield);
        catchRate = ConvertReadStats.convert(baseCatchRate);
    }

    public ArrayList<String> getPokemon(String name) throws IOException {
        FileReader pokemonList = new FileReader("PokemonList.txt");
        BufferedReader readIn = new BufferedReader(pokemonList);
        ArrayList<String> foundPokemon = new ArrayList<>();
        String line;
        while ((line = readIn.readLine()) != null) {
            if (line.contains(name)) {
                //System.out.println(line); // testlinje
                foundPokemon.add(line);
            }
        }
        readIn.close();
        return foundPokemon;
    }
    public String extractData(String basePokemon, int i) {
        String[] parts = basePokemon.split(",");
        return parts[i];
    }
}
