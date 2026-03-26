import java.util.*;
public class Solution {
    public static int toys(List<Integer> w) {
        Collections.sort(w);
        int containers = 0;
        int i = 0;
        int n = w.size();
        while (i < n) {
            containers++;  
            int minWeight = w.get(i);
            int limit = minWeight + 4;

            // pack as many as possible
            while (i < n && w.get(i) <= limit) {
                i++;
            }
        }
        return containers;
    }
}
