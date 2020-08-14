package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RodCuttingTest {

    private final RodCutting objectUnderTest = new RodCutting();

    @Test
    public void cutRodRecursive_5() {

        int[] prices = { 1, 2, 4, 4, 6 };
        int result = objectUnderTest.cutRodRecursive(prices, 5);
        assertThat(result, is(17));
    }

    @Test
    public void cutRodMemoized_13() {

        int[] prices = { 1, 2, 4, 4, 6, 6, 6, 8, 9, 11, 11, 16, 17 };
        int result = objectUnderTest.cutRodMemoized(prices, 13, new int[]{});
        assertThat(result, is(101));
    }

    @Test
    public void cutRodIterative_13() {

        int[] prices = { 1, 2, 4, 4, 6, 6, 6, 8, 9, 11, 11, 16, 17 };
        int result = objectUnderTest.cutRodIterative(prices, 13);
        assertThat(result, is(117));
    }
}