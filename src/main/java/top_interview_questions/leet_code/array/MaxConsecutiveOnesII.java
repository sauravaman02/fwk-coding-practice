package top_interview_questions.leet_code.array;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1,1,0]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1] and we have 3 consecutive ones.
 * The max number of consecutive ones is 4.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 4
 * Explanation:
 * - If we flip the first zero, nums becomes [1,1,1,1,0,1] and we have 4 consecutive ones.
 * - If we flip the second zero, nums becomes [1,0,1,1,1,1] and we have 4 consecutive ones.
 * The max number of consecutive ones is 4.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * */
public class MaxConsecutiveOnesII {

    public int findMaxConsecutiveOnes(int[] nums) {

        int noOfZeroes = 0;
        int left = 0;
        int right = 0;
        int longestSequence = 0;

        while (right < nums.length) {

            if (nums[right] == 0)
                noOfZeroes++;

            while (noOfZeroes == 2) {
                if (nums[left] == 0)
                    noOfZeroes--;
                left++;
            }

            longestSequence = Math.max(longestSequence, right - left + 1);
            right++;
        }

        return longestSequence;
    }
}
