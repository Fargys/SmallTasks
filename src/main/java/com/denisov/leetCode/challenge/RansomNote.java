package com.denisov.leetCode.challenge;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] counts = new int[26];

        for (char ch : magazine.toCharArray())
            counts[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {
            if (counts[ch - 'a'] == 0) return false;
            counts[ch - 'a']--;
        }

        return true;
    }
}
