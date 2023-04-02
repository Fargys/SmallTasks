package com.denisov.leetCode.topHundred;

import java.util.HashMap;
import java.util.Map;

public class LongestString {

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> charLastPositionMap = new HashMap<>();

        char[] charArray = s.toCharArray();
        int maxResult = 0;
        int middleResult = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charMap.get(charArray[i]) == null) {
                middleResult++;
                charMap.put(charArray[i], 1);
            }
            else {
                middleResult = 0;
                charMap = new HashMap<>();
                i = charLastPositionMap.get(charArray[i]);
            }

            maxResult = Math.max(middleResult, maxResult);
            charLastPositionMap.put(charArray[i], i);
        }

        return maxResult;
    }
}
