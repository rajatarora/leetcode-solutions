package co.rajat.leetcode;

/**
 * Leetcode Problem #26
 * Difficulty: Easy
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] sums) {
        int uniquePointer = 0;
        int currentPointer = 0;
        int currentUniqueElement = Integer.MIN_VALUE;

        while (currentPointer < sums.length) {
            if (sums[currentPointer] > currentUniqueElement) {
                currentUniqueElement = sums[currentPointer];
                sums[uniquePointer++] = currentUniqueElement;
            }
            currentPointer++;
        }
        return uniquePointer;
    }

}