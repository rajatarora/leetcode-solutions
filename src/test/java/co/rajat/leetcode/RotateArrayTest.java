package co.rajat.leetcode;

import org.hamcrest.core.IsNull;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RotateArrayTest {

    private final RotateArray objectUnderTest = new RotateArray();

    @Test
    public void rotate_trivial() {
        int[] input = {1,2,3,4,5,6,7,8};
        objectUnderTest.rotate(input, 3);
        assertArrayEquals(input, new int[] {6,7,8,1,2,3,4,5});
    }

    @Test
    public void rotate_zeroLengthRotation() {
        int[] input = {1,2,3,4,5,6,7,8};
        objectUnderTest.rotate(input, 0);
        assertArrayEquals(input, new int[] {1,2,3,4,5,6,7,8});
    }

    @Test
    public void rotate_kMoreThanArrayLength() {
        int[] input = {1,2,3,4,5,6,7,8};
        objectUnderTest.rotate(input, 11);
        assertArrayEquals(input, new int[] {6,7,8,1,2,3,4,5});
    }

    @Test
    public void rotate_kEqualToArrayLength() {
        int[] input = {1,2,3,4,5,6,7,8};
        objectUnderTest.rotate(input, 8);
        assertArrayEquals(input, new int[] {1,2,3,4,5,6,7,8});
    }

    @Test
    public void rotate_noElementsInInputArray() {
        int[] input = {};
        objectUnderTest.rotate(input, 5);
        assertArrayEquals(input, new int[] {});
    }

    @Test
    public void rotate_nullInputArray() {
        int[] input = null;
        objectUnderTest.rotate(input, 5);
        assertThat(input, is(IsNull.nullValue()));
    }

}