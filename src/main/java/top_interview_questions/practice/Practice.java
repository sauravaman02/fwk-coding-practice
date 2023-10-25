package top_interview_questions.practice;

import java.util.Arrays;

public class Practice {

    public static int sumOfNumbers(int num){

        if (num == 0)
            return 0;

        return num + sumOfNumbers(num - 1);

    }

    public static int factorial(int num){

        if (num == 1)
            return 1;

        return num * factorial(num - 1);

    }

    public static int[] reverseArr(int[] arr, int index){

        if(index >= arr.length/2)
            return arr;

        swap(arr, index, arr.length - index -1);

        return reverseArr(arr, index + 1);

    }

    public static int[] reverseArrTwoPtr(int[] arr, int index, int length) {

        if (index >= length)
            return arr;

        swap(arr, index, length);

        return reverseArrTwoPtr(arr, index + 1, length - 1);

    }

    public static int[] swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;

        return arr;
    }

    public static int fib(int num) {

        if (num <= 1)
            return num;

        return fib(num - 2) + fib(num - 1);

    }

    public static int[] characterHashing(String str) {

        int[] frequencyHash = new int[26];

        for (int i = 0; i < str.length(); i++) {

            frequencyHash[str.charAt(i) - 'a']++;

        }

        return frequencyHash;

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) {

            int min = i;

            for (int j = i; j <= arr.length - 1; j++) {

                if (arr[min] > arr[j])
                    min = j;

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        return arr;

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >=1; i --) {

            int swap = 0;

            for (int j = 0; j <= i - 1; j++) {

                // swap
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;

                }

            }

            if(swap == 0)
                break;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++) {

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {

                //swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }


        }
        return arr;

    }


    public static void main(String[] args) {


        Arrays.stream(mergeSort(new int[]{25, 16, 3, 99, 87, 65, 1})).forEach(System.out::println);

//        int num = 100;
//        while (num > 0) {
//            System.out.println(fib(num--));
//        }
//
//        characterHashing("hello");

    }
}
