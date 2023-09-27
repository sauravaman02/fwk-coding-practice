package top_interview_questions.leet_code.dataStructures;

public class ReverseString {

    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
