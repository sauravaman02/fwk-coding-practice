package top_interview_questions.leet_code;

import java.util.HashMap;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 * */
public class RansomeNote {

    //time complexity is O(m.n)
    //space complexity is O(n)
    public boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {

            char r = ransomNote.charAt(i);
/**
 * This below method can be used, but we already have this implementation in index of method. So going ahead with that.
 *
 * */
//            int matchingIndex = -1;
//            for (int j = 0; j < magazine.length(); j++) {
//
//                char m = ransomNote.charAt(j);
//                if (r == m)
//                    matchingIndex = j;
//            }
            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }
            else {
                magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
            }

        }
        return true;
    }

    public boolean canConstructHashMap(String ransomNote, String magazine) {

        //time complexity O(magazine.length)
        //space complexity O(1), because only 26 chars. It should be O(k) --> k is unique chars in magazine, which is 26 only.
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            char m = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        for (int j = 0; j < ransomNote.length(); j++) {

            char r = ransomNote.charAt(j);
            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0)
                return false;
            magazineLetters.put(r, currentCount - 1);
        }
        return true;
    }

    public boolean canConstructBest(String ransomNote, String magazine) {

        int[] charCount = new int[26];

        for (char m : magazine.toCharArray()) {
            charCount[m - 'a']++;
        }

        for (char r : ransomNote.toCharArray()) {
            if (!(charCount[r - 'a'] > 0))
                return false;
            charCount[r - 'a']--;
        }
        return true;

    }
}
