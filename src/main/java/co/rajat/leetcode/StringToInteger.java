package co.rajat.leetcode;

/**
 * Leetcode Problem #8
 * Difficulty: Medium
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class StringToInteger {

    public int myAtoi(String str) {
        String trimmed = str.trim();
        if (trimmed.length() == 0) {
            return 0;
        }
        boolean negative = false;
        if (trimmed.charAt(0) == '-' || trimmed.charAt(0) == '+') {
            negative = trimmed.charAt(0) == '-';
            trimmed = trimmed.substring(1);
        }
        long result = 0;
        int i = 0;
        boolean limitExceeded = false;
        while (i < trimmed.length() && Character.isDigit(trimmed.charAt(i))) {
            result *= 10;
            result += trimmed.charAt(i++) - '0';
            if (result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                limitExceeded = true;
                break;
            }
        }
        if (negative) {
            if (limitExceeded) {
                result = Integer.MIN_VALUE;
            }
            else {
                result *= -1;
            }
        }
        return (int) result;
    }

}
