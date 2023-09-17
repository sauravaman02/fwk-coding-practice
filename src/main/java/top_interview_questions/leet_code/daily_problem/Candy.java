package top_interview_questions.leet_code.daily_problem;

import java.util.Arrays;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 *
 * You are giving candies to these children subjected to the following requirements:
 *
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 *
 *
 * Example 1:
 *
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * Example 2:
 *
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 *
 *
 * Constraints:
 *
 * n == ratings.length
 * 1 <= n <= 2 * 104
 * 0 <= ratings[i] <= 2 * 104
 *
 * */
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
