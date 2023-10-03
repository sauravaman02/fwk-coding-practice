package top_interview_questions.sorting;

public class SelectionSort {

    public int[] sort(int[] array) {

        int length = array.length;
        for (int i = 0; i < length - 1; i++) {

            int min = i;
            for (int j = i+1; j < length; j++){

                if (array[j] < array[min])
                    min = j;

            }
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }

        }
        return array;
    }
}
