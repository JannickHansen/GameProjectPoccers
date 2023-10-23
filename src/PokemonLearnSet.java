public class PokemonLearnSet {
    PokemonLearnSet() {
    }
    void LearnSet(GeneratedPokemon insertPokemon) {
        switch (insertPokemon.pokemonName) {
            case "Charmander":
                if (insertPokemon.lvl >= 1) {
                    insertPokemon.move1 = "Scratch";
                    insertPokemon.basePower1 = 40;
                }
                if (insertPokemon.lvl == 7) {
                    insertPokemon.move2 = "Fire Spin";
                    insertPokemon.basePower2 = 10;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move2+"!\n");
                }
                if (insertPokemon.lvl == 11) {
                    insertPokemon.move3 = "Ember";
                    insertPokemon.basePower3 = 40;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move3+"!\n");
                }
                break;
            case "Squirtle":
                if (insertPokemon.lvl >= 1) {
                    insertPokemon.move1 = "Tackle";
                    insertPokemon.basePower1 = 35;
                }
                if (insertPokemon.lvl== 7) {
                    insertPokemon.move2 = "Bubble";
                    insertPokemon.basePower2 = 20;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move2+"!\n");
                }
                if (insertPokemon.lvl == 11) {
                    insertPokemon.move3 = "Water Gun";
                    insertPokemon.basePower3 = 30;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move3+"!\n");
                }
                break;
            case "Bulbasaur":
                if (insertPokemon.lvl >= 1) {
                    insertPokemon.move1 = "Tackle";
                    insertPokemon.basePower1 = 35;
                }
                if (insertPokemon.lvl == 7) {
                    insertPokemon.move2 = "Absorb";
                    insertPokemon.basePower2 = 20;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move2+"!\n");
                }
                if (insertPokemon.lvl == 11) {
                    insertPokemon.move3 = "Leech Seed";
                    insertPokemon.basePower3 = 0;
                    System.out.println("Your "+insertPokemon.pokemonName+" learnt "+insertPokemon.move3+"!\n");
                }
                break;
        }
    }
}
