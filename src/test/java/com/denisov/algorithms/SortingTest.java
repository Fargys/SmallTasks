package com.denisov.algorithms;

import com.denisov.algorithms.Sorting;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SortingTest {

    int[] actual, expected;

    @BeforeEach
    public void init() {
        expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        actual = new int[]{3, 5, 7, 8, 9, 4, 2, 1, 6};
    }

    @Order(1)
    @Test
    void bubble() {
        Sorting.bubble(actual);
        assertArrayEquals(expected, actual);
    }

    @Order(2)
    @Test
    void selection() {
        Sorting.selection(actual);
        assertArrayEquals(expected, actual);
    }

    @Order(3)
    @Test
    void insert() {
        Sorting.insert(actual);
        assertArrayEquals(expected, actual);
    }

    @Order(4)
    @Test
    void merging() {
        Sorting.merging(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Order(5)
    @Test
    void heaping() {
        Sorting.heaping(actual);
        assertArrayEquals(expected, actual);
    }

    @Order(6)
    @Test
    void quick() {
        Sorting.quick(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }
}
