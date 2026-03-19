import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
    int luck = 0;
    
    List<Integer> important = new ArrayList<>();
    for (List<Integer> contest : contests) {
        int L = contest.get(0);
        int T = contest.get(1);
        
        if (T == 0) {
            luck += L; 
        } else {
            important.add(L);
        }
    }
    
    Collections.sort(important, Collections.reverseOrder());
    for (int i = 0; i < important.size(); i++) {
        if (i < k) {
            luck += important.get(i); 
        } else {
            luck -= important.get(i); 
        }
    }
    
    return luck;
}
    
}
