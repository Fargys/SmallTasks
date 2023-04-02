package com.denisov.leetCode.topHundred;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArrayTest {

    public final MedianTwoSortedArray medianTwoSortedArray = new MedianTwoSortedArray();

    @Test
    public void positive() {
        int[] first = {1, 3};
        int[] second = {2};

        double expected = 2;
        double actual = medianTwoSortedArray.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive1() {
        int[] first = {1, 2};
        int[] second = {3, 4};

        double expected = 2.5d;
        double actual = medianTwoSortedArray.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int[] first = {};
        int[] second = {1};

        double expected = 1;
        double actual = medianTwoSortedArray.findMedianSortedArrays(first, second);

        Assertions.assertEquals(expected, actual);
    }
}
