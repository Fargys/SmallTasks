package com.denisov.leetCode.topHundred;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TwoSumTest {

    public final TwoSum twoSum = new TwoSum();

    @Test
    public void positive1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int[] nums = {3, 2, 3};
        int target = 6;

        int[] expected = {0, 2};
        int[] actual = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void positive3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}