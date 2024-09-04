import java.util.HashMap;
import java.util.Map;

public class ConvertReadStats {
    private static final Map<String, Integer> convertReadStats = new HashMap<>();
    static {
        for (int i = 1; i <= 99999; i++) {
            convertReadStats.put(String.valueOf(i), i);

        }
    }
    public static int convert(String key) {
        return convertReadStats.getOrDefault(key, 0);
    }
}