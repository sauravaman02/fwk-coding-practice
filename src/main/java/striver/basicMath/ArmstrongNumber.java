package striver.basicMath;

/**
 *
 * Given an integer n, return true if and only if it is an Armstrong number.
 *
 * The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 153
 * Output: true
 * Explanation: 153 is a 3-digit number, and 153 = 13 + 53 + 33.
 * Example 2:
 *
 * Input: n = 123
 * Output: false
 * Explanation: 123 is a 3-digit number, and 123 != 13 + 23 + 33 = 36.
 *
 * */
public class ArmstrongNumber {

    public boolean isArmstrong(int n) {

        int armstrongSum = 0;

        int power = (int) (Math.log10(n) + 1);

        int temp = n;

        while(temp > 0) {

            int digit = temp % 10;

            armstrongSum += Math.pow(digit, power);

            temp /= 10;

        }

        return armstrongSum == n;


    }

}
