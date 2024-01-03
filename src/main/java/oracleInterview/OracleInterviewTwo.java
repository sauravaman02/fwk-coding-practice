package oracleInterview;

public class OracleInterviewTwo {

    public static void main(String[] args) {

        int N = 6;
        int[] arr = new int[]{1,2,4,5,6};

        int theoreticalSum = 0, actualSum = 0;

        // sum of the array for loop i -> 1 to i -> N O(n)

        // sum of actual array for i -> 0 to i < arr.len O(n)

        for (int i = 1; i <= N; i++) {
            theoreticalSum += i;
        }

        for (int j = 0; j < arr.length; j++) {
            actualSum += arr[j];
        }

        System.out.println("The number missing: "+ (theoreticalSum-actualSum));



    }
}
