package top_interview_questions.leet_code.daily_problem;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * 229. Majority Element II
 * Medium
 * 8.6K
 * 379
 * company
 * Amazon
 * company
 * Adobe
 * company
 * Google
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: [3]
 * Example 2:
 *
 * Input: nums = [1]
 * Output: [1]
 * Example 3:
 *
 * Input: nums = [1,2]
 * Output: [1,2]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5 * 104
 * -109 <= nums[i] <= 109
 *
 *
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 * */

public class MajorElementII {

    //Boyer moore's Theorem
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;

        Integer number1 = null;
        Integer number2 = null;

        for (int n : nums) {

            if (number1 != null && number1 == n)
                count1 ++;
            else if (number2 != null && number2 == n)
                count2 ++;
            else if (count1 == 0) {
                number1 = n;
                count1++;
            } else if (count2 == 0) {
                number2 = n;
                count2 ++;
            }
            else {
                count1 --;
                count2 --;
            }
        }

        List<Integer> majEle = new ArrayList<Integer>(2);

        count1 = 0;
        count2 = 0;

        for (int n : nums) {

            if ( number1 != null && number1 == n ) count1 ++;
            if ( number2 != null && number2 == n ) count2 ++;

        }

        int n = nums.length;

        if (count1 > (n/3)) majEle.add(number1);
        if (count2 > (n/3)) majEle.add(number2);

        return majEle;

    }


}
