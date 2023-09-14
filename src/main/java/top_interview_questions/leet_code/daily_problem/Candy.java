package top_interview_questions.leet_code.daily_problem;

import java.util.Arrays;

public class Candy {

        public int candyOnePass(int[] ratings) {

            int[] candies = new int[ratings.length];

            Arrays.fill(candies, 1);
            //impl

            for (int i = 1; i < ratings.length; i++) {

                if (ratings[i-1] < ratings[i])
                    candies[i] = candies[i-1] + 1;
            }

            for (int j = ratings.length - 2; j >= 0; j--){

                if (ratings[j] > ratings[j+1])
                    candies[j] = Math.max(candies[j], candies[j+1]+1);
            }

            return Arrays.stream(candies).sum();

        }
}
