
import top_interview_questions.leet_code.daily_problem.DecodedStringIndex;
import top_interview_questions.leet_code.daily_problem.NumberOfFlowersInFoolBloom;
import top_interview_questions.sorting.InsertionSort;
import top_interview_questions.sorting.MergeSort;
import top_interview_questions.sorting.SelectionSort;

import java.util.Scanner;

public class Entrypoint {

    public static void main(String[] args) {

        NumberOfFlowersInFoolBloom numberOfFlowersInFoolBloom = new NumberOfFlowersInFoolBloom();


        int [][] flowers = {{1,6},{3,7},{9,12},{4,13}};
        int [] people = {2,3,7,11};

        numberOfFlowersInFoolBloom.fullBloomFlowers(flowers, people);

    }
}
