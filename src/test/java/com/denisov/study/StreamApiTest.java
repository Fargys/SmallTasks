package com.denisov.study;

import com.denisov.util.pojo.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;

import static com.denisov.util.CollectionsTemplates.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StreamApiTest {

    private final StreamApi api = new StreamApi();

    @Order(1)
    @Test
    void sortArray() {
        int[] actual = api.sortArray(UNSORTED_INT_ARRAY);

        assertArrayEquals(SORTED_INT_ARRAY, actual);
    }

    @Order(2)
    @Test
    void sortArrayReverse() {
        int[] actual = api.sortArrayReverse(UNSORTED_INT_ARRAY);

        assertArrayEquals(SORTED_INT_ARRAY_REVERSE, actual);
    }

    @Order(3)
    @Test
    void sortString() {
        String[] actual = api.sortString(UNSORTED_STRING_ARRAY);

        assertArrayEquals(SORTED_STRING_ARRAY, actual);
    }

    @Order(4)
    @Test
    void sortStringReverse() {
        String[] actual = api.sortStringReverse(UNSORTED_STRING_ARRAY);

        assertArrayEquals(SORTED_STRING_ARRAY_REVERSE, actual);
    }

    @Order(5)
    @Test
    void sortUserArray() {
        User[] actual = api.sortUserArray(UNSORTED_USER_ARRAY);

        assertArrayEquals(SORTED_USER_ARRAY, actual);
    }

    @Order(6)
    @Test
    void filterOdds() {
        int[] actual = api.filterOdds(UNSORTED_INT_ARRAY);

        assertArrayEquals(ONLY_EVEN_INT_ARRAY, actual);
    }

    @Order(7)
    @Test
    void countStrings() {
        long expected = 4;
        long actual = api.countStrings(UNSORTED_STRING_ARRAY, 3);

        assertEquals(expected, actual);
    }

    @Order(8)
    @Test
    void countNoEmptyString() {
        long expected = 5;
        long actual = api.countNoEmptyString(UNSORTED_STRING_ARRAY, "a");

        assertEquals(expected, actual);
    }

    @Order(9)
    @Test
    void multiplyNumbers() {
        int multiplier = 2;
        int[] array = new int[]{3, 5, 7, 8};

        int[] expected = new int[]{array[0] * multiplier, array[1] * multiplier,
                array[2] * multiplier, array[3] * multiplier};
        int[] actual = api.multiplyNumbers(array, multiplier);

        assertArrayEquals(expected, actual);
    }

    @Order(10)
    @Test
    void capitalizeString() {
        String[] actual = api.capitalizeString(UNSORTED_STRING_ARRAY);

        assertArrayEquals(CAPITALIZE_UNSORTED_STRING_ARRAY, actual);
    }

    @Order(11)
    @Test
    void mapObjectToString() {
        String[] actual = api.mapObjectToString(SORTED_CAR_ARRAY);

        assertArrayEquals(SORTED_CAR_NUMBER_ARRAY, actual);
    }

    @Order(12)
    @Test
    void mapObjectToStringWithFilter() {
        String[] expected = new String[]{"DI3838PP"};
        String[] actual = api.mapObjectToStringWithFilter(SORTED_CAR_ARRAY, 2011);

        assertArrayEquals(expected, actual);
    }

    @Order(13)
    @Test
    void mapListToSetAndUpper() {
        Set<String> expected = CollectionUtils.toSet(UPPER_UNSORTED_STRING_ARRAY);
        Set<String> actual = api.mapListToSetAndUpper(UNSORTED_STRING_ARRAY);

        assertEquals(expected, actual);
    }

    @Order(14)
    @Test
    void mapListToNotBlankQueue() {
        Queue<String> expected = new LinkedList<>(Arrays.asList(NO_EMPTY_UNSORTED_STRING_ARRAY));
        Queue<String> actual = api.mapListToNotBlankQueue(UNSORTED_STRING_ARRAY);

        assertEquals(expected, actual);
    }

    @Order(15)
    @Test
    void groupByAges() {
        Map<Integer, List<User>> usersByAgeMap = api.groupByAges(SORTED_USER_ARRAY);
        assertEquals(1, usersByAgeMap.get(20).size());
        assertEquals(1, usersByAgeMap.get(25).size());
        assertEquals(2, usersByAgeMap.get(30).size());
    }

    @Order(16)
    @Test
    void groupByAgeAndCount() {
        Map<Integer, Long> usersByAgeAndCountMap = api.groupByAgeAndCount(SORTED_USER_ARRAY);
        assertEquals(1, usersByAgeAndCountMap.get(20));
        assertEquals(1, usersByAgeAndCountMap.get(25));
        assertEquals(2, usersByAgeAndCountMap.get(30));
    }

    @Order(17)
    @Test
    void groupByAgeAndSum() {
        Map<Integer, Integer> usersByAgeAndCountMap = api.groupByAgeAndSum(SORTED_USER_ARRAY);
        assertEquals(20, usersByAgeAndCountMap.get(20));
        assertEquals(25, usersByAgeAndCountMap.get(25));
        assertEquals(60, usersByAgeAndCountMap.get(30));
    }

    @Order(18)
    @Test
    void flatUsers() {
        User[] actual = api.flatUsers(SORTED_USER_ARRAY);

        assertArrayEquals(SUBUSERS_ARRAY, actual);
    }

    @Order(19)
    @Test
    void flatArray() {
        int[][] array = new int[][]{{5, 7, 3, 17}, {7, 0, 1, 12}};

        int[] expected = new int[]{5, 7, 3, 17, 7, 0, 1, 12};
        int[] actual = api.flatArray(array);

        assertArrayEquals(expected, actual);
    }

    @Order(20)
    @Test
    void findAny() {
        String contains = "abc";
        String actual = api.findAny(SORTED_STRING_ARRAY, contains);

        assertNotNull(actual);
        assertTrue(actual.contains(contains));
    }

    @Order(21)
    @Test
    void findFirst() {
        int expected = SORTED_INT_ARRAY[3];
        int actual = api.findFirst(SORTED_INT_ARRAY, 3);

        assertEquals(expected, actual);
    }

    @Order(22)
    @Test
    void anyMatch() {
        assertFalse(api.anyMatch(ONLY_EVEN_INT_ARRAY));
        assertTrue(api.anyMatch(SORTED_INT_ARRAY));
    }

    @Order(23)
    @Test
    void allMatch() {
        assertFalse(api.allMatch(SORTED_INT_ARRAY));
        assertTrue(api.allMatch(ONLY_EVEN_INT_ARRAY));
    }

    @Order(24)
    @Test
    void noneMatch() {
        assertFalse(api.noneMatch(SORTED_INT_ARRAY));
        assertTrue(api.noneMatch(ONLY_EVEN_INT_ARRAY));
    }

    @Order(25)
    @Test
    void sumArrayItem() {
        int expected = 20;
        int actual = api.sumArrayItem(ONLY_EVEN_INT_ARRAY);

        assertEquals(expected, actual);
    }

    @Order(26)
    @Test
    void sumArrayItemAndValue() {
        int expected = 40;
        int actual = api.sumArrayItemAndValue(ONLY_EVEN_INT_ARRAY, 20);

        assertEquals(expected, actual);
    }

    @Order(27)
    @Test
    void sumMultiplyEveryItem() {
        int expected = 200;
        int actual = api.sumMultiplyEveryItem(ONLY_EVEN_INT_ARRAY, 10);

        assertEquals(expected, actual);
    }

    @Order(28)
    @Test
    void searchMinValue() {
        int expected = SORTED_INT_ARRAY[0];
        int actual = api.searchMinValue(UNSORTED_INT_ARRAY);

        assertEquals(expected, actual);
    }

    @Order(29)
    @Test
    void searchLongestString() {
        String expected = "cbaaa";
        String actual = api.searchLongestString(UNSORTED_STRING_ARRAY);

        assertEquals(expected, actual);
    }

    @Order(30)
    @Test
    void limit() {
        int limit = 3;
        int[] expected = Arrays.copyOfRange(UNSORTED_INT_ARRAY, 0, limit);
        int[] actual = api.limit(UNSORTED_INT_ARRAY, limit);

        assertArrayEquals(expected, actual);
    }

    @Order(31)
    @Test
    void skip() {
        int skip = 3;
        int[] expected = Arrays.copyOfRange(UNSORTED_INT_ARRAY, skip, UNSORTED_INT_ARRAY.length);
        int[] actual = api.skip(UNSORTED_INT_ARRAY, skip);

        assertArrayEquals(expected, actual);
    }
}