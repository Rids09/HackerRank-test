// package .git;

public class MinCost {
    public static int minCost(int n, int k, int[] nums) {

    if (n == 0) return 0;

    int[] dp = new int[n];
    dp[0] = nums[0];

    for (int i = 1; i < n; i++) {

        int min = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                min = Math.min(min, dp[i - j]);
            }
        }

        dp[i] = nums[i] + min;
    }

    return dp[n - 1];
}
    
}
