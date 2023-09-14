package top_interview_questions.leet_code;

import java.util.Arrays;

public class Search {

    public int binarySearch(int[] arr, int value, boolean sorted) {

        if( !sorted )
            Arrays.sort(arr);

        int lower = 0;
        int higherIndex = arr.length - 1;

        while (lower <= higherIndex) {

            int mid = lower + ((higherIndex - lower) / 2);
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] > value) {
                higherIndex = mid -1;
            }
            else
                lower = mid + 1;
        }
        return -1;
    }
}
