package top_interview_questions.striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {

    public static void printNumbers( int num, int count, int[] array ) {

        if (count == num)
            return;

        array[count] = count + 1;
        printNumbers(num, count+1, array);

    }

    public static void printString(int n, int count, String[] array) {

        if (count == n)
            return;

        array[count] = "Coding Ninjas";
        printString(n, count+1, array);
    }

    public static int[] printNos(int x, int count, int[] arr) {

        if (x == 0)
            return arr;

        arr[count++] = x--;
        printNos(x, count, arr);

        return arr;

    }

    public static int sum(int n, int sum) {

        if (n < 1)
            return sum;

        return sum(n - 1, sum + n);
    }

    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here

        ArrayList<Long> factList = new ArrayList<>();
        int number = 1;
        while(true){
            long fact = factorial(number);
            if(fact > n)
                break;
            else
                factList.add(fact);
            number++;
        }
        return factList;

    }
    public static long factorial(long n) {

        if(n == 1)
            return 1;

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        // print numbers
        int n = 5;
        int count = 0;
        int[] array = new int[n];
        printNumbers(n, count, array);
        Arrays.stream(array).forEach(System.out::println);

        // print coding ninjas
        int time = 5;
        int countStr = 0;
        String[] arr = new String[time];
        printString(time, countStr, arr);
        Arrays.stream(arr).forEach(System.out::println);

        // print nos in array
        int x = 5;
        int countNos = 0;
        int[] nosArr = new int[x];
        Arrays.stream(printNos(x, countNos, nosArr)).forEach(System.out::println);

        //print sum
        System.out.println(sum(5, 0));

        List<Long> factList = new ArrayList<>();

        factorialNumbers(7);



    }
}
