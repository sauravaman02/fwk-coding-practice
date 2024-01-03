package top_interview_questions.practice;

public class PracticeSession2 {

    public static int countDigits(int num) {

        // complexity O(log(base10)n)
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }

        return count;

    }

    public static int reverseInteger(int num){

        // time complexity O(log(base10)n)
        int reverse = 0;

        while (num > 0) {
            int lastPoopedDigit = num % 10;
            reverse = (reverse * 10) + lastPoopedDigit;
            num /= 10;
        }

        return reverse;

    }

    public static boolean checkIntegerPalindrome(int num) {

        boolean flag = false;
        int reverse = 0;

        int temp = num;

        while (temp > 0) {
            int lastPoopedDigit = temp % 10;
            reverse = (reverse * 10) + lastPoopedDigit;
            temp /= 10;
        }

        if (reverse == num)
            flag = true;


        return flag;

    }

    public static void main(String[] args) {

        System.out.println(checkIntegerPalindrome(123454321));
    }
}
