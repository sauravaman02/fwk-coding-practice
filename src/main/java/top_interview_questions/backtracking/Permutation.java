package top_interview_questions.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 * */
public class Permutation {

    public void permuteRec(int[] nums, int begin, List<List<Integer>> result) {
        if (begin == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums) temp.add(num);
            result.add(temp);
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            // Swap
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;

            permuteRec(nums, begin + 1, result);

            // Swap back
            temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
        }
    }

    public void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] nums){

        if (tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
        }

        for (int num: nums) {

            if(tempList.contains(num))
                continue;

            tempList.add(num);
            backTrack(result, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permuteRec(nums, 0, result);

        backTrack(result, new ArrayList<>(), nums);
        return result;
    }
}
