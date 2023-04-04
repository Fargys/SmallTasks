package com.denisov.study.mycollectionsTest;

import com.denisov.study.mycollections.MyMap;
import com.denisov.study.mycollections.MyTreeMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTreeMapTest {

    private MyMap<String, Integer> treeMap;

    @BeforeEach
    void init() {
        treeMap = new MyTreeMap<>();
        treeMap.put("0", 0);
    }

    @Test
    void addTest() {
        int expectedSize = treeMap.size() + 1;
        treeMap.put("1", 1);
        int actualSize = treeMap.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void getTest() {
        int expected = 0;
        int actual = treeMap.get("0");
        assertEquals(expected, actual);
    }

    @Test
    void removeTest() {
        int expectedElement = 0;
        int expectedSize = treeMap.size() - 1;

        int actualElement = treeMap.remove("0");
        int actualSize = treeMap.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }
}