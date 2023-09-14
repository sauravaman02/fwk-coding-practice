package top_interview_questions.leet_code.array;

import top_interview_questions.leet_code.Search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DoubleExists {

    /**
     * Given an array arr of integers, check if there exist two indices i and j such that :
     *
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     *
     *
     * Example 1:
     *
     * Input: arr = [10,2,5,3]
     * Output: true
     * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
     * Example 2:
     *
     * Input: arr = [3,1,7,11]
     * Output: false
     * Explanation: There is no i and j that satisfy the conditions.
     *
     *
     * Constraints:
     *
     * 2 <= arr.length <= 500
     * -103 <= arr[i] <= 103
     * */
    public boolean checkIfExist(int[] arr) {

        Map<Double, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if ((indexMap.containsKey(arr[i] * 2.0) && i != indexMap.get(arr[i] * 2.0)) ||
                    (indexMap.containsKey(arr[i] / 2.0) && i != indexMap.get(arr[i] / 2.0))) {
                return true;
            }
            else {
                indexMap.put((double) (arr[i]), i);
            }
        }

        return false;

    }

    public boolean checkIfExistBinarySearch(int[] arr) {

        Arrays.sort(arr);

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            Search search = new Search();
            int index = search.binarySearch(arr, 2 * arr[i], true);
            if (index != i && index != -1)
                return true;
        }
        return false;

    }
}
