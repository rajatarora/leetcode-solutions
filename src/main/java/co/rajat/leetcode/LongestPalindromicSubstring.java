package co.rajat.leetcode;

/**
 * Leetcode Problem #5
 * Difficulty: Medium
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstring {

    private int start = 0, maxLength = 0;

    public String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            extend(s, i, i);
            extend(s, i, i+1);
        }

        return s.substring(start, start + maxLength);

    }

    private void extend(String s, int from, int to) {

        while (from >= 0 && to < s.length() && s.charAt(from) == s.charAt(to)) {
            from--;
            to++;
        }

        if (maxLength < (to - from - 1)) {
            maxLength = to - from - 1;
            start = from + 1;
        }

    }

}
