package top_interview_questions.leet_code.daily_problem;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int newLength = nums1.length + nums2.length;
        int[] mergedArray = new int[newLength];
        double median = Double.MIN_VALUE;

        int i = 0, j = 0, k = 0;

        while(i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                mergedArray[k++] = nums1[i++];
            }
            else {
                mergedArray[k++] = nums2[j++];

            }
        }

        while(i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while(j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }


        if ((newLength & 1) == 1){
            return mergedArray[newLength/2];
        }
        else {
            return ((mergedArray[newLength/2] + mergedArray[(newLength/2) - 1]) / 2.0);
        }



    }
}
