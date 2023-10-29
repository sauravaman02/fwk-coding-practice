package top_interview_questions.striver;

import com.sun.scenario.effect.Merge;
import top_interview_questions.sorting.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++){

            int min = i;

            for (int j = i ; j <= arr. length - 1; j++) {

                if(arr[min] > arr[j])
                    min = j;

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        return arr;

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 1; i --) {

            for (int j = 0; j <= i - 1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }

    public static int[] bubbleSortEnhanced(int[] arr) {

        for (int i = arr.length - 1; i >= 1; i --) {

            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }

            if (didSwap == 0)
                break;
        }

        return arr;

    }


    public static int[] insertionSort(int[] arr) {

        for(int i = 0; i<= arr.length - 1; i++) {

            int j = i;

            while(j > 0 && arr[j - 1] > arr[j]) {

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }

        return arr;
    }


    public static int[] mergeSort(int[] arr) {

        if(arr.length == 1)
            return arr;

        int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, arr.length/2));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));

        return merge(arr1, arr2);

    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] mergedArr = new int[arr1.length + arr2.length];

        int i = 0, k = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            }
            else {
                mergedArr[k++] = arr2[j++];
            }

        }

        while(i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }

        while(j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

    public static void ms(int[] arr, int low, int high) {

        if(low>=high)
            return;

        int mid = (low + high)/2;

        ms(arr, low, mid);
        ms(arr, mid+1, high);

        mergeNw(arr, low, mid, high);

    }

    public static void mergeNw(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){

            if(arr[left]<arr[right]){

                temp.add(arr[left]);

                left++;

            }

            else{

                temp.add(arr[right]);

                right++;

            }

        }

        while(left<=mid){

            temp.add(arr[left]);

            left++;

        }

        while(right<=high){

            temp.add(arr[right]);

            right++;

        }

        for (int i = low; i <= high; i++) {

            arr[i]=temp.get(i-low);

        }

    }

    public static int[] quickSort(int[] arr, int low, int high) {

        if(low < high) {
            int pIndex = pivot(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex+1, high);
        }

        return arr;

    }

    public static int pivot(int[] arr, int low, int high){

        int pivot = low;

        int i = low;
        int j = high;

        while(i < j) {

            while (i <= high && arr[i] <= arr[pivot]){
                i++;
            }
            while (j >= low && arr[j] > arr[pivot]){
                j--;
            }

            if (i < j){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;


    }



    public static void main(String[] args) {
        Arrays.stream(quickSort( new int[]{3, 168, 235, 626, 545, 684, 312, 452, 626, 403, 163, 188, 566, 744, 646,
                126, 629, 847, 522, 445, 237, 128, 891, 118, 14}, 0, 24)).forEach(System.out::println);
    }
}
