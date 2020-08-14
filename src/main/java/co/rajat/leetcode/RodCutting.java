package co.rajat.leetcode;

/**
 * Dynamic programming problem - Rod Cutting
 * Given a rod of length n inches and a table of prices p[i] for i in 1, 2, ... n, determine the maximum revenue r
 * obtainable by cutting up the rod and selling the pieces. Note that if the price p(n) for a rod of length n is large
 * enough, an optimal solution may require no cutting at all.
 */
public class RodCutting {

    public int cutRodRecursive(int[] prices, int pieces) {

        if (pieces == 0) {
            return 0;
        }

        int revenue = Integer.MIN_VALUE;
        for (int i = 0; i < pieces; i++) {
            revenue = Math.max(revenue, prices[i] + cutRodRecursive(prices, pieces - 1));
        }
        return revenue;

    } /* Running time for 13 pieces: 50 seconds */

    public int cutRodMemoized(int[] prices, int pieces, int[] solutions) {

        /* Fun fact: This doesn't belong here. */
        if (solutions == null || solutions.length == 0) {
            solutions = new int[prices.length + 1];
            for (int i = 1; i <= prices.length; i++) {
                solutions[i] = Integer.MIN_VALUE;
            }
        }

        if (solutions[pieces] >= 0) {
            return solutions[pieces];
        }

        if (pieces == 0) {
            return 0;
        }

        int revenue = Integer.MIN_VALUE;
        for (int i = 0; i < pieces; i++) {
            revenue = Math.max(revenue, prices[i] + cutRodMemoized(prices, pieces - 1, solutions));
        }

        solutions[pieces] = revenue;
        return revenue;

    } /* Running time for 13 pieces: 0 milliseconds */

    public int cutRodIterative(int[] prices, int pieces) {

        int[] solutions = new int[pieces + 1];
        solutions[0] = 0;

        for (int i = 1; i <= pieces; i++) {
            int revenue = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                revenue = Math.max(revenue, prices[i] + solutions[j - 1]);
            }
            solutions[i] = revenue;
        }
        return solutions[pieces];

    }

}
