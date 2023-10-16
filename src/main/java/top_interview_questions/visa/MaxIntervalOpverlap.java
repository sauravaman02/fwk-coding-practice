package top_interview_questions.visa;


import java.util.Arrays;

/**
 * Consider a big party where a log register for guest’s entry and exit times is maintained.
 * Find the time at which there are maximum guests in the party. Note that entries in register are not in any order.
 * Example :
 *
 * Input: arrl[] = {1, 2, 9, 5, 5}
 *        exit[] = {4, 5, 12, 9, 12}
 * First guest in array arrives at 1 and leaves at 4,
 * second guest arrives at 2 and leaves at 5, and so on.
 *
 * Output: 5
 * There are maximum 3 guests at time 5.
 *
 * */
public class MaxIntervalOpverlap {

    public void findMaxGuests(int[] Entry,int Exit[], int N){
        // add code here.
        Arrays.sort(Entry);
        Arrays.sort(Exit);

        int i = 0;
        int j = 0;
        int maximumGuests = 0;
        int currentGuests = 0;
        int time;

        while (i < Entry.length && j < Exit.length) {

            if (Entry[i] <= Exit[j]) {

                currentGuests++;

                if(currentGuests > maximumGuests){
                    maximumGuests = currentGuests;
                    time = Entry[i];
                }
                i++;
            }
            else {
                j++;
                currentGuests --;
            }
        }
    }
}
