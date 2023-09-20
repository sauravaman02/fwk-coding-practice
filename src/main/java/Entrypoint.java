import top_interview_questions.leet_code.array.*;

public class Entrypoint {

    public static void main(String[] args) {

        NumbersDissapearedInArray numbersWithEvenDigits = new NumbersDissapearedInArray();
        for (int num: numbersWithEvenDigits.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})) {
            System.out.println(num);
        }


    }
}
