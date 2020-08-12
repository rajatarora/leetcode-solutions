package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    private final MaximumSubarray objectUnderTest = new MaximumSubarray();

    @Test
    public void maxSubArray_emptyArray() {

        int result = objectUnderTest.maxSubArray(new int[]{});
        assertThat(result, is(Integer.MIN_VALUE));

    }

    @Test
    public void maxSubArray_singleNumber() {

        int result = objectUnderTest.maxSubArray(new int[]{1});
        assertThat(result, is(1));

    }

    @Test
    public void maxSubArray_singleNegative() {

        int result = objectUnderTest.maxSubArray(new int[]{-2});
        assertThat(result, is(-2));

    }

    @Test
    public void maxSubArray_trivial() {

        int result = objectUnderTest.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertThat(result, is(6));

    }

    @Test
    public void maxSubArray_allNegative() {

        int result = objectUnderTest.maxSubArray(new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4});
        assertThat(result, is(-1));

    }

    @Test
    public void maxSubArray_twoPossibleSubArrays() {

        int result = objectUnderTest.maxSubArray(new int[]{1,0,1,-5,2,0,0});
        assertThat(result, is(2));

    }

}