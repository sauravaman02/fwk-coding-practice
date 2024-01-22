package striver.basicMath;

public class printAllDivisors {

    public static void print(int number) {

        for(int i = 1; i <= number; i++) {

            if (number % i == 0)
                System.out.println(i);

        }
    }

    public static void optimisedPrint(int number) {

        for(int i = 1; i <= Math.sqrt(number); i++) {

            if (number % i == 0)
            {
                System.out.println(i);
                if ((number/i) != i)
                    System.out.println(number/i);
            }

        }

    }

    public static void main(String[] args) {
        optimisedPrint (36);
    }
}
