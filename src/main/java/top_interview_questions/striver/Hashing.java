package top_interview_questions.striver;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static int[] charHash(String str) {

        // declare a frequency array

        int[] freqArray = new int[26];

        for (int i=0; i < str.length(); i++) {

            freqArray[str.charAt(i) - 'a']++;

        }

        return freqArray;

    }

    public static Map<Integer, Integer> hashigWithMap (int[] nums) {

        // creating a new map
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

//            int count = map.getOrDefault(num, 0);
//            map.put(num, count + 1);

            map.merge(num, 1, Integer::sum);

        }

        return map;

    }

    public static int[] charHasBothCase(String str){

        // declare a frequency array

        int [] freqArray = new int[256];

        for (int i=0; i < str.length(); i++) {

            freqArray[str.charAt(i)]++;

        }

        return freqArray;


    }

    public static int[] getFrequencies(int []v) {
        // Write Your Code Here

        int minFreq = Integer.MAX_VALUE;
        int minNumber = 0;

        int maxFreq = Integer.MIN_VALUE;
        int maxNumber = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < v.length; i ++) {

            freqMap.merge(v[i], 1, Integer::sum);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (minFreq > value) {
                minFreq = value;
                minNumber = key;
            }

            if(maxFreq < value) {
                maxFreq = value;
                maxNumber = key;
            }

        }



        return new int[] {maxNumber, minNumber};



    }

    public static void main(String[] args) {

        //Arrays.stream(charHash("abba")).forEach(System.out::println);
        //Arrays.stream(charHasBothCase("Abba")).forEach(System.out::println);

        //hashigWithMap(new int[]{1, 1, 2, 3, 3, 4, 5}).forEach((key, value) -> System.out.println(key + ":" + value));

        Arrays.stream(getFrequencies(new int[]{20, 10, 13, 13, 6, 7, 19, 19, 12, 9, 10, 9, 2, 16, 1, 16, 2, 16, 16, 16})).forEach(System.out::println);



    }
}
