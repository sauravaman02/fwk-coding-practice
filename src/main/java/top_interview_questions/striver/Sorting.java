package top_interview_questions.striver;

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



    public static void main(String[] args) {

        Arrays.stream(selectionSort( new int[]{2, 13, 4, 1, 3, 6, 28})).forEach(System.out::println);

    }
}
