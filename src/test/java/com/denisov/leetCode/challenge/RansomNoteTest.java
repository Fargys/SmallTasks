package com.denisov.leetCode.challenge;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RansomNoteTest {

    final RansomNote ransomNote = new RansomNote();

    @Test
    public void positive() {
        boolean result = ransomNote.canConstruct("a", "a");
        Assertions.assertTrue(result);

        result = ransomNote.canConstruct("aa", "aab");
        Assertions.assertTrue(result);

        result = ransomNote.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
        Assertions.assertTrue(result);
    }

    @Test
    public void negative() {
        boolean result = ransomNote.canConstruct("a", "b");
        Assertions.assertFalse(result);

        result = ransomNote.canConstruct("aa", "ab");
        Assertions.assertFalse(result);
    }
}
