//
//import top_interview_questions.leet_code.daily_problem.DecodedStringIndex;
//import top_interview_questions.leet_code.daily_problem.NumberOfFlowersInFoolBloom;
//import top_interview_questions.sorting.InsertionSort;
//import top_interview_questions.sorting.MergeSort;
//import top_interview_questions.sorting.SelectionSort;
//
//import java.util.*;
//
//public class Entrypoint {
//
//    public static void main(String[] args) {
//
//        NumberOfFlowersInFoolBloom numberOfFlowersInFoolBloom = new NumberOfFlowersInFoolBloom();
//
//
//        int [][] flowers = {{1,6},{3,7},{9,12},{4,13}};
//        int [] people = {2,3,7,11};
//
//        numberOfFlowersInFoolBloom.fullBloomFlowers(flowers, people);
//
//    }
//
//
//    public static List<Integer> findSubsequence(List<Integer> arr) {
//        // Write your code here
//
//        int n = arr.size();
//
//        Map<Integer, Integer> lastIndex = new HashMap<>();
//
//        int[] dp = new int[n];
//
//        int[] prevIndex = new int[n];
//
//        int lastElementIndex = 0;
//
//        int maxLength = 1;
//        dp[0] = 1;
//        lastIndex.put(arr.get(0), 0);
//
//        for (int i = 1; i < n; i++) {
//            dp[i] = 1;
//            prevIndex[i] = -1;
//
//            // Check for each element before the current index
//            for (int j = 0; j < i; j++) {
//                if (arr.get(i) > arr.get(j) && dp[i] < dp[j] + 1) {
//                    dp[i] = dp[j] + 1;
//                    prevIndex[i] = j;
//                }
//            }
//
//            // Update the last index of the current element
//            lastIndex.put(arr.get(i), i);
//
//            // Update the last element index if a longer subsequence is found
//            if (dp[i] > maxLength) {
//                maxLength = dp[i];
//                lastElementIndex = i;
//            }
//        }
//
//
//        List<Integer> subsequence = new ArrayList<>();
//        while (lastElementIndex != -1) {
//            subsequence.add(arr.get(lastElementIndex));
//            lastElementIndex = prevIndex[lastElementIndex];
//        }
//
//        int subsequenceLength = subsequence.size();
//        int[] result = new int[subsequenceLength];
//
//        for (int i = 0; i < subsequenceLength; i++) {
//            result[i] = subsequence.get(subsequenceLength - i - 1);
//        }
//
//        Map<Integer, Integer> uniqueElements = new HashMap<>();
//
//        for (int i = 0; i < subsequenceLength; i++) {
//            uniqueElements.put(result[i], i);
//        }
//
//        if (uniqueElements.size() == subsequenceLength) {
//            return result;
//        } else {
//            return new int[]{-1};
//
//        }
//    }
//
//}
