package co.rajat.leetcode;

/**
 * Leetcode Problem #53
 * Difficulty: Easy
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }

}
