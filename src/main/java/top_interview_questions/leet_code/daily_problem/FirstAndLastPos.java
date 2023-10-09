package top_interview_questions.leet_code.daily_problem;


import java.util.ArrayList;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Medium
 * 18.9K
 * 457
 * company
 * Facebook
 * company
 * Adobe
 * company
 * Amazon
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given
 * target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 *
 * */
public class FirstAndLastPos {

    public int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        //for finding the starting position.
        int lower = 0;
        int higherIndex = nums.length - 1;

        while (lower <= higherIndex) {

            int mid = lower + ((higherIndex - lower) / 2);
            if (nums[mid] == target) {
                result[0] = mid;
                higherIndex = mid -1;
            }
            else if (nums[mid] > target)
                higherIndex = mid - 1;
            else
                lower = mid + 1;
        }

        lower = 0;
        higherIndex = nums.length - 1;

        while (lower <= higherIndex) {

            int mid = lower + ((higherIndex - lower) / 2);
            if (nums[mid] == target) {
                result[1] = mid;
                lower = mid + 1;
            }
            else if (nums[mid] > target)
                higherIndex = mid - 1;
            else
                lower = mid + 1;
        }


        return result;
    }


}
