package com.denisov.patterns.behavioral;


import com.denisov.patterns.behavioral.command.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {

    public static final String SELECT = "select";
    public static final String INSERT = "insert";
    public static final String UPDATE = "update";
    public static final String DELETE = "delete";

    @Test
    void test() {
        Database database = new Database();
        Developer developer = new Developer(
                new SelectCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database));

        assertEquals(SELECT, developer.select());
        assertEquals(INSERT, developer.insert());
        assertEquals(UPDATE, developer.update());
        assertEquals(DELETE, developer.delete());
    }
}
