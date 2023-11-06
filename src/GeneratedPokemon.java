import java.io.IOException;

public class GeneratedPokemon {
    GenerateStats stats = new GenerateStats();
    String pokemonName = " ";
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
    int catchRate;
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

        expToNextLvl = ((4*(lvl*(lvl*lvl)))/7);
        this.expYield = importPokemonData.expYield;
        this.catchRate = importPokemonData.catchRate;
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
        expToNextLvl = ((4*(lvl*(lvl*lvl)))/9);
        System.out.println("Your "+pokemonName+" has reached level "+CM.getLevels + lvl+ CM.resetColour+"!\n");
    }
    public static String equalLengthMoves(String move, char ch, int totalLength) {
        return String.format("%" + (-totalLength) + "s",move).replace(' ',ch);
    }
    public PokemonMoveList callMove(String moveID) throws IOException {
        PokemonMoveList findMove = new PokemonMoveList(moveID);
        findMove.getMoveData(findMove.getMove(moveID));

        return findMove;
    }
    public String toString()  {
        printMove1 = equalLengthMoves(move1,' ',9);
        printMove2 = equalLengthMoves(move2,' ',9);
        printMove3 = equalLengthMoves(move3,' ',9);
        printMove4 = equalLengthMoves(move4,' ',9);
        String mt1; String mt2; String mt3; String mt4;
        try {
            basePower1 = callMove(move1).basePower;
            basePower2 = callMove(move2).basePower;
            basePower3 = callMove(move3).basePower;
            basePower4 = callMove(move4).basePower;
            mt1 = CM.cM(callMove(move1).moveType);
            mt2 = CM.cM(callMove(move2).moveType);
            mt3 = CM.cM(callMove(move3).moveType);
            mt4 = CM.cM(callMove(move4).moveType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String type1 = CM.cM(pokemonType1);
        String type2 = CM.cM(pokemonType2);
        return "Summary of your: "+type1+pokemonName+ CM.resetColour+"\nType: "+type1+pokemonType1+ CM.resetColour+"/"+type2+pokemonType2+ CM.resetColour+"\nNature: "+pokemonNature+"\nLvl: "+ CM.getLevels+ lvl + CM.resetColour+"\nExp: "+exp+"/"+expToNextLvl+"\nHp:  "+hp+"\nAtk: "+atk+"\nDef: "+def+"\nSpd: "+spd+"\n\n1. "+mt1+printMove1+ CM.resetColour+"\tBasePower: "+basePower1+"\n2. "+mt2+printMove2+ CM.resetColour+"\tBasePower: "+basePower2+"\n3. "+mt3+printMove3+ CM.resetColour+"\tBasePower: "+basePower3+"\n4. "+mt4+printMove4+ CM.resetColour+"\tBasePower: "+basePower4;
    }
}
