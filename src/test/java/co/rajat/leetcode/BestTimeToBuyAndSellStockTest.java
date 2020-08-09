package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock objectUnderTest = new BestTimeToBuyAndSellStock();

    @Test
    public void maxProfit_increasingSequence() {
        int result = objectUnderTest.maxProfit(new int[] {1,2,3,4,5,6});
        assertThat(result, is(5));
    }

    @Test
    public void maxProfit_decreasingSequence() {
        int result = objectUnderTest.maxProfit(new int[] {6,5,4,3,2,1});
        assertThat(result, is(0));
    }

    @Test
    public void maxProfit_minValueNotFirst() {
        int result = objectUnderTest.maxProfit(new int[] {5,3,1,6,8,2});
        assertThat(result, is(7));
    }

    @Test
    public void maxProfit_maxValueBeforeMin() {
        int result = objectUnderTest.maxProfit(new int[] {10,3,1,6,5,2});
        assertThat(result, is(5));
    }

}