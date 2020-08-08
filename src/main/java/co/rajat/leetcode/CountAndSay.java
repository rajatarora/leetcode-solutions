package co.rajat.leetcode;

/**
 * Leetcode Problem #38
 * Difficulty: Easy
 * https://leetcode.com/problems/count-and-say/
 */
public class CountAndSay {

    public String countAndSay(int n) {
        String input = "1";
        for (int i = 2; i <= n; i++) {
            input = calculateCountAndSay(input);
        }
        return input;
    }

    private String calculateCountAndSay(String input) {
        StringBuilder result = new StringBuilder();
        Character currentCharacter = '0';
        int count = 0;
        for (int i = 0; i < input.length(); ) {
            if (currentCharacter != input.charAt(i)) {
                currentCharacter = input.charAt(i);
                count = 0;
            }
            while (i < input.length() && currentCharacter.equals(input.charAt(i))) {
                count++;
                i++;
            }
            result.append(count);
            result.append(currentCharacter);
        }
        return result.toString();
    }

}
