package com.denisov.mycollectionsTest;

import com.denisov.mycollections.MyHashMap;
import com.denisov.mycollections.MyMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyHashMapTest {

    private MyMap<String, Integer> hashMap;

    @BeforeEach
    void init() {
        hashMap = new MyHashMap<>(16, 0.75f);
        hashMap.put("0", 0);
    }

    @Test
    void addTest() {
        int expectedSize = hashMap.size() + 1;
        hashMap.put("1", 1);
        int actualSize = hashMap.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void getTest() {
        int expected = 0;
        int actual = hashMap.get("0");
        assertEquals(expected, actual);
    }

    @Test
    void removeTest() {
        int expectedElement = 0;
        int expectedSize = hashMap.size() - 1;

        int actualElement = hashMap.remove("0");
        int actualSize = hashMap.size();

        assertEquals(expectedElement, actualElement);
        assertEquals(expectedSize, actualSize);
    }
}