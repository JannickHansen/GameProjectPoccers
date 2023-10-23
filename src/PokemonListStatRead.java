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
    String moveID1;
    int movePower1;
    String moveType1;
    String moveID2;
    int movePower2;
    String moveType2;
    String moveID3;
    int movePower3;
    String moveType3;
    String moveID4;
    int movePower4;
    String moveType4;
    String pokemonType1;
    String pokemonType2;
    int expYield;
    PokemonListStatRead(String name) {
        this.name = name;
    }
    public void getBasePokemon(ArrayList<String> foundPokemon) throws IOException {
        //name = extractData(foundPokemon.get(0),0 );
        String baseatk = extractData(foundPokemon.get(0), 1);
        String basedef = extractData(foundPokemon.get(0),2);
        String basespd = extractData(foundPokemon.get(0), 3);
        String basehp = extractData(foundPokemon.get(0),4);

        /*moveID1 = callMove(extractData(foundPokemon.get(0),5)).moveName;
        movePower1 = callMove(extractData(foundPokemon.get(0),5)).basePower;
        moveType1 = callMove(extractData(foundPokemon.get(0), 5)).moveType;
        moveID2 = callMove(extractData(foundPokemon.get(0),6)).moveName;
        movePower2 = callMove(extractData(foundPokemon.get(0),6)).basePower;
        moveType2 = callMove(extractData(foundPokemon.get(0), 6)).moveType;
        moveID3 = callMove(extractData(foundPokemon.get(0),7)).moveName;
        movePower3 = callMove(extractData(foundPokemon.get(0),7)).basePower;
        moveType3 = callMove(extractData(foundPokemon.get(0), 8)).moveType;
        moveID4 = callMove(extractData(foundPokemon.get(0),8)).moveName;
        movePower4 = callMove(extractData(foundPokemon.get(0),8)).basePower;
        moveType4 = callMove(extractData(foundPokemon.get(0), 8)).moveType;*/

        pokemonType1 = extractData(foundPokemon.get(0), 5);
        pokemonType2 = extractData(foundPokemon.get(0), 6);

        String baseExpYield = extractData(foundPokemon.get(0),7);

        atk = convertReadStats.getOrDefault(baseatk, 0);
        def = convertReadStats.getOrDefault(basedef, 0);
        spd = convertReadStats.getOrDefault(basespd, 0);
        hp = convertReadStats.getOrDefault(basehp, 0);
        expYield = convertReadStats.getOrDefault(baseExpYield,0);

    }
    /*public PokemonMoveList callMove(String moveID) throws IOException {
        PokemonMoveList findMove = new PokemonMoveList(moveID);
        findMove.getMoveData(findMove.getMove(moveID));

        return findMove;
    }*/

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
    private static final Map<String, Integer> convertReadStats = new HashMap<>();
    static {
        convertReadStats.put("1", 1);
        convertReadStats.put("2", 2);
        convertReadStats.put("3", 3);
        convertReadStats.put("4", 4);
        convertReadStats.put("5", 5);
        convertReadStats.put("6", 6);
        convertReadStats.put("7", 7);
        convertReadStats.put("8", 8);
        convertReadStats.put("9", 9);
        convertReadStats.put("10", 10);
        convertReadStats.put("11", 11);
        convertReadStats.put("12", 12);
        convertReadStats.put("13", 13);
        convertReadStats.put("14", 14);
        convertReadStats.put("15", 15);
        convertReadStats.put("16", 16);
        convertReadStats.put("17", 17);
        convertReadStats.put("18", 18);
        convertReadStats.put("19", 19);
        convertReadStats.put("20", 20);
        convertReadStats.put("21", 21);
        convertReadStats.put("22", 22);
        convertReadStats.put("23", 23);
        convertReadStats.put("24", 24);
        convertReadStats.put("25", 25);
        convertReadStats.put("26", 26);
        convertReadStats.put("27", 27);
        convertReadStats.put("28", 28);
        convertReadStats.put("29", 29);
        convertReadStats.put("30", 30);
        convertReadStats.put("31", 31);
        convertReadStats.put("32", 32);
        convertReadStats.put("33", 33);
        convertReadStats.put("34", 34);
        convertReadStats.put("35", 35);
        convertReadStats.put("36", 36);
        convertReadStats.put("37", 37);
        convertReadStats.put("38", 38);
        convertReadStats.put("39", 39);
        convertReadStats.put("40", 40);
        convertReadStats.put("41", 41);
        convertReadStats.put("42", 42);
        convertReadStats.put("43", 43);
        convertReadStats.put("44", 44);
        convertReadStats.put("45", 45);
        convertReadStats.put("46", 46);
        convertReadStats.put("47", 47);
        convertReadStats.put("48", 48);
        convertReadStats.put("49", 49);
        convertReadStats.put("50", 50);
        convertReadStats.put("51", 51);
        convertReadStats.put("52", 52);
        convertReadStats.put("53", 53);
        convertReadStats.put("54", 54);
        convertReadStats.put("55", 55);
        convertReadStats.put("56", 56);
        convertReadStats.put("57", 57);
        convertReadStats.put("58", 58);
        convertReadStats.put("59", 59);
        convertReadStats.put("60", 60);
        convertReadStats.put("61", 61);
        convertReadStats.put("62", 62);
        convertReadStats.put("63", 63);
        convertReadStats.put("64", 64);
        convertReadStats.put("65", 65);
        convertReadStats.put("66", 66);
        convertReadStats.put("67", 67);
        convertReadStats.put("68", 68);
        convertReadStats.put("69", 69);
        convertReadStats.put("70", 70);
        convertReadStats.put("71", 71);
        convertReadStats.put("72", 72);
        convertReadStats.put("73", 73);
        convertReadStats.put("74", 74);
        convertReadStats.put("75", 75);
        convertReadStats.put("76", 76);
        convertReadStats.put("77", 77);
        convertReadStats.put("78", 78);
        convertReadStats.put("79", 79);
        convertReadStats.put("80", 80);
        convertReadStats.put("81", 81);
        convertReadStats.put("82", 82);
        convertReadStats.put("83", 83);
        convertReadStats.put("84", 84);
        convertReadStats.put("85", 85);
        convertReadStats.put("86", 86);
        convertReadStats.put("87", 87);
        convertReadStats.put("88", 88);
        convertReadStats.put("89", 89);
        convertReadStats.put("90", 90);
        convertReadStats.put("91", 91);
        convertReadStats.put("92", 92);
        convertReadStats.put("93", 93);
        convertReadStats.put("94", 94);
        convertReadStats.put("95", 95);
        convertReadStats.put("96", 96);
        convertReadStats.put("97", 97);
        convertReadStats.put("98", 98);
        convertReadStats.put("99", 99);
        convertReadStats.put("100", 100);
    }
}
