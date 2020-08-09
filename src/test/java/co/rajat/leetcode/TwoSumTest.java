package co.rajat.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private final TwoSum objectUnderTest = new TwoSum();

    @Test
    public void twoSum_trivial() {
        int[] result = objectUnderTest.twoSum(new int[] {1,2,3,4}, 5);
        assertArrayEquals(result, new int[] {1,2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_notFound() {
        objectUnderTest.twoSum(new int[] {1,2,3,4}, 10);
    }

    @Test
    public void twoSum_repeatedElement() {
        int[] result = objectUnderTest.twoSum(new int[] {3,2,3,4}, 6);
        assertArrayEquals(result, new int[] {0,2});
    }

}