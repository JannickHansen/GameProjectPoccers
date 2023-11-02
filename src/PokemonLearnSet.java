import java.util.Scanner;

public class PokemonLearnSet {
    Scanner tastatur = new Scanner(System.in);
    PokemonLearnSet() {
    }

    void LearnSet(GeneratedPokemon insertPokemon) {
        switch (insertPokemon.pokemonName) {
            case "Spheal":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move2 = "Bubble";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Play Rough", "Your " + insertPokemon.pokemonName + " learnt Play Rough!\n");
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Powder Snow", "Your " + insertPokemon.pokemonName + " learnt Powder Snow!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Ice Ball", "Your " + insertPokemon.pokemonName + " learnt Ice Ball!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Body Slam", "Your " + insertPokemon.pokemonName + " learnt Body Slam!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Ice Beam", "Your " + insertPokemon.pokemonName + " learnt Ice Beam!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Sheer Cold", "Your " + insertPokemon.pokemonName + " learnt Sheer Cold!\n");
                        break;
                }
                break;
            case "Charmander":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Fire Spin", "Your " + insertPokemon.pokemonName + " learnt Fire Spin!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember", "Your " + insertPokemon.pokemonName + " learnt Ember!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw", "Your " + insertPokemon.pokemonName + " learnt Metal Claw!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang", "Your " + insertPokemon.pokemonName + " learnt Fire Fang!\n");
                        break;
                    case 20:
                        learnAndPrintMove(insertPokemon, "Slash", "Your " + insertPokemon.pokemonName + " learnt Slash!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Flamethrower", "Your " + insertPokemon.pokemonName + " learnt Flamethrower!\n");
                        break;
                }
                break;
            case "Charmeleon":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Ember";
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember", "Your " + insertPokemon.pokemonName + " learnt Ember!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw", "Your " + insertPokemon.pokemonName + " learnt Metal Claw!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang", "Your " + insertPokemon.pokemonName + " learnt Fire Fang!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Slash", "Your " + insertPokemon.pokemonName + " learnt Slash!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Flamethrower", "Your " + insertPokemon.pokemonName + " learnt Flamethrower!\n");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Dragon Breath", "Your " + insertPokemon.pokemonName + " learnt Dragon Breath!\n");
                        break;

                }
                break;
            case "Charizard":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Dragon Claw";
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember", "Your " + insertPokemon.pokemonName + " learnt Ember!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw", "Your " + insertPokemon.pokemonName + " learnt Metal Claw!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang", "Your " + insertPokemon.pokemonName + " learnt Fire Fang!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Slash", "Your " + insertPokemon.pokemonName + " learnt Slash!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Flamethrower", "Your " + insertPokemon.pokemonName + " learnt Flamethrower!\n");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Dragon Breath", "Your " + insertPokemon.pokemonName + " learnt Dragon Breath!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Fly", "Your " + insertPokemon.pokemonName + " learnt Fly!\n");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Flare Blitz", "Your " + insertPokemon.pokemonName + " learnt Flare Blitz!\n");
                        break;

                }
                break;
            case "Squirtle":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam", "Your " + insertPokemon.pokemonName + " learnt Ice Beam!\n");
                        break;
                }
                break;
            case "Wartortle":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam", "Your " + insertPokemon.pokemonName + " learnt Ice Beam!\n");
                        break;
                }
                break;
            case "Blastoise":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam", "Your " + insertPokemon.pokemonName + " learnt Ice Beam!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                }
                break;
            case "Bulbasaur":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb", "Your " + insertPokemon.pokemonName + " learnt Absorb!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed", "Your " + insertPokemon.pokemonName + " learnt Leech Seed!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip", "Your " + insertPokemon.pokemonName + " learnt Vine Whip!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf", "Your " + insertPokemon.pokemonName + " learnt Razor Leaf!\n");
                        break;
                }
                break;
            case "Ivysaur":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb", "Your " + insertPokemon.pokemonName + " learnt Absorb!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed", "Your " + insertPokemon.pokemonName + " learnt Leech Seed!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip", "Your " + insertPokemon.pokemonName + " learnt Vine Whip!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf", "Your " + insertPokemon.pokemonName + " learnt Razor Leaf!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Sludge", "Your " + insertPokemon.pokemonName + " learnt Sludge!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Mega Drain", "Your " + insertPokemon.pokemonName + " learnt Mega Drain!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Take Down", "Your " + insertPokemon.pokemonName + " learnt Take Down!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb", "Your " + insertPokemon.pokemonName + " learnt Sludge Bomb!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Seed Bomb", "Your " + insertPokemon.pokemonName + " learnt Seed Bomb!\n");
                        break;
                }
                break;
            case "Venusaur":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Absorb", "Your " + insertPokemon.pokemonName + " learnt Absorb!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed", "Your " + insertPokemon.pokemonName + " learnt Leech Seed!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip", "Your " + insertPokemon.pokemonName + " learnt Vine Whip!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf", "Your " + insertPokemon.pokemonName + " learnt Razor Leaf!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Mega Drain", "Your " + insertPokemon.pokemonName + " learnt Mega Drain!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Take Down", "Your " + insertPokemon.pokemonName + " learnt Take Down!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb", "Your " + insertPokemon.pokemonName + " learnt Sludge Bomb!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Seed Bomb", "Your " + insertPokemon.pokemonName + " learnt Seed Bomb!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Solar Beam", "Your " + insertPokemon.pokemonName + " learnt Solar Beam!\n");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                }
                break;
            case "Rattata":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Hyper Fang", "Your " + insertPokemon.pokemonName + " learnt Hyper Fang!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Super Fang", "Your " + insertPokemon.pokemonName + " learnt Super Fang!\n");
                        break;
                }
                break;
            case "Raticate":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 4:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Hyper Fang", "Your " + insertPokemon.pokemonName + " learnt Hyper Fang!\n");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Take Down", "Your " + insertPokemon.pokemonName + " learnt Take Down!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Super Fang", "Your " + insertPokemon.pokemonName + " learnt Super Fang!\n");
                        break;
                }
                break;
            case "Pidgey":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Gust", "Your " + insertPokemon.pokemonName + " learnt Gust!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister", "Your " + insertPokemon.pokemonName + " learnt Twister!\n");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Wing Attack", "Your " + insertPokemon.pokemonName + " learnt Wing Attack!\n");
                        break;
                }
                break;
            case "Pidgeotto":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Gust";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister", "Your " + insertPokemon.pokemonName + " learnt Twister!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Wing Attack", "Your " + insertPokemon.pokemonName + " learnt Wing Attack!\n");
                        break;
                }
                break;
            case "Pidgeot":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Gust", "Your " + insertPokemon.pokemonName + " learnt Gust!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister", "Your " + insertPokemon.pokemonName + " learnt Twister!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Wing Attack", "Your " + insertPokemon.pokemonName + " learnt Wing Attack!\n");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Hurricane", "Your " + insertPokemon.pokemonName + " learnt Hurricane!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Brave Bird", "Your " + insertPokemon.pokemonName + " learnt Brave Bird!\n");
                        break;
                }
                break;
            case "Piplup":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Pound";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Peck", "Your " + insertPokemon.pokemonName + " learnt Peck!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Bubble Beam", "Your " + insertPokemon.pokemonName + " learnt Bubble Beam!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Fury Attack", "Your " + insertPokemon.pokemonName + " learnt Fury Attack!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Brine", "Your " + insertPokemon.pokemonName + " learnt Brine!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Drill Peck", "Your " + insertPokemon.pokemonName + " learnt Drill Peck!\n");
                        break;
                }
                break;
            case "Prinplup":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Peck", "Your " + insertPokemon.pokemonName + " learnt Peck!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Metal Claw", "Your " + insertPokemon.pokemonName + " learnt Metal Claw!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Bubble Beam", "Your " + insertPokemon.pokemonName + " learnt Bubble Beam!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Fury Attack", "Your " + insertPokemon.pokemonName + " learnt Fury Attack!\n");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Brine", "Your " + insertPokemon.pokemonName + " learnt Brine!\n");
                        break;
                    case 46:
                        learnAndPrintMove(insertPokemon, "Drill Peck", "Your " + insertPokemon.pokemonName + " learnt Drill Peck!\n");
                        break;
                }
                break;
            case "Empoleon":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move4 = "Flash Cannon";
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Peck", "Your " + insertPokemon.pokemonName + " learnt Peck!\n");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Metal Claw", "Your " + insertPokemon.pokemonName + " learnt Metal Claw!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Bubble Beam", "Your " + insertPokemon.pokemonName + " learnt Bubble Beam!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Fury Attack", "Your " + insertPokemon.pokemonName + " learnt Fury Attack!\n");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Brine", "Your " + insertPokemon.pokemonName + " learnt Brine!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Flash Cannon", "Your " + insertPokemon.pokemonName + " learnt Flash Cannon!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Drill Peck", "Your " + insertPokemon.pokemonName + " learnt Drill Peck!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                    case 55:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                }
                break;
            case "Totodile":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        insertPokemon.move2 = "Hydro Pump";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Ice Fang", "Your " + insertPokemon.pokemonName + " learnt Ice Fang!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Superpower", "Your " + insertPokemon.pokemonName + " learnt Superpower!\n");
                        break;
                }
                break;
            case "Croconaw":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        insertPokemon.move2 = "Hydro Pump";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Ice Fang", "Your " + insertPokemon.pokemonName + " learnt Ice Fang!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 42:
                        learnAndPrintMove(insertPokemon, "Superpower", "Your " + insertPokemon.pokemonName + " learnt Superpower!\n");
                        break;
                }
                break;
            case "Feraligatr":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        insertPokemon.move3 = "Water Gun";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Ice Fang", "Your " + insertPokemon.pokemonName + " learnt Ice Fang!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Chip Away", "Your " + insertPokemon.pokemonName + " learnt Chip Away!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Aqua Tail", "Your " + insertPokemon.pokemonName + " learnt Aqua Tail!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Superpower", "Your " + insertPokemon.pokemonName + " learnt Superpower!\n");
                        break;
                }
                break;
            case "Lotad":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb", "Your " + insertPokemon.pokemonName + " learnt Absorb!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain", "Your " + insertPokemon.pokemonName + " learnt Mega Drain!\n");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Giga Drain", "Your " + insertPokemon.pokemonName + " learnt Giga Drain!\n");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Energy Ball", "Your " + insertPokemon.pokemonName + " learnt Energy Ball!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                }
                break;
            case "Lombre":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Astonish";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb", "Your " + insertPokemon.pokemonName + " learnt Absorb!\n");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Fury Swipes", "Your " + insertPokemon.pokemonName + " learnt Fury Swipes!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain", "Your " + insertPokemon.pokemonName + " learnt Mega Drain!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Giga Drain", "Your " + insertPokemon.pokemonName + " learnt Giga Drain!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Energy Ball", "Your " + insertPokemon.pokemonName + " learnt Energy Ball!\n");
                        break;
                }
                break;
            case "Ludicolo":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Astonish";
                        insertPokemon.move2 = "Absorb";
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Fury Swipes", "Your " + insertPokemon.pokemonName + " learnt Fury Swipes!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain", "Your " + insertPokemon.pokemonName + " learnt Mega Drain!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump", "Your " + insertPokemon.pokemonName + " learnt Hydro Pump!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Giga Drain", "Your " + insertPokemon.pokemonName + " learnt Giga Drain!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Energy Ball", "Your " + insertPokemon.pokemonName + " learnt Energy Ball!\n");
                        break;
                }
                break;
            case "Slowpoke":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Confusion", "Your " + insertPokemon.pokemonName + " learnt Confusion!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Headbutt", "Your " + insertPokemon.pokemonName + " learnt Headbutt!\n");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Psychic", "Your " + insertPokemon.pokemonName + " learnt Psychic!\n");
                        break;
                }
                break;
            case "Slowbro":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Curse";
                        insertPokemon.move3 = "Yawn";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bubble", "Your " + insertPokemon.pokemonName + " learnt Bubble!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Confusion", "Your " + insertPokemon.pokemonName + " learnt Confusion!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Headbutt", "Your " + insertPokemon.pokemonName + " learnt Headbutt!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Psychic", "Your " + insertPokemon.pokemonName + " learnt Psychic!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Power Gem", "Your " + insertPokemon.pokemonName + " learnt Power Gem!\n");
                        break;
                }
                break;
            case "Slowking":
                switch (insertPokemon.lvl) {
                    case 6:
                        learnAndPrintMove(insertPokemon, "Confusion", "Your " + insertPokemon.pokemonName + " learnt Confusion!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt", "Your " + insertPokemon.pokemonName + " learnt Zen Headbutt!\n");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Psychic", "Your " + insertPokemon.pokemonName + " learnt Psychic!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Power Gem", "Your " + insertPokemon.pokemonName + " learnt Power Gem!\n");
                        break;
                }
                break;
            case "Bidoof":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Pound", "Your " + insertPokemon.pokemonName + " learnt Pound!\n");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Rollout", "Your " + insertPokemon.pokemonName + " learnt Rollout!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Headbutt", "Your " + insertPokemon.pokemonName + " learnt Headbutt!\n");
                        break;
                }
                break;
            case "Bibarel":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Rollout", "Your " + insertPokemon.pokemonName + " learnt Rollout!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Headbutt", "Your " + insertPokemon.pokemonName + " learnt Headbutt!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Hyper Fang", "Your " + insertPokemon.pokemonName + " learnt Hyper Fang!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Super Fang", "Your " + insertPokemon.pokemonName + " learnt Super Fang!\n");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Hyper Beam", "Your " + insertPokemon.pokemonName + " learnt Hyper Beam!\n");
                        break;
                }
                break;
            case "Eevee":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move3 = "Tail Whip";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Sand-Attack", "Your " + insertPokemon.pokemonName + " learnt Sand-Attack!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Focus Energy", "Your " + insertPokemon.pokemonName + " learnt Focus Energy!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Take Down", "Your " + insertPokemon.pokemonName + " learnt Take Down!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Play Rough", "Your " + insertPokemon.pokemonName + " learnt Play Rough!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Double-Edge", "Your " + insertPokemon.pokemonName + " learnt Double-Edge!\n");
                        break;
                }
                break;
            case "Tauros":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Rage", "Your " + insertPokemon.pokemonName + " learnt Rage!\n");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Horn Attack", "Your " + insertPokemon.pokemonName + " learnt Horn Attack!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Pursuit", "Your " + insertPokemon.pokemonName + " learnt Pursuit!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Take Down", "Your " + insertPokemon.pokemonName + " learnt Take Down!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Double-Edge", "Your " + insertPokemon.pokemonName + " learnt Double-Edge!\n");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Thrash", "Your " + insertPokemon.pokemonName + " learnt Thrash!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                }
                break;
            case "Swinub":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move3 = "Powder Snow";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Mud Bomb", "Your " + insertPokemon.pokemonName + " learnt Mud Bomb!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Rock Tomb", "Your " + insertPokemon.pokemonName + " learnt Rock Tomb!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Ice Ball", "Your " + insertPokemon.pokemonName + " learnt Ice Ball!\n");
                        break;
                }
                break;
            case "Piloswine":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move3 = "Powder Snow";
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Rock Tomb", "Your " + insertPokemon.pokemonName + " learnt Rock Tomb!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Mud Bomb", "Your " + insertPokemon.pokemonName + " learnt Mud Bomb!\n");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Icy Wind", "Your " + insertPokemon.pokemonName + " learnt Icy Wind!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Ancient Power", "Your " + insertPokemon.pokemonName + " learnt Ancient Power!\n");
                        break;
                }
                break;
            case "Mamoswine":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move3 = "Powder Snow";
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Flail", "Your " + insertPokemon.pokemonName + " learnt Flail!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Rock Tomb", "Your " + insertPokemon.pokemonName + " learnt Rock Tomb!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Mud Bomb", "Your " + insertPokemon.pokemonName + " learnt Mud Bomb!\n");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Icy Wind", "Your " + insertPokemon.pokemonName + " learnt Icy Wind!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Ancient Power", "Your " + insertPokemon.pokemonName + " learnt Ancient Power!\n");
                        break;
                }
                break;
            case "Absol":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Pursuit", "Your " + insertPokemon.pokemonName + " learnt Pursuit!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Night Slash", "Your " + insertPokemon.pokemonName + " learnt Night Slash!\n");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Psycho Cut", "Your " + insertPokemon.pokemonName + " learnt Psycho Cut!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Shadow Claw", "Your " + insertPokemon.pokemonName + " learnt Shadow Claw!\n");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Guillotine", "Your " + insertPokemon.pokemonName + " learnt Guillotine!\n");
                        break;
                }
                break;
            case "Caterpie":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Bug Bite", "Your " + insertPokemon.pokemonName + " learnt Bug Bite!\n");
                        break;
                }
                break;
            case "Metapod", "Kakuna":
                switch (insertPokemon.lvl) {
                    case 7:
                        insertPokemon.move1 = "Harden";
                        break;
                }
                break;
            case "Butterfree":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Confusion", "Your " + insertPokemon.pokemonName + " learnt Confusion!\n");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Gust", "Your " + insertPokemon.pokemonName + " learnt Gust!\n");
                        break;
                    case 20:
                        learnAndPrintMove(insertPokemon, "Pin Missile", "Your " + insertPokemon.pokemonName + " learnt Pin Missile!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Bug Buzz", "Your " + insertPokemon.pokemonName + " learnt Bug Buzz!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Air Slash", "Your " + insertPokemon.pokemonName + " learnt Air Slash!\n");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Silver Wind", "Your " + insertPokemon.pokemonName + " learnt Silver Wind!\n");
                        break;
                }
                break;
            case "Weedle":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bug Bite", "Your " + insertPokemon.pokemonName + " learnt Bug Bite!\n");
                        break;
                }
                break;
            case "Beedrill":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Poison Sting";
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Fury Attack", "Your " + insertPokemon.pokemonName + " learnt Fury Attack!\n");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Twin Needle", "Your " + insertPokemon.pokemonName + " learnt Twin Needle!\n");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Poison Jab", "Your " + insertPokemon.pokemonName + " learnt Poison Jab!\n");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Bug Buzz", "Your " + insertPokemon.pokemonName + " learnt Bug Buzz!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Air Slash", "Your " + insertPokemon.pokemonName + " learnt Air Slash!\n");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "X-Scissor", "Your " + insertPokemon.pokemonName + " learnt X-Scissor!\n");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb", "Your " + insertPokemon.pokemonName + " learnt Sludge Bomb!\n");
                        break;
                }
                break;
            case "Surskit":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move2 = "Bubble";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun", "Your " + insertPokemon.pokemonName + " learnt Water Gun!\n");
                        break;
                }
                break;
            case "Masquerain":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bubble";
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack", "Your " + insertPokemon.pokemonName + " learnt Quick Attack!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Air Cutter", "Your " + insertPokemon.pokemonName + " learnt Air Cutter!\n");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Water Pulse", "Your " + insertPokemon.pokemonName + " learnt Water Pulse!\n");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Giga Drain", "Your " + insertPokemon.pokemonName + " learnt Giga Drain!\n");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Bug Buzz", "Your " + insertPokemon.pokemonName + " learnt Bug Buzz!\n");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Air Slash", "Your " + insertPokemon.pokemonName + " learnt Air Slash!\n");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Silver Wind", "Your " + insertPokemon.pokemonName + " learnt Silver Wind!\n");
                        break;
                }
                break;
            case "Gastly":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Lick";
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Night Shade", "Your " + insertPokemon.pokemonName + " learnt Night Shade!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball", "Your " + insertPokemon.pokemonName + " learnt Shadow Ball!\n");
                        break;
                }
                break;
            case "Haunter":
                switch (insertPokemon.lvl) {
                    case 1:
                        learnAndPrintMove(insertPokemon, "Lick", "Your " + insertPokemon.pokemonName + " learnt Lick!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball", "Your " + insertPokemon.pokemonName + " learnt Shadow Ball!\n");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Dream Eater", "Your " + insertPokemon.pokemonName + " learnt Dream Eater!\n");
                        break;
                }
                break;
            case "Gengar":
                switch (insertPokemon.lvl) {
                    case 1:
                        learnAndPrintMove(insertPokemon, "Lick", "Your " + insertPokemon.pokemonName + " learnt Lick!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball", "Your " + insertPokemon.pokemonName + " learnt Shadow Ball!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Dark Pulse", "Your " + insertPokemon.pokemonName + " learnt Dark Pulse!\n");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Dream Eater", "Your " + insertPokemon.pokemonName + " learnt Dream Eater!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Dazzling Gleam", "Your " + insertPokemon.pokemonName + " learnt Dazzling Gleam!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Poison Jab", "Your " + insertPokemon.pokemonName + " learnt Poison Jab!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Phantom Force", "Your " + insertPokemon.pokemonName + " learnt Phantom Force!\n");
                        break;
                }
                break;
            case "Larvitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Rock Throw", "Your " + insertPokemon.pokemonName + " learnt Rock Throw!\n");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Rock Tomb", "Your " + insertPokemon.pokemonName + " learnt Rock Tomb!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Chip Away", "Your " + insertPokemon.pokemonName + " learnt Chip Away!\n");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Rock Slide", "Your " + insertPokemon.pokemonName + " learnt Rock Slide!\n");
                        break;
                }
                break;
            case "Pupitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Magnitude", "Your " + insertPokemon.pokemonName + " learnt Scary Magnitude!\n");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Rock Slide", "Your " + insertPokemon.pokemonName + " learnt Rock Slide!\n");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Dark Pulse", "Your " + insertPokemon.pokemonName + " learnt Dark Pulse!\n");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Stone Edge", "Your " + insertPokemon.pokemonName + " learnt Stone Edge!\n");
                        break;
                }
                break;
            case "Tyranitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 56:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                    case 60:
                        learnAndPrintMove(insertPokemon, "Hyper Beam", "Your " + insertPokemon.pokemonName + " learnt Hyper Beam!\n");
                        break;
                }
                break;
            case "Ekans":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Wrap";
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Sludge", "Your " + insertPokemon.pokemonName + " learnt Sludge!\n");
                        break;
                }
                break;
            case "Arbok":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Wrap";
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Mud Bomb", "Your " + insertPokemon.pokemonName + " learnt Mud Bomb!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb", "Your " + insertPokemon.pokemonName + " learnt Sludge Bomb!\n");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Crunch", "Your " + insertPokemon.pokemonName + " learnt Crunch!\n");
                        break;
                }
                break;
            case "Nidoran♀", "Nidoran♂":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick", "Your " + insertPokemon.pokemonName + " learnt Double Kick!\n");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Fury Swipes", "Your " + insertPokemon.pokemonName + " learnt Fury Swipes!\n");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                }
                break;

            case "Nidorina":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Double Kick", "Your " + insertPokemon.pokemonName + " learnt Double Kick!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Fury Swipes", "Your " + insertPokemon.pokemonName + " learnt Fury Swipes!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Bite", "Your " + insertPokemon.pokemonName + " learnt Bite!\n");
                        break;
                }
                break;
            case "Nidorino":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Peck";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Double Kick", "Your " + insertPokemon.pokemonName + " learnt Double Kick!\n");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Fury Swipes", "Your " + insertPokemon.pokemonName + " learnt Fury Swipes!\n");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Horn Attack", "Your " + insertPokemon.pokemonName + " learnt Horn Attack!\n");
                        break;
                }
                break;
            case "Nidoqueen":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick", "Your " + insertPokemon.pokemonName + " learnt Double Kick!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Earthquake", "Your " + insertPokemon.pokemonName + " learnt Earthquake!\n");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Stone Edge", "Your " + insertPokemon.pokemonName + " learnt Stone Edge!\n");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Body Slam", "Your " + insertPokemon.pokemonName + " learnt Body Slam!\n");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Blizzard", "Your " + insertPokemon.pokemonName + " learnt Blizzard!\n");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Super Power", "Your " + insertPokemon.pokemonName + " learnt Super Power!\n");
                        break;
                }
                break;
            case "Nidoking":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Tackle", "Your " + insertPokemon.pokemonName + " learnt Tackle!\n");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick", "Your " + insertPokemon.pokemonName + " learnt Double Kick!\n");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Poison Sting", "Your " + insertPokemon.pokemonName + " learnt Poison Sting!\n");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Earth Power", "Your " + insertPokemon.pokemonName + " learnt Earth Power!\n");
                        break;
                    case 42:
                        learnAndPrintMove(insertPokemon, "Body Slam", "Your " + insertPokemon.pokemonName + " learnt Body Slam!\n");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Sludge Wave", "Your " + insertPokemon.pokemonName + " learnt Sludge Wave!\n");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Megahorn", "Your " + insertPokemon.pokemonName + " learnt Megahorn!\n");
                        break;
                }
                break;
        }
    }
    private void learnAndPrintMove (GeneratedPokemon insertPokemon, String newMove, String message){
        if (insertPokemon.move2.equals(" ")) {
            insertPokemon.move2 = newMove;
            System.out.println(message);
        }
        else if (insertPokemon.move3.equals(" ")) {
            insertPokemon.move3 = newMove;
            System.out.println(message);
        }
        else if (insertPokemon.move4.equals(" ")) {
            insertPokemon.move4 = newMove;
            System.out.println(message);
        }
        else {
            System.out.println("Your " + insertPokemon.pokemonName + " is trying to learn " + newMove + "!");
            System.out.println("Will you replace it with a move your " + insertPokemon.pokemonName + " already knows?");
            System.out.println("Yes / No");
            while (true) {
                String op1 = tastatur.next();
                op1 = spellingControl(op1);
                if (op1.equals("Yes")) {
                    System.out.println("Select a move to forget:");
                    System.out.println("1. " + insertPokemon.move1);
                    System.out.println("2. " + insertPokemon.move2);
                    System.out.println("3. " + insertPokemon.move3);
                    System.out.println("4. " + insertPokemon.move4);
                    String op2 = tastatur.next();
                    if (op2.equals("1")) {
                        System.out.println("Your " + insertPokemon.pokemonName + " forgot " + insertPokemon.move1 + "...");
                        insertPokemon.move1 = newMove;
                        System.out.println("Your " + insertPokemon.pokemonName + " learnt " + insertPokemon.move1 + "!");
                        break;
                    } else if (op2.equals("2")) {
                        System.out.println("Your " + insertPokemon.pokemonName + " forgot " + insertPokemon.move2 + "...");
                        insertPokemon.move2 = newMove;
                        System.out.println("Your " + insertPokemon.pokemonName + " learnt " + insertPokemon.move2 + "!");
                        break;
                    } else if (op2.equals("3")) {
                        System.out.println("Your " + insertPokemon.pokemonName + " forgot " + insertPokemon.move3 + "...");
                        insertPokemon.move3 = newMove;
                        System.out.println("Your " + insertPokemon.pokemonName + " learnt " + insertPokemon.move3 + "!");
                        break;
                    } else if (op2.equals("4")) {
                        System.out.println("Your " + insertPokemon.pokemonName + " forgot " + insertPokemon.move4 + "...");
                        insertPokemon.move4 = newMove;
                        System.out.println("Your " + insertPokemon.pokemonName + " learnt " + insertPokemon.move4 + "!");
                        break;
                    }

                } else if (op1.equals("No")) {
                    System.out.println("Your " + insertPokemon.pokemonName + " did not learn " + newMove + ".");
                }
            }
        }
    }
    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}

