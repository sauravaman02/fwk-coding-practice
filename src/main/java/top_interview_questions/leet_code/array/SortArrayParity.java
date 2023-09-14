package top_interview_questions.leet_code.array;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 * */
public class SortArrayParity {

    public int[] sortArrayByParity(int[] nums) {

        for (int current = 0, odd = 0; current < nums.length; current ++ ) {

            if ((nums[current] & 1) == 0) {
                // swap with last known odd location.
                int temp = nums[current];
                nums[current] = nums[odd];
                nums[odd] = temp;

                odd++;
            }
        }

        return nums;
    }

}
