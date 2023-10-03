package top_interview_questions.sorting;


import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] array) {
        int length = array.length;

        if (length == 1)
            return array;

        int[] array1 = Arrays.copyOfRange(array, 0, length/2);
        int[] array2 = Arrays.copyOfRange(array, length/2, length);

        array1 = sort(array1);
        array2 = sort(array2);

        return mergeArray(array1, array2);
    }

    private int[] mergeArray(int[] array1, int[] array2){

        int[] newArray = new int[array1.length + array2.length];

        int i=0, j=0, k=0;

        while(i < array1.length && j < array2.length){

            if (array1[i] > array2[j]){
                newArray[k] = array2[j];
                k++;
                j++;
            }
            else {
                newArray[k] = array1[i];
                k++;
                i++;
            }
        }

        while(i < array1.length){
            newArray[k] = array1[i];
            i++;
            k++;
        }

        while(j < array2.length){
            newArray[k] = array2[j];
            j++;
            k++;
        }

        return newArray;
    }
}
