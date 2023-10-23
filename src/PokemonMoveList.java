import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonMoveList {
    String moveID;
    String moveName;
    int basePower;
    boolean priorityMove;
    String moveType;
    PokemonMoveList(String MoveID) {

        this.moveID = MoveID;
    }
    public void getMoveData(ArrayList<String> foundMove) {
        moveName = extractData(foundMove.get(0), 0);
        String movePower = extractData(foundMove.get(0), 1);
        String priorityCheck = extractData(foundMove.get(0),2);
        moveType = extractData(foundMove.get(0), 3);
        priorityMove = priorityCheck(priorityCheck);

        basePower = convertReadBasePower.getOrDefault(movePower, 0);
    }
    public ArrayList<String> getMove(String moveID) throws IOException {
        FileReader MoveList = new FileReader("MoveList.txt");
        BufferedReader readIn = new BufferedReader(MoveList);
        ArrayList<String> foundMove = new ArrayList<>();

        String line;
        while ((line = readIn.readLine()) != null) {
            if (line.contains(moveID)) {
                //System.out.println(line); // testlinje
                foundMove.add(line);
            }
        }
        readIn.close();
        return foundMove;
    }
    public String extractData(String baseMove, int i) {
        String[] parts = baseMove.split(",");
        return parts[i];
    }
    public boolean priorityCheck(String priorityMove) {
        if (priorityMove.equals("1")) {
            return true;
        }
        else if (priorityMove.equals("0"))
            return false;
        else return false;
        }
    private static final Map<String, Integer> convertReadBasePower = new HashMap<>();
    static {
        convertReadBasePower.put("5", 5);
        convertReadBasePower.put("10", 10);
        convertReadBasePower.put("15", 15);
        convertReadBasePower.put("20", 20);
        convertReadBasePower.put("25", 25);
        convertReadBasePower.put("30", 30);
        convertReadBasePower.put("35", 35);
        convertReadBasePower.put("40", 40);
        convertReadBasePower.put("45", 45);
        convertReadBasePower.put("50", 50);
        convertReadBasePower.put("55", 55);
        convertReadBasePower.put("60", 60);
        convertReadBasePower.put("65", 65);
        convertReadBasePower.put("70", 70);
        convertReadBasePower.put("75", 75);
        convertReadBasePower.put("80", 80);
        convertReadBasePower.put("85", 85);
        convertReadBasePower.put("90", 90);
        convertReadBasePower.put("95", 95);
        convertReadBasePower.put("100", 100);
        convertReadBasePower.put("105", 105);
        convertReadBasePower.put("110", 110);
        convertReadBasePower.put("115", 115);
        convertReadBasePower.put("120", 120);
    }
}
