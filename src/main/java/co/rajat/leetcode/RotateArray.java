package co.rajat.leetcode;

/**
 * Leetcode Problem #189
 * Difficulty: Easy
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return;
        }

        while (k >= nums.length) {
            k -= nums.length;
        }

        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, 0, nums.length - 1);

    }

    private void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
