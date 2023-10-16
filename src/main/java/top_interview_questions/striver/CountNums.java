package top_interview_questions.striver;

public class CountNums {

    public static void main(String[] args) {

        //fastest way.
        int n = 5;
        for (int i = n; i > 0; i --) {

            for (int j = i; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
