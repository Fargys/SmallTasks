package com.denisov.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecursionTest {

    private final Recursion recursion = new Recursion();

    @Test
    void factorial() {
        int expected = 120;
        int actual = recursion.factorial(5);

        assertEquals(expected, actual);
    }

    @Test
    void getEachValueTo() {
        String expected = "12345";
        String actual = recursion.getEachValueTo(5);

        assertEquals(expected, actual);
    }

    @Test
    void getEachValueBetween() {
        String expected = "12345";
        String actual = recursion.getEachValueBetween(1, 5);

        assertEquals(expected, actual);
    }

    @Test
    void isPowerOfTwo() {
        boolean condition = recursion.isPowerOfTwo(64);
        assertTrue(condition);
    }

    @Test
    void countSumOfDigit() {
        int expected = 10;
        int actual = recursion.countSumOfDigit(64);

        assertEquals(expected, actual);
    }

    @Test
    void revertWithEscapes() {
        String expected = "5 4 3 2 1";
        String actual = recursion.revertWithEscapes(12345);

        assertEquals(expected, actual);
    }

    @Test
    void printWithEscapes() {
        String expected = "1 2 3 4 5";
        String actual = recursion.printWithEscapes(12345);

        assertEquals(expected, actual);
    }

    @Test
    void getAllMultipliers() {
        String expected = "2 2 2 3 5";
        String actual = recursion.getAllMultipliers(120, 2);

        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome() {
        String palindrome = "abcdefedcba";
        boolean result = recursion.isPalindrome(palindrome);

        assertTrue(result);
    }
}
