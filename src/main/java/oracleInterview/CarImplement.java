package oracleInterview;

public class CarImplement {

    public static int start(int side) {

        System.out.println(side);
        System.out.println("Inside INT");
        return side;
    }

    public static char start(int lentgh, int breadth) {

        System.out.println(lentgh);
        System.out.println("Inside CHAR");
        return 'c';

    }

    public static void main(String[] args) {

        start(123);

        start('c');

    }
}
