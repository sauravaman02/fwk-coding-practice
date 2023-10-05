
import top_interview_questions.leet_code.daily_problem.DecodedStringIndex;
import top_interview_questions.sorting.InsertionSort;
import top_interview_questions.sorting.MergeSort;
import top_interview_questions.sorting.SelectionSort;

import java.util.Scanner;

public class Entrypoint {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        Scanner sc = new Scanner(System.in);
        int num = 430;

        while(num > 0) {
            int curr_number = num % 10;

            if(curr_number % 2 == 0)
                sumEven+=curr_number;
            else
                sumOdd+=curr_number;

            num/=10;
        }
        System.out.println(sumEven+" "+sumOdd);



    }
}
