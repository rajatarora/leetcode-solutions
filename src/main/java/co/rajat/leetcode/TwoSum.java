package co.rajat.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode Problem #1
 * Difficulty: Easy
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[] {numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution for two-sum");

    }

}
