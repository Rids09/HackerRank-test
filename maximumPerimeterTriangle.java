import java.util.*;
public class Solution {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
          int n = sticks.size();
        for (int i = n - 1; i >= 2; i--) {
            int a = sticks.get(i - 2);
            int b = sticks.get(i - 1);
            int c = sticks.get(i);

            if (a + b > c) {
                return Arrays.asList(a, b, c);
            }
        }

        return Arrays.asList(-1);
    }
}
