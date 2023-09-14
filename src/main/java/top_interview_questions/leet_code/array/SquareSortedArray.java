package top_interview_questions.leet_code.array;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 * */
public class SquareSortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] sortedSquares = new int[nums.length];

        for(int i = 0; i<nums.length; i++) {

            sortedSquares[i] = nums[i] * nums[i];
        }

        Arrays.sort(sortedSquares);
        return sortedSquares;

    }

    public int[] sortedSquaresImproved(int[] nums) {

        int[] sortedSquares = new int[nums.length];
        int length = nums.length - 1;
        int left = 0, right = length ;

        for (int i = length; i >=0; i--) {

            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                sortedSquares[i] = nums[right] * nums[right];
                right--;
            } else {
                sortedSquares[i] = nums[left] * nums[left];
                left++;
            }

        }

        return sortedSquares;
    }
}
