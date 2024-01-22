package striver.basicMath;

public class CheckIntegerPalindrome {

    public static boolean palindromeInteger(int num){

        int temp = num;
        int rev = 0;

        while(temp > 0){

            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp /= 10;
        }

        return num == rev;
    }

    public static void main(String[] args) {

        System.out.println(palindromeInteger(12345432));
    }

}
