package co.rajat.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ThreeSumTest {

    private final ThreeSum objectUnderTest = new ThreeSum();

    @Test
    public void threeSum_trivial() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeSum_repeatedNumbers() {
        int[] input = {-2, 0, 0, 2, 2};
        List<List<Integer>> expected = Collections.singletonList(
                Arrays.asList(-2, 0, 2)
        );
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeSum_noNumbers() {
        int[] input = {};
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeSum_noSolution() {
        int[] input = {1,1,1};
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeSum_oneNumber() {
        int[] input = {1};
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void threeSum_twoNumbers() {
        int[] input = {1,1};
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = objectUnderTest.threeSum(input);
        assertThat(actual, is(expected));
    }

}