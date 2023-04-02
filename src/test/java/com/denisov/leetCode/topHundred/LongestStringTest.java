package com.denisov.leetCode.topHundred;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LongestStringTest {

    public final LongestString longestString = new LongestString();

    @Test
    public void positive() {
        int expected = 3;
        int actual = longestString.lengthOfLongestSubstring("abcabcbb");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int expected = 1;
        int actual = longestString.lengthOfLongestSubstring("bbbbb");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive3() {
        int expected = 3;
        int actual = longestString.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive4() {
        int expected = 0;
        int actual = longestString.lengthOfLongestSubstring("");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive5() {
        int expected = 1;
        int actual = longestString.lengthOfLongestSubstring(" ");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive6() {
        int expected = 3;
        int actual = longestString.lengthOfLongestSubstring("dvdf");

        Assertions.assertEquals(expected, actual);
    }
}
