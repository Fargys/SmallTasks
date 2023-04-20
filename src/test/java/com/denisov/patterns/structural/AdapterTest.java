package com.denisov.patterns.structural;

import com.denisov.patterns.structural.adapter.Database;
import com.denisov.patterns.structural.adapter.JavaAppToDbAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {
    public static final String LOAD = "load";
    public static final String SAVE = "save";
    public static final String UPDATE = "update";
    public static final String DELETE = "delete";

    @Test
    void test() {
        Database database = new JavaAppToDbAdapter();
        assertEquals(LOAD, database.select());
        assertEquals(SAVE, database.insert());
        assertEquals(UPDATE, database.update());
        assertEquals(DELETE, database.remove());
    }
}
