package com.denisov.patterns.creational;

import com.denisov.patterns.creational.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    private static final String FIRST    = "1";
    private static final String SECOND   = "2";
    private static final String EXPECTED = FIRST + SECOND;

    @Test
    void test() {
        Logger logger = Logger.getLogger();
        Logger logger1 = Logger.getLogger();
        assertSame(logger, logger1);

        Logger.addLogInfo(FIRST);
        Logger.addLogInfo(SECOND);

        assertEquals(EXPECTED, Logger.getLogInfo());
    }
}
