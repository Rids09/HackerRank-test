import java.util.Arrays;
import java.util.List;
public class StringGridChallenge {
    public static String gridChallenge(List<String> grid) {
    for (int i = 0; i < grid.size(); i++) {
        char[] c = grid.get(i).toCharArray();
        Arrays.sort(c);
        grid.set(i, new String(c));
    }
    for (int col = 0; col < grid.get(0).length(); col++) {
        for (int row = 0; row < grid.size() - 1; row++) {
            if (grid.get(row).charAt(col) > grid.get(row + 1).charAt(col)) {
                return "NO";
            }
        }
    }

    return "YES";
}
    
}
