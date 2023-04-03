package com.denisov.util;

import com.denisov.util.pojo.Car;
import com.denisov.util.pojo.User;

public class CollectionsTemplates {

    // int
    public static final int[] SORTED_INT_ARRAY = new int[]
            {1, 2, 3, 4, 5, 6, 7, 8};

    public static final int[] UNSORTED_INT_ARRAY = new int[]
            {3, 5, 7, 8, 4, 2, 1, 6};

    public static final int[] SORTED_INT_ARRAY_REVERSE = new int[]
            {8, 7, 6, 5, 4, 3, 2, 1};

    public static final int[] ONLY_EVEN_INT_ARRAY = new int[]
            {8, 4, 2, 6};

    // String
    public static final String[] SORTED_STRING_ARRAY = new String[]
            {"", " ", "a", "abc", "abc", "acbd", "bc", "cbaaa"};

    public static final String[] SORTED_STRING_ARRAY_REVERSE = new String[]
            {"cbaaa", "bc", "acbd", "abc", "abc", "a", " ", ""};

    public static final String[] UNSORTED_STRING_ARRAY = new String[]
            {"a", "bc", "", "abc", "abc", "acbd", " ", "cbaaa"};

    public static final String[] CAPITALIZE_UNSORTED_STRING_ARRAY = new String[]
            {"A", "Bc", "", "Abc", "Abc", "Acbd", " ", "Cbaaa"};

    public static final String[] UPPER_UNSORTED_STRING_ARRAY = new String[]
            {"A", "BC", "", "ABC", "ABC", "ACBD", " ", "CBAAA"};

    public static final String[] NO_EMPTY_UNSORTED_STRING_ARRAY = new String[]
            {"a", "bc", "abc", "abc", "acbd", "cbaaa"};

    // User
    public static final User[] SUBUSERS_ARRAY = new User[]{
            new User("Tom", 30),
            new User("Duck", 25),
            new User("Philip", 30),
            new User("Owen", 20)};

    private static final User[] BRUCE_SUBUSERS_ARRAY = new User[]{
            new User("Tom", 30),
            new User("Duck", 25)};

    private static final User[] JERRY_SUBUSER_ARRAY = new User[]{
            new User("Philip", 30),
            new User("Owen", 20)};

    public static final User[] SORTED_USER_ARRAY = new User[]{
            new User("Alex", 20),
            new User("Bruce", 25, BRUCE_SUBUSERS_ARRAY),
            new User("Jerry", 30, JERRY_SUBUSER_ARRAY),
            new User("Jordan", 30)};

    public static final User[] UNSORTED_USER_ARRAY = new User[]{
            new User("Jerry", 30, JERRY_SUBUSER_ARRAY),
            new User("Bruce", 25, BRUCE_SUBUSERS_ARRAY),
            new User("Jordan", 30),
            new User("Alex", 20)};

    // Car
    public static final Car[] SORTED_CAR_ARRAY = new Car[]{
            new Car("", 2011),
            new Car("        ", 2015),
            new Car("AA1111BX", 2007),
            new Car("AB1111BE", 2009),
            new Car("BK5555IT", 2010),
            new Car("CI5601CC", 2010),
            new Car("DI3838PP", 2017)};

    public static final String[] SORTED_CAR_NUMBER_ARRAY = new String[]
            {"", "        ", "AA1111BX", "AB1111BE", "BK5555IT", "CI5601CC", "DI3838PP"};
}