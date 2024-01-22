package striver.pattern;

/**
 *   ****
 *   ****
 *   ****
 *   ****
 *
 *   Print the following pattern.
 *
 */
public class PatternOne {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
