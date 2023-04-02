package com.denisov.leetCode.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeakestRowTest {

    private final WeakestRow weakestRow = new WeakestRow();

    @Test
    public void positive() {
        int[][] mat =  {{1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}};
        int k = 3;

        int[] expected = {2,0,3};
        int[] actual = weakestRow.kWeakestRows(mat, k);



        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int[][] mat =  {{1 ,0, 0, 0},
                        {1 ,1, 1, 1},
                        {1 ,0, 0, 0},
                        {1 ,0, 0, 0}};
        int k = 2;

        int[] expected = {0,2};
        int[] actual = weakestRow.kWeakestRows(mat, k);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void positive3() {
        int[][] mat =  {{1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1}};
        int k = 1;

        int[] expected = {0};
        int[] actual = weakestRow.kWeakestRows(mat, k);

        Assertions.assertArrayEquals(expected, actual);
    }
}
