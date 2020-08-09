package co.rajat.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Leetcode Problem #13
 * Difficulty: Easy
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    private final Map<Character, Integer> romanValues = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public int romanToInt(String s) {

        List<Integer> integerValues = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            integerValues.add(romanValues.get(s.charAt(i)));
        }

        int result = 0;

        for (int i = 0; i < integerValues.size(); i++) {
            if (i < integerValues.size() - 1 && integerValues.get(i) < integerValues.get(i + 1)) {
                result += (integerValues.get(i + 1) - integerValues.get(i));
                i++;
            }
            else {
                result += integerValues.get(i);
            }
        }

        return result;
    }

}
