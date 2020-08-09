package co.rajat.leetcode;

/**
 * Leetcode Problem #121
 * Difficulty: Easy
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }
            if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

}
