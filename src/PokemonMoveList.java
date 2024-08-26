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

        basePower = ConvertReadStats.convert(movePower);
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
}
