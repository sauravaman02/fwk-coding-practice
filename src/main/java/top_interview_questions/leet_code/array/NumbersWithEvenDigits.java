package top_interview_questions.leet_code.array;

public class NumbersWithEvenDigits {

    public int findNumbers(int[] nums) {

        int finalCounter = 0;

        for(int num : nums) {

            int counter = 0;

            while(num != 0) {
                num /= 10;
                ++counter;
            }

            if((counter & 2) == 0)
                finalCounter++;
        }
        return finalCounter;
    }
}
