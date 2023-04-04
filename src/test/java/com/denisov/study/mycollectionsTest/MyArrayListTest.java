package com.denisov.study.mycollectionsTest;

import com.denisov.study.mycollections.MyArrayList;
import com.denisov.study.mycollections.MyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyArrayListTest {

    private MyCollection<Integer> list;

    @BeforeEach
    void init() {
        list = new MyArrayList<>();
        list.add(0);
    }

    @Test
    void addTest() {
        int expected = list.size() + 1;
        boolean isAdded = list.add(0);
        assertTrue(isAdded);
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    void addByIndexTest() {
        int expected = list.size() + 1;
        boolean isAdded = list.add(0, 0);
        assertTrue(isAdded);
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    void getTest() {
        int expected = 0;
        int actual = list.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void setTest() {
        int expectedElement = 0;
        int expectedSize = list.size();

        int actualElement = list.set(0, 1);
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void removeTest() {
        int expectedElement = 0;
        int expectedSize = list.size() - 1;

        int actualElement = list.remove(0);
        int actualSize = list.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }
}