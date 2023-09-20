package top_interview_questions.leet_code.array;

/***
 *
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 *
 * Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NumbersDissapearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> dissapearedList = new ArrayList<>();
        Arrays.sort(nums);
        int counter = nums[0];

        for (int i = 1; i < nums.length; i++) {

            while (nums[i] != counter + 1) {
                dissapearedList.add(counter);
                counter ++;
            }
            counter = nums[i];

        }
        return dissapearedList;

    }
}
