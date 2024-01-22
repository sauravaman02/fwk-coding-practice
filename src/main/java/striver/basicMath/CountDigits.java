package striver.basicMath;


/**
 * Problem statement
 * You are given a number ’n’.
 *
 *
 *
 * Find the number of digits of ‘n’ that evenly divide ‘n’.
 *
 *
 *
 * Note:
 * A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.
 *
 *
 * Example:
 * Input: ‘n’ = 336
 *
 * Output: 3
 *
 * Explanation:
 * 336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
 * Note:
 * You don’t need to print anything. Just implement the given function.
 *
 *
 * */
public class CountDigits {

    static int countDigits(int n){
        // Write your code here.

        int tempN = n;
        int count = 0;

        while(tempN > 0) {

            int lastDigit = tempN % 10;
            tempN /= 10;

            if (lastDigit != 0 && n % lastDigit == 0)
                count++;
        }

        return count;

    }


    /**
     * Simple explanation is log10(num) + 1 will give you the number of digits in a number.
     *
     * */
    static int countDigitsLog(int n) {
        return (int) (Math.log10(n) + 1);
    }

    public static void main(String[] args) {

        System.out.println(countDigitsLog(660));

    }

}
