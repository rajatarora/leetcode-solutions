package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StringToIntegerTest {

    private final StringToInteger objectUnderTest = new StringToInteger();

    @Test
    public void myAtoi_emptyInput() {
        int result = objectUnderTest.myAtoi("");
        assertThat(result, is(0));
    }

    @Test
    public void myAtoi_whitespaceInput() {
        int result = objectUnderTest.myAtoi("   ");
        assertThat(result, is(0));
    }

    @Test
    public void myAtoi_trivial() {
        int result = objectUnderTest.myAtoi("42");
        assertThat(result, is(42));
    }

    @Test
    public void myAtoi_negative() {
        int result = objectUnderTest.myAtoi("-42");
        assertThat(result, is(-42));
    }

    @Test
    public void myAtoi_leadingPlusSign() {
        int result = objectUnderTest.myAtoi("+42");
        assertThat(result, is(42));
    }

    @Test
    public void myAtoi_leadingPlusSignNonNumeric() {
        int result = objectUnderTest.myAtoi("+abc");
        assertThat(result, is(0));
    }

    @Test
    public void myAtoi_zero() {
        int result = objectUnderTest.myAtoi("0");
        assertThat(result, is(0));
    }

    @Test
    public void myAtoi_leadingWhitespaceNumber() {
        int result = objectUnderTest.myAtoi("       -42");
        assertThat(result, is(-42));
    }

    @Test
    public void myAtoi_trailingNonNumericChars() {
        int result = objectUnderTest.myAtoi("42 with words");
        assertThat(result, is(42));
    }

    @Test
    public void myAtoi_leadingNonNumericChars() {
        int result = objectUnderTest.myAtoi("yo 42");
        assertThat(result, is(0));
    }

    @Test
    public void myAtoi_outsideIntegerRangeNegative() {
        int result = objectUnderTest.myAtoi("-91283472332");
        assertThat(result, is(Integer.MIN_VALUE));
    }

    @Test
    public void myAtoi_outsideIntegerRangePositive() {
        int result = objectUnderTest.myAtoi("91283472332");
        assertThat(result, is(Integer.MAX_VALUE));
    }

    @Test
    public void myAtoi_outsideLongRangePositive() {
        int result = objectUnderTest.myAtoi("9223372036854775808");
        assertThat(result, is(Integer.MAX_VALUE));
    }

    @Test
    public void myAtoi_outsideLongRangeNegative() {
        int result = objectUnderTest.myAtoi("-9223372036854775808");
        assertThat(result, is(Integer.MIN_VALUE));
    }

    @Test
    public void myAtoi_IntegerMinValuePlusOne() {
        int result = objectUnderTest.myAtoi("-2147483647");
        assertThat(result, is(-2147483647));
    }
}