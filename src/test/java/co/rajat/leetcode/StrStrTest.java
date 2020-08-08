package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StrStrTest {

    private final StrStr objectUnderTest = new StrStr();

    @Test
    public void strStr_existsInMiddle() {
        int result = objectUnderTest.strStr("hello", "ll");
        assertThat(result, is(2));
    }

    @Test
    public void strStr_existsInBeginning() {
        int result = objectUnderTest.strStr("hello", "he");
        assertThat(result, is(0));
    }

    @Test
    public void strStr_existsAtEnd() {
        int result = objectUnderTest.strStr("hello", "lo");
        assertThat(result, is(3));
    }

    @Test
    public void strStr_singleCharExistsInMiddle() {
        int result = objectUnderTest.strStr("hello", "e");
        assertThat(result, is(1));
    }

    @Test
    public void strStr_singleCharExistsInBeginning() {
        int result = objectUnderTest.strStr("hello", "h");
        assertThat(result, is(0));
    }

    @Test
    public void strStr_singleCharExistsAtEnd() {
        int result = objectUnderTest.strStr("hello", "o");
        assertThat(result, is(4));
    }

    @Test
    public void strStr_singleCharDoesNotExist() {
        int result = objectUnderTest.strStr("hello", "a");
        assertThat(result, is(-1));
    }

    @Test
    public void strStr_doesNotExist() {
        int result = objectUnderTest.strStr("hello", "ab");
        assertThat(result, is(-1));
    }

    @Test
    public void strStr_partiallyExists() {
        int result = objectUnderTest.strStr("hello", "log");
        assertThat(result, is(-1));
    }

    @Test
    public void strStr_nullNeedle() {
        int result = objectUnderTest.strStr("hello", null);
        assertThat(result, is(0));
    }

    @Test
    public void strStr_emptyNeedle() {
        int result = objectUnderTest.strStr("hello", "");
        assertThat(result, is(0));
    }

    @Test
    public void strStr_nullHaystack() {
        int result = objectUnderTest.strStr(null, null);
        assertThat(result, is(0));
    }

    @Test
    public void strStr_emptyHaystack() {
        int result = objectUnderTest.strStr("", null);
        assertThat(result, is(0));
    }
}