package top_interview_questions.sorting;

public class BubbleSort {

    public int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length -1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
