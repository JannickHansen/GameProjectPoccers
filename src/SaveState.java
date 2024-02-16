import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveState {
    List<GeneratedPokemon> playerPokemonParty;
    PlayerBag playerBag;
    OverworldControl overworldControl;
    SaveState () {
    }
    public void SaveStateSave(List<GeneratedPokemon> playerPokemonParty, PlayerBag playerBag, RouteController unlockedRoute, PokemonGym unlockedGym) throws IOException {
        FileWriter fil = new FileWriter("SaveState.txt");
        BufferedWriter bw = new BufferedWriter(fil);
        PrintWriter ud = new PrintWriter(bw);

        for (int i = 0; i < 5; i++) {
            GeneratedPokemon readPokemon = playerPokemonParty.get(i);
            ud.print(readPokemon.pokemonName+","+readPokemon.lvl+","+readPokemon.expToNextLvl+","+readPokemon.exp+","+readPokemon.atk+","+readPokemon.def+","+readPokemon.spd+","+readPokemon.hp+","+readPokemon.pokemonType1+","+readPokemon.pokemonType2+","+readPokemon.IVAtk+","+readPokemon.IVDef+","+readPokemon.IVSpd+","+readPokemon.IVHp+","+readPokemon.natureStatsAtk+","+readPokemon.natureStatsDef+","+readPokemon.natureStatsSpd+","+readPokemon.pokemonNature+","+readPokemon.move1+","+readPokemon.move2+","+readPokemon.move3+","+readPokemon.move4+","+readPokemon.expYield+","+readPokemon.catchRate+","+readPokemon.basePower1+","+readPokemon.basePower2+","+readPokemon.basePower3+","+readPokemon.basePower4+",");
        }
        ud.print(playerBag.pokeDollars+",");
        for (String l : playerBag.getNameOfItemsInInventory()) {
            ud.print(l+",");
        }
        for (Integer l : playerBag.getNumberOfItemsInInventory()) {
            ud.print(l+",");
        }
        ud.print(unlockedRoute.route1+","+unlockedRoute.route2+","+unlockedRoute.route3+","+unlockedRoute.route4+","+unlockedRoute.route5+","+unlockedRoute.route6+","+unlockedRoute.route7+","+unlockedRoute.route8+","+unlockedRoute.well+","+unlockedRoute.mayVilleFarm+",");
        ud.print(unlockedGym.pokemonGym1+","+unlockedGym.pokemonGym2+","+unlockedGym.pokemonGym3+","+unlockedGym.pokemonGym4+","+unlockedGym.pokemonGym5+","+unlockedGym.pokemonGym6+","+unlockedGym.pokemonGym7+","+unlockedGym.pokemonGym8+",");
        ud.close();
    }

    public void SaveStateLoad() throws IOException {
        FileReader pokemonList = new FileReader("SaveState.txt");
        BufferedReader readIn = new BufferedReader(pokemonList);
        String line = readIn.readLine();

        int currentLocation = 0;

        for (int i = 0; i < 5; i++) {

          playerPokemonParty.get(0).pokemonName = extractData(line,currentLocation);
            currentLocation++;
          playerPokemonParty.get(i).lvl = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).expToNextLvl = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).exp = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;

          playerPokemonParty.get(i).atk = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).def = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).spd = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).hp = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;

          playerPokemonParty.get(i).pokemonType1 = extractData(line,currentLocation);
            currentLocation++;
          playerPokemonParty.get(i).pokemonType2 = extractData(line,currentLocation);
            currentLocation++;

          playerPokemonParty.get(i).IVAtk = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).IVDef = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).IVSpd = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).IVHp = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;

          playerPokemonParty.get(i).natureStatsAtk = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).natureStatsDef = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).natureStatsSpd = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).pokemonNature = extractData(line,currentLocation);
            currentLocation++;

          playerPokemonParty.get(i).move1 = extractData(line,currentLocation);
            currentLocation++;
          playerPokemonParty.get(i).move2 = extractData(line,currentLocation);
            currentLocation++;
          playerPokemonParty.get(i).move3 = extractData(line,currentLocation);
            currentLocation++;
          playerPokemonParty.get(i).move4 = extractData(line,currentLocation);
            currentLocation++;

          playerPokemonParty.get(i).expYield = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).catchRate = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;

          playerPokemonParty.get(i).basePower1 = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).basePower2 = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).basePower3 = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;
          playerPokemonParty.get(i).basePower4 = convertReadStats.getOrDefault(extractData(line,currentLocation),0);
            currentLocation++;

          playerPokemonParty.get(i).hasBeenGenerated = true;

        }

        playerBag.pokeDollars = convertReadStats.getOrDefault(line,167);


    }
    public String extractData(String line, int i) {
        String[] parts = line.split(",");
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
        convertReadStats.put("101", 101);
        convertReadStats.put("102", 102);
        convertReadStats.put("103", 103);
        convertReadStats.put("104", 104);
        convertReadStats.put("105", 105);
        convertReadStats.put("106", 106);
        convertReadStats.put("107", 107);
        convertReadStats.put("108", 108);
        convertReadStats.put("109", 109);
        convertReadStats.put("110", 110);
        convertReadStats.put("111", 111);
        convertReadStats.put("112", 112);
        convertReadStats.put("113", 113);
        convertReadStats.put("114", 114);
        convertReadStats.put("115", 115);
        convertReadStats.put("116", 116);
        convertReadStats.put("117", 117);
        convertReadStats.put("118", 118);
        convertReadStats.put("119", 119);
        convertReadStats.put("120", 120);
        convertReadStats.put("121", 121);
        convertReadStats.put("122", 122);
        convertReadStats.put("123", 123);
        convertReadStats.put("124", 124);
        convertReadStats.put("125", 125);
        convertReadStats.put("126", 126);
        convertReadStats.put("127", 127);
        convertReadStats.put("128", 128);
        convertReadStats.put("129", 129);
        convertReadStats.put("130", 130);
        convertReadStats.put("131", 131);
        convertReadStats.put("132", 132);
        convertReadStats.put("133", 133);
        convertReadStats.put("134", 134);
        convertReadStats.put("135", 135);
        convertReadStats.put("136", 136);
        convertReadStats.put("137", 137);
        convertReadStats.put("138", 138);
        convertReadStats.put("139", 139);
        convertReadStats.put("140", 140);
        convertReadStats.put("141", 141);
        convertReadStats.put("142", 142);
        convertReadStats.put("143", 143);
        convertReadStats.put("144", 144);
        convertReadStats.put("145", 145);
        convertReadStats.put("146", 146);
        convertReadStats.put("147", 147);
        convertReadStats.put("148", 148);
        convertReadStats.put("149", 149);
        convertReadStats.put("150", 150);
        convertReadStats.put("151", 151);
        convertReadStats.put("152", 152);
        convertReadStats.put("153", 153);
        convertReadStats.put("154", 154);
        convertReadStats.put("155", 155);
        convertReadStats.put("156", 156);
        convertReadStats.put("157", 157);
        convertReadStats.put("158", 158);
        convertReadStats.put("159", 159);
        convertReadStats.put("160", 160);
        convertReadStats.put("161", 161);
        convertReadStats.put("162", 162);
        convertReadStats.put("163", 163);
        convertReadStats.put("164", 164);
        convertReadStats.put("165", 165);
        convertReadStats.put("166", 166);
        convertReadStats.put("167", 167);
        convertReadStats.put("168", 168);
        convertReadStats.put("169", 169);
        convertReadStats.put("170", 170);
        convertReadStats.put("171", 171);
        convertReadStats.put("172", 172);
        convertReadStats.put("173", 173);
        convertReadStats.put("174", 174);
        convertReadStats.put("175", 175);
        convertReadStats.put("176", 176);
        convertReadStats.put("177", 177);
        convertReadStats.put("178", 178);
        convertReadStats.put("179", 179);
        convertReadStats.put("180", 180);
        convertReadStats.put("181", 181);
        convertReadStats.put("182", 182);
        convertReadStats.put("183", 183);
        convertReadStats.put("184", 184);
        convertReadStats.put("185", 185);
        convertReadStats.put("186", 186);
        convertReadStats.put("187", 187);
        convertReadStats.put("188", 188);
        convertReadStats.put("189", 189);
        convertReadStats.put("190", 190);
        convertReadStats.put("191", 191);
        convertReadStats.put("192", 192);
        convertReadStats.put("193", 193);
        convertReadStats.put("194", 194);
        convertReadStats.put("195", 195);
        convertReadStats.put("196", 196);
        convertReadStats.put("197", 197);
        convertReadStats.put("198", 198);
        convertReadStats.put("199", 199);
        convertReadStats.put("200", 200);
        convertReadStats.put("201", 201);
        convertReadStats.put("202", 202);
        convertReadStats.put("203", 203);
        convertReadStats.put("204", 204);
        convertReadStats.put("205", 205);
        convertReadStats.put("206", 206);
        convertReadStats.put("207", 207);
        convertReadStats.put("208", 208);
        convertReadStats.put("209", 209);
        convertReadStats.put("210", 210);
        convertReadStats.put("211", 211);
        convertReadStats.put("212", 212);
        convertReadStats.put("213", 213);
        convertReadStats.put("214", 214);
        convertReadStats.put("215", 215);
        convertReadStats.put("216", 216);
        convertReadStats.put("217", 217);
        convertReadStats.put("218", 218);
        convertReadStats.put("219", 219);
        convertReadStats.put("220", 220);
        convertReadStats.put("221", 221);
        convertReadStats.put("222", 222);
        convertReadStats.put("223", 223);
        convertReadStats.put("224", 224);
        convertReadStats.put("225", 225);
        convertReadStats.put("226", 226);
        convertReadStats.put("227", 227);
        convertReadStats.put("228", 228);
        convertReadStats.put("229", 229);
        convertReadStats.put("230", 230);
        convertReadStats.put("231", 231);
        convertReadStats.put("232", 232);
        convertReadStats.put("233", 233);
        convertReadStats.put("234", 234);
        convertReadStats.put("235", 235);
        convertReadStats.put("236", 236);
        convertReadStats.put("237", 237);
        convertReadStats.put("238", 238);
        convertReadStats.put("239", 239);
        convertReadStats.put("240", 240);
        convertReadStats.put("241", 241);
        convertReadStats.put("242", 242);
        convertReadStats.put("243", 243);
        convertReadStats.put("244", 244);
        convertReadStats.put("245", 245);
        convertReadStats.put("246", 246);
        convertReadStats.put("247", 247);
        convertReadStats.put("248", 248);
        convertReadStats.put("249", 249);
        convertReadStats.put("250", 250);
        convertReadStats.put("251", 251);
        convertReadStats.put("252", 252);
        convertReadStats.put("253", 253);
        convertReadStats.put("254", 254);
        convertReadStats.put("255", 255);
        convertReadStats.put("256", 256);
        convertReadStats.put("257", 257);
        convertReadStats.put("258", 258);
        convertReadStats.put("259", 259);
        convertReadStats.put("260", 260);
    }

}
