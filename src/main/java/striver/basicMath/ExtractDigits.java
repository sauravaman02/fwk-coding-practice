package striver.basicMath;

/**
 *
 * Extract digits from a given number N and print them.
 *
 * */
public class ExtractDigits {

    public static void print(int number) {

        while (number > 0) {

            System.out.println(number % 10);
            number /= 10;

        }

    }

    public static void main(String[] args) {
        print(23456);
    }
}
