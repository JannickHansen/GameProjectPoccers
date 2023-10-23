import java.util.concurrent.ThreadLocalRandom;
public class GenerateStats {
    int atk = randomizeAtk();
    int def = randomizeDef();
    int spd = randomizeSpd();
    int hp = randomizeHp();
    int natureChangeAtk;
    int natureChangeDef;
    int natureChangeSpd;
    GenerateStats() {
    }
    int randomizeAtk() {
        atk = ThreadLocalRandom.current().nextInt(0,31+1);
        return atk;
    }
    int randomizeDef() {
        def = ThreadLocalRandom.current().nextInt(0, 31+1);
        return def;
    }
    int randomizeSpd() {
        spd = ThreadLocalRandom.current().nextInt(0,31+1);
        return spd;
    }
    int randomizeHp() {
        hp = ThreadLocalRandom.current().nextInt(0,31+1);
        return hp;
    }
    String decideNature() {
        int chooseNature = ThreadLocalRandom.current().nextInt(1,7+1);
        return switch (chooseNature) {
            case 1 -> "Bashful"; // neutral
            case 2 -> "Naughty"; // +atk -def
            case 3 -> "Brave"; //+atk -spd
            case 4 -> "Bold"; // +def -atk
            case 5 -> "Relaxed"; //+def -spd
            case 6 -> "Timid"; //+spd -atk
            case 7 -> "Hasty"; //+spd -def
            default -> "Bashful";
        };
    }
    void natureStatChange(String nameNature) {
        switch (nameNature) {
            case "Bashful":
                natureChangeAtk = 0;
                natureChangeDef = 0;
                natureChangeSpd = 0;
                break;
            case "Naughty":
                natureChangeAtk = 10;
                natureChangeDef = -10;
                natureChangeSpd = 0;
                break;
            case "Brave":
                natureChangeAtk = 10;
                natureChangeDef = 0;
                natureChangeSpd = -10;
                break;
            case "Bold":
                natureChangeAtk = -10;
                natureChangeDef = 10;
                natureChangeSpd = 0;
                break;
            case "Relaxed":
                natureChangeAtk = 0;
                natureChangeDef = 10;
                natureChangeSpd = -10;
                break;
            case "Timid":
                natureChangeAtk = -10;
                natureChangeDef = 0;
                natureChangeSpd = 10;
                break;
            case "Hasty":
                natureChangeAtk = 0;
                natureChangeDef = -10;
                natureChangeSpd = 10;
                break;
        }
    }
}
