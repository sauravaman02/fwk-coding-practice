
import top_interview_questions.leet_code.daily_problem.DecodedStringIndex;
import top_interview_questions.sorting.InsertionSort;
import top_interview_questions.sorting.MergeSort;
import top_interview_questions.sorting.SelectionSort;

public class Entrypoint {

    public static void main(String[] args) {

        MergeSort numbersWithEvenDigits = new MergeSort();

        for (int num : numbersWithEvenDigits.sort(new int[] {2, 5, 3, 7, 1, 9, 8})) {
            System.out.println(num);
        }



    }
}
