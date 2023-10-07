package top_interview_questions.leet_code.daily_problem;

/**
 * 1420. Build Array Where You Can Find The Maximum Exactly K Comparisons
 * Hard
 * 1K
 * 64
 * company
 * Dunzo
 * You are given three integers n, m and k. Consider the following algorithm to find the maximum element of an array of positive integers:
 *
 *
 * You should build the array arr which has the following properties:
 *
 * arr has exactly n integers.
 * 1 <= arr[i] <= m where (0 <= i < n).
 * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
 * Return the number of ways to build the array arr under the mentioned conditions. As the answer may grow large,
 * the answer must be computed modulo 109 + 7.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, m = 3, k = 1
 * Output: 6
 * Explanation: The possible arrays are [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]
 * Example 2:
 *
 * Input: n = 5, m = 2, k = 3
 * Output: 0
 * Explanation: There are no possible arrays that satisify the mentioned conditions.
 * Example 3:
 *
 * Input: n = 9, m = 1, k = 1
 * Output: 1
 * Explanation: The only possible array is [1, 1, 1, 1, 1, 1, 1, 1, 1]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 50
 * 1 <= m <= 100
 * 0 <= k <= n
 * */
public class BuildArray {

    public int numOfArrays(int n, int m, int k) {
        int[][][] dp = new int[n + 1][m + 1][k + 1];
        int MOD = (int) 1e9 + 7;

        for (int num = 0; num < dp[0].length; num++) {
            dp[n][num][0] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int maxSoFar = m; maxSoFar >= 0; maxSoFar--) {
                for (int remain = 0; remain <= k; remain++) {
                    int ans = 0;
                    for (int num = 1; num <= maxSoFar; num++) {
                        ans = (ans + dp[i + 1][maxSoFar][remain]) % MOD;
                    }

                    if (remain > 0) {
                        for (int num = maxSoFar + 1; num <= m; num++) {
                            ans = (ans + dp[i + 1][num][remain - 1]) % MOD;
                        }
                    }

                    dp[i][maxSoFar][remain] = ans;
                }
            }
        }

        return dp[0][0][k];
    }
}
