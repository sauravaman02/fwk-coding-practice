package oracleInterview;

public class App {

    public static void main(String[] args) {

        String input = "((){}[())";

        int smallBraces = 0;
        int curlyBrace = 0;
        int squareBrace = 0;

        for(char c : input.toCharArray()) {

            if (c == '(')
                smallBraces++;
            else if (c == ')') {
                smallBraces--;
            }

            //curly
            if (c == '{')
                curlyBrace++;
            else if (c == '}') {
                curlyBrace--;
            }

            //square
            if (c == '[')
                squareBrace++;
            else if (c == ']') {
                squareBrace--;
            }

        }

        if (smallBraces == 0 && curlyBrace == 0 && squareBrace == 0)
            System.out.println("balanced");
        else
            System.out.println("Not Balanced");


    }
}
