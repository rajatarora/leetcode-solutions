package co.rajat.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring objectUnderTest = new LongestPalindromicSubstring();

    @Test
    public void longestPalindrome_emptyString() {

        String result = objectUnderTest.longestPalindrome("");
        assertThat(result, is(""));

    }

    @Test
    public void longestPalindrome_singleCharacter() {

        String result = objectUnderTest.longestPalindrome("a");
        assertThat(result, is("a"));

    }

    @Test
    public void longestPalindrome_evenMiddle() {

        String result = objectUnderTest.longestPalindrome("cbbd");
        assertThat(result, is("bb"));

    }

    @Test
    public void longestPalindrome_oddMiddle() {

        String result = objectUnderTest.longestPalindrome("cbabd");
        assertThat(result, is("bab"));

    }

    @Test
    public void longestPalindrome_evenFullPalindrome() {

        String result = objectUnderTest.longestPalindrome("abba");
        assertThat(result, is("abba"));

    }

    @Test
    public void longestPalindrome_oddFullPalindrome() {

        String result = objectUnderTest.longestPalindrome("abcccba");
        assertThat(result, is("abcccba"));

    }

    @Test
    public void longestPalindrome_leftPalindrome() {

        String result = objectUnderTest.longestPalindrome("abcccbadfgdfgdfg");
        assertThat(result, is("abcccba"));

    }

    @Test
    public void longestPalindrome_rightPalindrom3() {

        String result = objectUnderTest.longestPalindrome("dfgdfgdfgabcccba");
        assertThat(result, is("abcccba"));

    }

    @Test
    public void longestPalindrome_twoEqualPalindromes() {

        String result = objectUnderTest.longestPalindrome("abbadxcvbbv");
        assertThat(result, is("abba"));

    }

    @Test
    public void longestPalindrome_twoUnequalPalindromes() {

        String result = objectUnderTest.longestPalindrome("abbadxcvbbbv");
        assertThat(result, is("vbbbv"));

    }

    @Test
    public void longestPalindrome_notAPalindrome() {

        String result = objectUnderTest.longestPalindrome("abcdef");
        assertThat(result, is("a"));

    }
}