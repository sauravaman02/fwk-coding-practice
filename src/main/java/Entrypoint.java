
import top_interview_questions.sorting.InsertionSort;

public class Entrypoint {

    public static void main(String[] args) {

        InsertionSort numbersWithEvenDigits = new InsertionSort();

        for (int num: numbersWithEvenDigits.sort(new int[]{2, 8, 5, 3, 9, 4, 1})) {
            System.out.println(num);
        }


    }
}
