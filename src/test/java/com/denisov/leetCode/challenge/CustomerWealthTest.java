package com.denisov.leetCode.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerWealthTest {

    private final CustomerWealth customerWealth = new CustomerWealth();

    @Test
    public void positive() {
        int[][] mat =  {{1, 2, 3},
                        {3, 2, 1}};

        int expected = 6;
        int actual = customerWealth.maximumWealth(mat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive2() {
        int[][] mat =  {{1, 5},
                        {7, 3},
                        {3, 5}};

        int expected = 10;
        int actual = customerWealth.maximumWealth(mat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void positive3() {
        int[][] mat =  {{2, 8, 7},
                        {7, 1, 3},
                        {1, 9, 5}};

        int expected = 17;
        int actual = customerWealth.maximumWealth(mat);

        Assertions.assertEquals(expected, actual);
    }
}
