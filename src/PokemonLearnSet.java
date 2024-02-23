import java.io.IOException;
import java.util.Scanner;

public class PokemonLearnSet {
    Scanner tastatur = new Scanner(System.in);
    PokemonLearnSet() {
    }

    void LearnSet(GeneratedPokemon insertPokemon) throws IOException {
        switch (insertPokemon.pokemonName) {
            case "Spheal":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move2 = "Dive";
                        insertPokemon.move3 = "Double Hit";
                        insertPokemon.move4 = "Rollout";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Play Rough");
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Powder Snow");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Ice Ball");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Body Slam");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Ice Beam");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Blizzard");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Sheer Cold");
                        break;
                }
                break;
            case "Charmander":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Fire Spin");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang");
                        break;
                    case 20:
                        learnAndPrintMove(insertPokemon, "Slash");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Flamethrower");
                        break;
                }
                break;
            case "Charmeleon":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Ember";
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Slash");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Flamethrower");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Dragon Breath");
                        break;
                }
                break;
            case "Charizard":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Dragon Claw";
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Ember");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Metal Claw");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Fire Fang");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Slash");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Flamethrower");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Dragon Breath");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Fly");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Flare Blitz");
                        break;
                }
                break;
            case "Squirtle":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam");
                        break;
                }

                break;
            case "Wartortle":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam");
                        break;
                }
                break;
            case "Blastoise":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Ice Beam");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                }
                break;
            case "Bulbasaur":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf");
                        break;
                }
                break;
            case "Ivysaur":
                switch (insertPokemon.lvl) {
                    case 5:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Sludge");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Seed Bomb");
                        break;
                }
                break;
            case "Venusaur":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Vine Whip");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Razor Leaf");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Seed Bomb");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Solar Beam");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                }
                break;
            case "Rattata":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Hyper Fang");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Super Fang");
                        break;
                }
                break;
            case "Raticate":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 4:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Hyper Fang");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Super Fang");
                        break;
                }
                break;
            case "Pidgey":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Gust");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Wing Attack");
                        break;
                }
                break;
            case "Pidgeotto":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Gust";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Wing Attack");
                        break;
                }
                break;
            case "Pidgeot":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Gust");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Twister");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Wing Attack");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Hurricane");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Brave Bird");
                        break;
                }
                break;
            case "Piplup":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Pound";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Peck");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Bubble Beam");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Fury Attack");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Brine");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Drill Peck");
                        break;
                }
                break;

            case "Prinplup":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Peck");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Metal Claw");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Bubble Beam");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Fury Attack");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Brine");
                        break;
                    case 46:
                        learnAndPrintMove(insertPokemon, "Drill Peck");
                        break;
                }
                break;

            case "Empoleon":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move4 = "Flash Cannon";
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Peck");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Metal Claw");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Bubble Beam");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Fury Attack");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Brine");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Flash Cannon");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Drill Peck");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                    case 55:
                        learnAndPrintMove(insertPokemon, "Blizzard");
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
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Ice Fang");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Superpower");
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
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Ice Fang");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 42:
                        learnAndPrintMove(insertPokemon, "Superpower");
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
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Ice Fang");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Chip Away");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Blizzard");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Aqua Tail");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Superpower");
                        break;
                }
                break;

            case "Lotad":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                }
                break;

            case "Lombre":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Astonish";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Fury Swipes");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
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
                        learnAndPrintMove(insertPokemon, "Fury Swipes");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Hydro Pump");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
                        break;
                }
                break;

            case "Slowpoke":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Confusion");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Headbutt");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Psychic");
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
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bubble");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Confusion");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Headbutt");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Psychic");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Power Gem");
                        break;
                }
                break;
            case "Slowking":
                switch (insertPokemon.lvl) {
                    case 6:
                        learnAndPrintMove(insertPokemon, "Confusion");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Psychic");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Power Gem");
                        break;
                }
                break;
            case "Bidoof":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Pound");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Rollout");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Headbutt");
                        break;
                }
                break;
            case "Bibarel":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Rollout");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Headbutt");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Hyper Fang");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Super Fang");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Hyper Beam");
                        break;
                }
                break;
            case "Eevee":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Return");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Play Rough");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Double-Edge");
                        break;
                }
                break;
            case "Tauros":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Rage");
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Horn Attack");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Pursuit");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Double-Edge");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Thrash");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Earthquake");
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
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Mud Bomb");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Rock Tomb");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Ice Ball");
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
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Rock Tomb");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Mud Bomb");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Icy Wind");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Blizzard");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Ancient Power");
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
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Rock Tomb");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Mud Bomb");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Icy Wind");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Blizzard");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                }
            case "Absol":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Pursuit");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Night Slash");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Psycho Cut");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Shadow Claw");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Guillotine");
                        break;
                }
                break;
            case "Caterpie":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Bug Bite");
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
                        learnAndPrintMove(insertPokemon, "Confusion");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Gust");
                        break;
                    case 20:
                        learnAndPrintMove(insertPokemon, "Pin Missile");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Bug Buzz");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Air Slash");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Silver Wind");
                        break;
                }
                break;
            case "Weedle":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Bug Bite");
                        break;
                }
                break;
            case "Beedrill":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Poison Sting";
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Fury Attack");
                        break;
                    case 18:
                        learnAndPrintMove(insertPokemon, "Twin Needle");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Poison Jab");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Bug Buzz");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Air Slash");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "X-Scissor");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb");
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
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 11:
                        learnAndPrintMove(insertPokemon, "Water Gun");
                        break;
                }
                break;
            case "Masquerain":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bubble";
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Air Cutter");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Water Pulse");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Bug Buzz");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Air Slash");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Silver Wind");
                        break;
                }
                break;
            case "Gastly":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Lick";
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Night Shade");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball");
                        break;
                }
                break;
            case "Haunter":
                switch (insertPokemon.lvl) {
                    case 1:
                        learnAndPrintMove(insertPokemon, "Lick");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Dream Eater");
                        break;
                }
                break;
            case "Gengar":
                switch (insertPokemon.lvl) {
                    case 1:
                        learnAndPrintMove(insertPokemon, "Lick");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Shadow Ball");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Dark Pulse");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Dream Eater");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Dazzling Gleam");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Poison Jab");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Phantom Force");
                        break;
                }
                break;
            case "Larvitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Rock Throw");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Rock Tomb");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Chip Away");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Rock Slide");
                        break;
                }
                break;
            case "Pupitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Magnitude");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Rock Slide");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Dark Pulse");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Stone Edge");
                        break;
                }
                break;
            case "Tyranitar":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Bite";
                        break;
                    case 56:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                    case 60:
                        learnAndPrintMove(insertPokemon, "Hyper Beam");
                        break;
                }
                break;
            case "Ekans":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Wrap";
                        break;
                    case 9:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Sludge");
                        break;
                }
                break;
            case "Arbok":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Wrap";
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Mud Bomb");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                }
                break;
            case "Nidoran♀", "Nidoran♂":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Fury Swipes");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                }
                break;

            case "Nidorina":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Fury Swipes");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Bite");
                        break;
                }
                break;

            case "Nidorino":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Peck";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Fury Swipes");
                        break;
                    case 26:
                        learnAndPrintMove(insertPokemon, "Horn Attack");
                        break;
                }
                break;

            case "Nidoqueen":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Earthquake");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Stone Edge");
                        break;
                    case 43:
                        learnAndPrintMove(insertPokemon, "Body Slam");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Blizzard");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Super Power");
                        break;
                }
                break;

            case "Nidoking":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Scratch";
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Tackle");
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Poison Sting");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Earth Power");
                        break;
                    case 42:
                        learnAndPrintMove(insertPokemon, "Body Slam");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Sludge Wave");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Megahorn");
                        break;
                }
                break;
            case "Ponyta":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Fire Spin");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Ember");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Stomp");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Inferno");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Fire Blast");
                        break;
                    case 53:
                        learnAndPrintMove(insertPokemon, "Bounce");
                        break;
                }
                break;
            case "Rapidash":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move2 = "Fire Spin";
                        insertPokemon.move3 = "Ember";
                        break;
                    case 21:
                        learnAndPrintMove(insertPokemon, "Ember");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Stomp");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Flame Wheel");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Inferno");
                        break;
                    case 55:
                        learnAndPrintMove(insertPokemon, "Bounce");
                        break;
                }
                break;
            case "Miltank":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Stomp");
                        break;
                    case 15:
                        learnAndPrintMove(insertPokemon, "Milk Drink");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Rollout");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Body Slam");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Zen Headbutt");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Bulldoze");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Gyro Ball");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Giga Impact");
                        break;
                }
                break;
            case "Girafarig":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Astonish");
                        break;
                    case 10:
                        learnAndPrintMove(insertPokemon, "Confusion");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Stomp");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Psybeam");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Double Hit");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Crunch");
                        break;
                    case 46:
                        learnAndPrintMove(insertPokemon, "Psychic");
                        break;
                }
                break;
            case "Mareep":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon, "Thunder Shock");
                        break;
                    case 14:
                        learnAndPrintMove(insertPokemon, "Charge Beam");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 36:
                        learnAndPrintMove(insertPokemon, "Electro Ball");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Discharge");
                        break;
                }
                break;
            case "Flaffy":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 22:
                        learnAndPrintMove(insertPokemon, "Thunder Punch");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Electro Ball");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Discharge");
                        break;
                }
                break;
            case "Ampharos":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Electro Ball");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Power Gem");
                        break;
                    case 37:
                        learnAndPrintMove(insertPokemon, "Thunderball");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Dazzling Gleam");
                        break;
                    case 47:
                        learnAndPrintMove(insertPokemon, "Hyper Beam");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon, "Thunder");
                        break;
                    case 56:
                        learnAndPrintMove(insertPokemon, "Zap Cannon");
                        break;
                }
                break;
            case "Ditto":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Transform";
                        break;
                }
                break;
            case "Buneary":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Pound";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Double Hit");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Slash");
                        break;
                }
                break;
            case "Lopunny":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Pound";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Double Hit");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Quick Attack");
                        break;
                    case 19:
                        learnAndPrintMove(insertPokemon, "Double Kick");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon, "Flail");
                        break;
                    case 29:
                        learnAndPrintMove(insertPokemon, "Slash");
                        break;
                    case 33:
                        learnAndPrintMove(insertPokemon, "Fire Punch");
                        break;
                    case 34:
                        learnAndPrintMove(insertPokemon, "Thunder Punch");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Ice Punch");
                        break;
                    case 41:
                        learnAndPrintMove(insertPokemon, "Take Down");
                        break;
                    case 46:
                        learnAndPrintMove(insertPokemon, "Bounce");
                        break;

                }
                break;
            case "Oddish":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Absorb";
                        break;
                    case 7:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 12:
                        learnAndPrintMove(insertPokemon, "Acid");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Vine Whip");
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 27:
                        learnAndPrintMove(insertPokemon, "Razor Leaf");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Seed Bomb");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 50:
                        learnAndPrintMove(insertPokemon, "Moonblast");
                        break;
                }
                break;
            case "Gloom":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Absorb";
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Seed Bomb");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Moonblast");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Poison Jab");
                        break;

                }
                break;
            case "Vileplume", "Bellossom":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Absorb";
                        break;
                    case 24:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 31:
                        learnAndPrintMove(insertPokemon, "Seed Bomb");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Energy Ball");
                        break;
                    case 44:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                    case 49:
                        learnAndPrintMove(insertPokemon, "Moonblast");
                        break;
                    case 52:
                        learnAndPrintMove(insertPokemon, "Sludge Bomb");
                        break;
                    case 56:
                        learnAndPrintMove(insertPokemon, "Solarbeam");
                        break;
                }
                break;
            case "Hoppip", "Skiploom":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bullet Seed");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Air Cutter");
                        break;
                    case 40:
                        learnAndPrintMove(insertPokemon, "Bounce");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                }
                break;
            case "Jumpluff":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        break;
                    case 6:
                        learnAndPrintMove(insertPokemon, "Absorb");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon, "Bullet Seed");
                        break;
                    case 16:
                        learnAndPrintMove(insertPokemon, "Leech Seed");
                        break;
                    case 25:
                        learnAndPrintMove(insertPokemon, "Mega Drain");
                        break;
                    case 32:
                        learnAndPrintMove(insertPokemon, "Air Cutter");
                        break;
                    case 38:
                        learnAndPrintMove(insertPokemon, "Moonblast");
                        break;
                    case 42:
                        learnAndPrintMove(insertPokemon, "Bounce");
                        break;
                    case 46:
                        learnAndPrintMove(insertPokemon, "Giga Drain");
                        break;
                }
                break;
            case "Phantump", "Trevenant":
                switch (insertPokemon.lvl) {
                    case 1:
                        insertPokemon.move1 = "Tackle";
                        insertPokemon.move2 = "Branch Poke";
                        break;
                    case 5:
                        learnAndPrintMove(insertPokemon, "Astonish");
                        break;
                    case 8:
                        learnAndPrintMove(insertPokemon,"Leech Seed");
                        break;
                    case 13:
                        learnAndPrintMove(insertPokemon,"Shadow Sneak");
                        break;
                    case 17:
                        learnAndPrintMove(insertPokemon,"Razor Leaf");
                        break;
                    case 23:
                        learnAndPrintMove(insertPokemon,"Shadow Claw");
                        break;
                    case 28:
                        learnAndPrintMove(insertPokemon,"Horn Leech");
                        break;
                    case 35:
                        learnAndPrintMove(insertPokemon, "Shadow Ball");
                        break;
                    case 39:
                        learnAndPrintMove(insertPokemon, "Wood Hammer");
                        break;
                    case 45:
                        learnAndPrintMove(insertPokemon,"Phantom Force");
                        break;
                    case 51:
                        learnAndPrintMove(insertPokemon,"Leaf Storm");
                }
                break;
        }
    }
    private void learnAndPrintMove (GeneratedPokemon insertPokemon, String newMove) throws IOException {
        if (newMove.equals(insertPokemon.move1) || newMove.equals(insertPokemon.move2) || newMove.equals(insertPokemon.move3) || newMove.equals(insertPokemon.move4)) {}
        else if (insertPokemon.move2.equals(" ")) {
            insertPokemon.move2 = newMove;
            System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour+ " learnt " + CM.cM(callMove(newMove).moveType) + newMove + CM.resetColour + "!");
        }
        else if (insertPokemon.move3.equals(" ")) {
            insertPokemon.move3 = newMove;
            System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour+ " learnt " + CM.cM(callMove(newMove).moveType) + newMove + CM.resetColour + "!");
        }
        else if (insertPokemon.move4.equals(" ")) {
            insertPokemon.move4 = newMove;
            System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour+ " learnt " + CM.cM(callMove(newMove).moveType) + newMove + CM.resetColour + "!");
        }
        else {
            System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " is trying to learn " + CM.cM(callMove(newMove).moveType) + newMove + CM.resetColour + "!");
            System.out.println("Will you replace it with a move your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " already knows?");
            System.out.println("Yes / No");
            while (true) {
                String op1 = tastatur.next();
                op1 = spellingControl(op1);
                if (op1.equals("Yes")) {
                    System.out.println("Select a move to forget:");
                    System.out.println("1. " + CM.cM(callMove(insertPokemon.move1).moveType) + insertPokemon.move1 + CM.resetColour);
                    System.out.println("2. " + CM.cM(callMove(insertPokemon.move2).moveType) + insertPokemon.move2 + CM.resetColour);
                    System.out.println("3. " + CM.cM(callMove(insertPokemon.move3).moveType) + insertPokemon.move3 + CM.resetColour);
                    System.out.println("4. " + CM.cM(callMove(insertPokemon.move4).moveType) + insertPokemon.move4 + CM.resetColour);
                    String op2 = tastatur.next();
                    if (op2.equals("1")) {
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " forgot "+ CM.cM(callMove(insertPokemon.move1).moveType) + insertPokemon.move1 + CM.resetColour + "...");
                        insertPokemon.move1 = newMove;
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " learnt " + CM.cM(callMove(insertPokemon.move1).moveType) + insertPokemon.move1 + CM.resetColour + "!");
                        System.out.println();
                        break;
                    } else if (op2.equals("2")) {
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " forgot " + CM.cM(callMove(insertPokemon.move2).moveType) + insertPokemon.move2 + CM.resetColour + "...");
                        insertPokemon.move2 = newMove;
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " learnt " + CM.cM(callMove(insertPokemon.move2).moveType) + insertPokemon.move2 + CM.resetColour + "!");
                        System.out.println();
                        break;
                    } else if (op2.equals("3")) {
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " forgot " + CM.cM(callMove(insertPokemon.move3).moveType) + insertPokemon.move3 + CM.resetColour + "...");
                        insertPokemon.move3 = newMove;
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " learnt " + CM.cM(callMove(insertPokemon.move3).moveType) + insertPokemon.move3 + CM.resetColour + "!");
                        System.out.println();
                        break;
                    } else if (op2.equals("4")) {
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " forgot " + CM.cM(callMove(insertPokemon.move4).moveType) + insertPokemon.move4 + CM.resetColour + "...");
                        insertPokemon.move4 = newMove;
                        System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " learnt " + CM.cM(callMove(insertPokemon.move4).moveType) + insertPokemon.move4 + CM.resetColour + "!");
                        System.out.println();
                        break;
                    }

                } else if (op1.equals("No")) {
                    System.out.println("Your " + CM.cM(insertPokemon.pokemonType1) + insertPokemon.pokemonName + CM.resetColour + " did not learn " + CM.cM(callMove(newMove).moveType) + newMove + ".");
                    System.out.println();
                    break;
                }
            }
        }
    }
    public String spellingControl(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    public PokemonMoveList callMove(String moveID) throws IOException {
        PokemonMoveList findMove = new PokemonMoveList(moveID);
        findMove.getMoveData(findMove.getMove(moveID));

        return findMove;
    }
}

