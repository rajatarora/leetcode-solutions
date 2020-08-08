package co.rajat.leetcode;

/**
 * Leetcode Problem #28
 * Difficulty: Easy
 * https://leetcode.com/problems/implement-strstr/
 */
public class StrStr {

    public int strStr(String haystack, String needle) {

        if (haystack == null || haystack.length() == 0) {
            return -1;
        }

        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int foundPosition = -1;
        int pointer = 0;

        for (; pointer < haystack.length(); pointer++) {
            if (haystack.charAt(pointer) == needle.charAt(0)) {
                if (haystack.length() - pointer < needle.length()) {
                    return -1;
                }
                foundPosition = pointer;
                for (int i = 1; i < needle.length() && pointer + i < haystack.length(); i++) {
                    if (haystack.charAt(pointer + i) != needle.charAt(i)) {
                        foundPosition = -1;
                        break;
                    }
                }
                if (foundPosition != -1) {
                    return foundPosition;
                }
            }
        }
        return foundPosition;
    }

}
