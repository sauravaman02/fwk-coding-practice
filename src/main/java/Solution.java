import java.util.Arrays;

class Solution {
    public static int solution(int N, String S) {
        // Implement your solution here

        // creating a char array of column names
        char[] seatArray = new char[]{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K' };

        // splitting the input in array
        String[] inputSeatArray = S.split(" ");
        int finalCounter = 0;

        for (int i = 1; i<=N ; i++ ){
            int counter = 0;
            for (char c: seatArray) {
                String seatNo = i + String.valueOf(c) ;

                if (!Arrays.asList(inputSeatArray).contains(seatNo))
                    counter++;
                else
                    counter = 0;

                if (c == 65)
                    counter = 0;

                if (c == 75)
                    counter = 0;

                if (counter == 4) {
                    finalCounter ++;
                    counter = 0;
                }

            }
        }

        return finalCounter;
    }

    public static void main(String[] args) {

        System.out.println(Solution.solution(22, "1A 3C 2B 20G 5A"));
    }
}