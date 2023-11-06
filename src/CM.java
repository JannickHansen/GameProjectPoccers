public class CM {
    public static final String resetColour = "\u001B[0m";
    public static final String getNormal = "\u001B[37m";         // Normal
    public static final String getFire = "\u001B[31m";           // Fire
    public static final String getWater = "\u001B[34m";          // Water
    public static final String getElectric = "\u001B[93m";       // Electric
    public static final String getGrass = "\u001B[32m";          // Grass
    public static final String getIce = "\u001B[94m";            // Ice
    public static final String getFighting = "\u001B[38;5;202m"; // Fighting
    public static final String getPoison = "\u001B[35m";         // Poison
    public static final String getGround = "\u001B[33m";         // Ground
    public static final String getFlying = "\u001B[34m";         // Flying
    public static final String getPsychic = "\u001B[95m";        // Psychic
    public static final String getBug = "\u001B[38;5;28m";       // Bug
    public static final String getRock = "\u001B[38;5;130m";     // Rock
    public static final String getGhost = "\u001B[38;5;93m";     // Ghost
    public static final String getDragon = "\u001B[38;5;104m";   // Dragon
    public static final String getDark = "\u001B[38;5;237m";     // Dark
    public static final String getSteel = "\u001B[38;5;247m";    // Steel
    public static final String getFairy = "\u001B[38;5;213m";    // Fairy
    public static final String getItems = "\u001B[36m";
    public static final String getLevels = "\u001B[36m";

    // You can change colour codes without changing the rest of your code
    // aslong as you leave the call-names as they are.

        public static void main(String[] args) {
            System.out.println(CM.getNormal + "Normal" + CM.resetColour);
            System.out.println(CM.getFire + "Fire" + CM.resetColour);
            System.out.println(CM.getWater + "Water" + CM.resetColour);
            System.out.println(CM.getElectric + "Electric" + CM.resetColour);
            System.out.println(CM.getGrass + "Grass" + CM.resetColour);
            System.out.println(CM.getIce + "Ice" + CM.resetColour);
            System.out.println(CM.getFighting + "Fighting" + CM.resetColour);
            System.out.println(CM.getPoison + "Poison" + CM.resetColour);
            System.out.println(CM.getGround + "Ground" + CM.resetColour);
            System.out.println(CM.getFlying + "Flying" + CM.resetColour);
            System.out.println(CM.getPsychic + "Psychic" + CM.resetColour);
            System.out.println(CM.getBug + "Bug" + CM.resetColour);
            System.out.println(CM.getRock + "Rock" + CM.resetColour);
            System.out.println(CM.getGhost + "Ghost" + CM.resetColour);
            System.out.println(CM.getDragon + "Dragon" + CM.resetColour);
            System.out.println(CM.getDark + "Dark" + CM.resetColour);
            System.out.println(CM.getSteel + "Steel" + CM.resetColour);
            System.out.println(CM.getFairy + "Fairy" + CM.resetColour);
            System.out.println(CM.getItems + "Items" + CM.resetColour);
            System.out.println(CM.getLevels + "Levels" + CM.resetColour);
        }
    public static String cM(String moveType) {
        String colorCode;
        if (moveType.equals("Potion") || moveType.equals("Super Potion") || moveType.equals("Hyper Potion") || moveType.equals("Pokeball") || moveType.equals("Greatball") || moveType.equals("Ultraball")) {
            moveType = "Item";
        }
        switch (moveType) {
            case "Fire":
                colorCode = getFire;
                break;
            case "Water":
                colorCode = getWater;
                break;
            case "Electric":
                colorCode = getElectric;
                break;
            case "Grass":
                colorCode = getGrass;
                break;
            case "Ice":
                colorCode = getIce;
                break;
            case "Fighting":
                colorCode = getFighting;
                break;
            case "Poison":
                colorCode = getPoison;
                break;
            case "Ground":
                colorCode = getGround;
                break;
            case "Flying":
                colorCode = getFlying;
                break;
            case "Psychic":
                colorCode = getPsychic;
                break;
            case "Bug":
                colorCode = getBug;
                break;
            case "Rock":
                colorCode = getRock;
                break;
            case "Ghost":
                colorCode = getGhost;
                break;
            case "Dragon":
                colorCode = getDragon;
                break;
            case "Dark":
                colorCode = getDark;
                break;
            case "Steel":
                colorCode = getSteel;
                break;
            case "Fairy":
                colorCode = getFairy;
                break;
            case "Item":
                colorCode = getItems;
                break;
            default:
                colorCode = resetColour;
        }

        return colorCode;
    }
}
