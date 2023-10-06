package top_interview_questions.leet_code.daily_problem;

/**
 * 343. Integer Break
 * Medium
 * 4.3K
 * 394
 * company
 * Facebook
 * company
 * Apple
 * company
 * Google
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product
 * of those integers.
 *
 * Return the maximum product you can get.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: 2 = 1 + 1, 1 × 1 = 1.
 * Example 2:
 *
 * Input: n = 10
 * Output: 36
 * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 *
 *
 * Constraints:
 *
 * 2 <= n <= 58
 *
 * */
public class IntegerBreak {

    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int ans = 1;
        while (n > 4) {
            ans *= 3;
            n -= 3;
        }

        return ans * n;
    }
}
