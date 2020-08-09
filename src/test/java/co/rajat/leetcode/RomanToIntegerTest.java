package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanToIntegerTest {

    private final RomanToInteger objectUnderTest = new RomanToInteger();

    @Test
    public void romanToInt_5() {
        int result = objectUnderTest.romanToInt("V");
        assertThat(result, is(5));
    }

    @Test
    public void romanToInt_3() {
        int result = objectUnderTest.romanToInt("III");
        assertThat(result, is(3));
    }

    @Test
    public void romanToInt_4() {
        int result = objectUnderTest.romanToInt("IV");
        assertThat(result, is(4));
    }

    @Test
    public void romanToInt_9() {
        int result = objectUnderTest.romanToInt("IX");
        assertThat(result, is(9));
    }

    @Test
    public void romanToInt_58() {
        int result = objectUnderTest.romanToInt("LVIII");
        assertThat(result, is(58));
    }

    @Test
    public void romanToInt_1994() {
        int result = objectUnderTest.romanToInt("MCMXCIV");
        assertThat(result, is(1994));
    }
}