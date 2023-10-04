package top_interview_questions.leet_code.daily_problem;

import java.util.HashMap;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                count += map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }

        }

        return count;

    }
}
