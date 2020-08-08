package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountAndSayTest {

    private final CountAndSay objectUnderTest = new CountAndSay();

    @Test
    public void countAndSay_1() {
        String result = objectUnderTest.countAndSay(1);
        assertThat(result, is("1"));
    }

    @Test
    public void countAndSay_3() {
        String result = objectUnderTest.countAndSay(3);
        assertThat(result, is("21"));
    }

    @Test
    public void countAndSay_5() {
        String result = objectUnderTest.countAndSay(5);
        assertThat(result, is("111221"));
    }

    @Test
    public void countAndSay_7() {
        String result = objectUnderTest.countAndSay(7);
        assertThat(result, is("13112221"));
    }

    @Test
    public void countAndSay_9() {
        String result = objectUnderTest.countAndSay(9);
        assertThat(result, is("31131211131221"));
    }

    @Test
    public void countAndSay_11() {
        String result = objectUnderTest.countAndSay(11);
        assertThat(result, is("11131221133112132113212221"));
    }
}