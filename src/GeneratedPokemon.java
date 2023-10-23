import java.io.IOException;

public class GeneratedPokemon {
    GenerateStats stats = new GenerateStats();
    String pokemonName =" ";
    boolean hasBeenGenerated = false;
    int atk;
    int def;
    int spd;
    int hp;
    int exp = 0;
    int expToNextLvl;
    int lvl;
    String move1 = " ";
    String move2 = " ";
    String move3 = " ";
    String move4 = " ";
    int basePower1;
    int basePower2;
    int basePower3;
    int basePower4;
    String printMove1;
    String printMove2;
    String printMove3;
    String printMove4;
    String pokemonNature = stats.decideNature();
    String pokemonType1;
    String pokemonType2;
    int remainingHp = 0;
    int repeatedMove = 0;
    String repeatingMove;
    int expYield;
    boolean leechSeed = false;
    String repeatingEffect;
    int natureStatsAtk;
    int natureStatsDef;
    int natureStatsSpd;
    int IVAtk;
    int IVDef;
    int IVSpd;
    int IVHp;
    GeneratedPokemon() {
    }
    public void setImportPokemonData(String pokemonName, int lvl) throws IOException {
        if (!pokemonName.equals(" ")) {hasBeenGenerated = true;}
        this.pokemonName = pokemonName;
        this.lvl = lvl;

        PokemonListStatRead importPokemonData = new PokemonListStatRead(pokemonName);
        importPokemonData.getBasePokemon(importPokemonData.getPokemon(pokemonName));

        stats.natureStatChange(pokemonNature);

        natureStatsAtk = (((importPokemonData.atk*stats.natureChangeAtk)*lvl)/1000);
        natureStatsDef = (((importPokemonData.def*stats.natureChangeDef)*lvl)/1000);
        natureStatsSpd = (((importPokemonData.spd*stats.natureChangeSpd)*lvl)/1000);

        IVAtk = ((lvl*stats.atk)/100);
        IVDef = ((lvl*stats.def)/100);
        IVSpd = ((lvl*stats.spd)/100);
        IVHp  = ((lvl*stats.hp)/100);

        atk = 5 + ((IVAtk) + ((lvl*importPokemonData.atk)/50) + natureStatsAtk);
        def = 5 + ((IVDef) + ((lvl*importPokemonData.def)/50) + natureStatsDef);
        spd = 5 + ((IVSpd) + ((lvl*importPokemonData.spd)/50) + natureStatsSpd);
        hp  = 11 + ((IVHp) + lvl + ((lvl*importPokemonData.hp)/50));

        this.pokemonType1 = importPokemonData.pokemonType1;
        this.pokemonType2 = importPokemonData.pokemonType2;

        expToNextLvl = ((4*(lvl*(lvl*lvl)))/5);
        this.expYield = importPokemonData.expYield;
    }
    public void StatGainLevelUp(GeneratedPokemon inputPokemon) throws IOException {
        PokemonListStatRead importPokemonData = new PokemonListStatRead(pokemonName);
        importPokemonData.getBasePokemon(importPokemonData.getPokemon(pokemonName));
        System.out.println(((lvl*importPokemonData.atk)/50));
        inputPokemon.lvl++;
        atk = 5 + ((lvl* inputPokemon.IVAtk) + ((lvl*importPokemonData.atk)/50) + inputPokemon.natureStatsAtk);
        def = 5 + ((lvl* inputPokemon.IVDef) + ((lvl*importPokemonData.def)/50) + inputPokemon.natureStatsDef);
        spd = 5 + ((lvl* inputPokemon.IVSpd) + ((lvl*importPokemonData.spd)/50) + inputPokemon.natureStatsSpd);
        hp  = 11 + ((lvl* inputPokemon.IVHp) + lvl + ((lvl*importPokemonData.hp)/50));
        exp = exp - expToNextLvl;
        expToNextLvl = ((4*(lvl*(lvl*lvl)))/5);
        System.out.println("Your "+pokemonName+" has reached level "+lvl+"!\n");

    }
    public static String equalLengthMoves(String move, char ch, int totalLength) {
        return String.format("%" + (-totalLength) + "s",move).replace(' ',ch);
    }
    public String toString() {
        printMove1 = equalLengthMoves(move1,' ',9);
        printMove2 = equalLengthMoves(move2,' ',9);
        printMove3 = equalLengthMoves(move3,' ',9);
        printMove4 = equalLengthMoves(move4,' ',9);
        return "Summary of your: "+pokemonName+"\nType: "+pokemonType1+"/"+pokemonType2+"\nNature: "+pokemonNature+"\nLvl: "+lvl+"\nExp: "+exp+"/"+expToNextLvl+"\nHp:  "+hp+"\nAtk: "+atk+"\nDef: "+def+"\nSpd: "+spd+"\n\n1. "+printMove1+"\tBasePower: "+basePower1+"\n2. "+printMove2+"\tBasePower: "+basePower2+"\n3. "+printMove3+"\tBasePower: "+basePower3+"\n4. "+printMove4+"\tBasePower: "+basePower4;
    }
}
