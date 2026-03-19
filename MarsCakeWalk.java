import java.io.*;
import java.util.*;

class Result {
    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie, Collections.reverseOrder());

        long sum = 0;

        for (int i = 0; i < calorie.size(); i++) {
            sum += (long) Math.pow(2, i) * calorie.get(i);
        }

        return sum;
    }
}
public class MarsCakeWalk {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> calorie = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            calorie.add(sc.nextInt());
        }

        long result = Result.marcsCakewalk(calorie);

        System.out.println(result);

        sc.close();
    }
}