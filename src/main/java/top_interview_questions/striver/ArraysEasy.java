package top_interview_questions.striver;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysEasy {

    public static int largestElementArrBruteF(int[] arr) {

        // tc -> O(NlogN)
        // sc -> O(1)

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int largestElementArrOptimal(int[] arr){


        //tc --> O(N)
        //sc --> O(1)
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxEle)
                maxEle = arr[i];

        }
        return maxEle;

    }

    public static int secondLargestElementBruteF(int[] arr){

        // tc --> O(NlogN)
        // sc --> O(1)
        Arrays.sort(arr);

        for(int i = arr.length - 2; i >= 0; i--){

            if (arr[i] != arr[arr.length - 1])
                return arr[i];

        }

        return -1;
    }

    public static int secondLargestElementFirstPass(int[] arr){

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++){

            if (arr[i] > arr[0])
                largest = arr[i];

        }

        for (int num : arr){

            if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

        }

        return secondLargest;

    }

    public static int secondLargestElementOptimal(int[] arr){

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > slargest)
                slargest = arr[i];

        }

        return slargest;
    }

    public static int removeDuplicatesBruteF(int[] arr){

        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr)
            uniqueSet.add(num);

        int counter = 0;

        for (int items : uniqueSet){

            arr[counter] = items;
            counter++;
        }

        return counter;

    }



    public static void main(String[] args) {

        System.out.println(secondLargestElementOptimal(new int[]{1, 2, 4, 5, 8, 12, 0, 2, 4, 5, 6}));
    }
}
