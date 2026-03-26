import java.util.*;
public class Solution {
  public static int beautifulPairs(List<Integer> A, List<Integer> B) {
Map<Integer, Integer> freqA = new HashMap<>();
        Map<Integer, Integer> freqB = new HashMap<>();
        for (int x : A) {
            freqA.put(x, freqA.getOrDefault(x, 0) + 1);
        }
        for (int x : B) {
            freqB.put(x, freqB.getOrDefault(x, 0) + 1);
        }

        int matches = 0;
        for (int key : freqA.keySet()) {
            if (freqB.containsKey(key)) {
                matches += Math.min(freqA.get(key), freqB.get(key));
            }
        }

        if (matches < A.size()) {
            return matches + 1;
        } else {
            return matches - 1;
        }
    }
}
