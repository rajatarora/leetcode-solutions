package co.rajat.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode Problem #46
 * Difficulty: Medium
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Integer[] input = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        buildPermutation(input, 0, nums.length - 1);
        return result;
    }

    private void buildPermutation(Integer[] nums, int start, int end) {

        if (start == end) {
            result.add(new ArrayList<>(Arrays.asList(nums)));
        }

        else {
            for (int i = start; i <= end; i++) {
                swap(nums, start, i);
                buildPermutation(nums, start + 1, end);
                swap(nums, start, i);
            }
        }

    }

    private void swap(Integer[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
