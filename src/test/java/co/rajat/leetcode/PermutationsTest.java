package co.rajat.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PermutationsTest {

    private final Permutations objectUnderTest = new Permutations();

    @Test
    public void permute_single() {
        int[] input = {1};
        List<List<Integer>> expected = Collections.singletonList(Collections.singletonList(1));
        List<List<Integer>> actual = objectUnderTest.permute(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void permute_double() {
        int[] input = {1,2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(2,1)
        );
        List<List<Integer>> actual = objectUnderTest.permute(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void permute_triple() {
        int[] input = {1,2,3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,2,1),
                Arrays.asList(3,1,2)
        );
        List<List<Integer>> actual = objectUnderTest.permute(input);
        assertThat(actual, is(expected));
    }
}