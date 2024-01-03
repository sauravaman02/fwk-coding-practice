package oracleInterview;

import java.util.Arrays;

public class OracleInterview {

    public static void main(String[] args) {

        String input = "Oracles";
        String output = "rOcael";

        char[] charArray = input.toCharArray();

        for (int i = 0; i < input.length(); i+=2) {

            if(i+1 < input.length()) {

                char temp = charArray[i];
                charArray[i] = charArray[i+1];
                charArray[i+1] = temp;

            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(char c : charArray){
            stringBuilder.append(c);
        }

        System.out.println(stringBuilder.toString());

    }
}
