package co.rajat.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray objectUnderTest = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicates_positiveCase() {
        int[] sums = {0, 1, 1, 2, 2, 2, 2, 5, 5, 5, 5, 5, 7, 8};
        int result = objectUnderTest.removeDuplicates(sums);
        assertThat(result, is(6));
        assertArrayEquals(new int[] {0,1,2,5,7,8}, Arrays.copyOfRange(sums, 0, 6));
    }

    @Test
    public void removeDuplicates_emptyArray() {
        int[] sums = {};
        int result = objectUnderTest.removeDuplicates(sums);
        assertThat(result, is(0));
    }

    @Test
    public void removeDuplicates_singleValueDuplicates() {
        int[] sums = {1,1,1,1,1};
        int result = objectUnderTest.removeDuplicates(sums);
        assertThat(result, is(1));
        assertArrayEquals(new int[] {1}, Arrays.copyOfRange(sums, 0, 1));
    }

    @Test
    public void removeDuplicates_singularArray() {
        int[] sums = {1};
        int result = objectUnderTest.removeDuplicates(sums);
        assertThat(result, is(1));
        assertArrayEquals(new int[] {1}, Arrays.copyOfRange(sums, 0, 1));
    }

    @Test
    public void removeDuplicates_noDuplicatesInArray() {
        int[] sums = {1,2,3,4,5,6};
        int result = objectUnderTest.removeDuplicates(sums);
        assertThat(result, is(6));
        assertArrayEquals(new int[]{1,2,3,4,5,6}, sums);
    }

}