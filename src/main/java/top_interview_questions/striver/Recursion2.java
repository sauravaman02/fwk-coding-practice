package top_interview_questions.striver;

import java.util.Arrays;

public class Recursion2 {

    public static int[] swap(int[] arr, int one, int two) {

        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

        return arr;

    }

    public static int[] reverseArrTwoPTR(int[] arr, int left, int right) {

        // implement logic

        if(left >= right)
            return arr;

        swap(arr, left, right);

        return reverseArrTwoPTR(arr, left + 1, right -1);
    }

    public static int[] reverseArrOnePTR(int[] arr, int index) {


        if (index >= arr.length / 2)
            return arr;

        //swap
        swap(arr, index, (arr.length-index-1));
        // recursive call
        return reverseArrOnePTR(arr, index + 1);

    }

    public static boolean palindrome(String string, int index){

        if (index >= string.length()/2)
            return true;

        if (string.charAt(index) != string.charAt(string.length() - index - 1))
            return false;

        return palindrome(string, index + 1);

    }

    public static int fibbonaci(int num){

        if (num <= 1)
            return num;

        return fibbonaci(num - 1) + fibbonaci(num - 2);

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8 , 4, 5};

        reverseArrTwoPTR(arr, 0, 4);
        reverseArrOnePTR(arr, 0);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println(palindrome("MADAM", 0));

        System.out.println(fibbonaci(9));

        int[] arrNew = new int[10];



    }
}
