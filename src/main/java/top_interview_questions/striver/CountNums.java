package top_interview_questions.striver;

public class CountNums {

    public static void main(String[] args) {

        //fastest way.
        int n = 5;
        for (int i = 0; i < n; i++) {

            // print space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print space
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // print space
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }
}
