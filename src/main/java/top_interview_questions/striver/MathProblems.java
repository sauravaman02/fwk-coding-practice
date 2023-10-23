package top_interview_questions.striver;

import javax.sound.midi.Soundbank;

public class MathProblems {

    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number > 0) {

            int currentDig = number % 10;

            reverse = reverse * 10 + currentDig;

            number /= 10;

        }

        return reverse;

    }

    public static boolean isArmstrongNumber(int number) {


        int copyNumber = number;
        int sum = 0;
        int count = 0;

        // count the number of digits
        while (copyNumber > 0) {

            count ++;
            copyNumber = copyNumber / 10;
        }

        // calculate the sum

        copyNumber = number;
        while (copyNumber > 0) {

            int currentDigit = copyNumber % 10;
            sum += Math.pow(currentDigit, count);
            copyNumber /= 10;

        }

        if (sum == number)
            return true;
        else
            return false;

    }

    public static void printAllDivisors(int number) {

        for (int i = 1; i * i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
                if (number / i != i)
                    System.out.println(number / i);
            }
        }
    }

    public static boolean isPrime( int number) {

        int count = 0;
        for (int i = 1; i * i <= number; i++) {

            if (number % i == 0) {
                count ++;
                if (number / i != i)
                    count ++;
            }

        }

        if (count == 2)
            return true;
        else
            return false;
    }

    public static int findHCFGCD(int a, int b) {

        while (a > 0 && b > 0) {

            if (a > b)
                a %= b;
            else
                b %= a;
        }

        if (a == 0)
            return b;
        else
            return a;

    }


    public static void main(String[] args) {

        System.out.println(MathProblems.reverseNumber(3488));
        System.out.println(MathProblems.isArmstrongNumber(8208));
        MathProblems.printAllDivisors(12);
        System.out.println(isPrime(1000000006));
        System.out.println(findHCFGCD(12, 36));

    }
}
