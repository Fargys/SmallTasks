package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    private static final String CODDING = "codding";
    private static final String READING = "reading";
    private static final String TRAINING = "training";
    private static final String SLEEPING = "sleeping";

    @Test
    void test() {
        Developer developer = new Developer();

        developer.setActivity(new Codding());
        assertEquals(CODDING, developer.execute());

        developer.setActivity(new Reading());
        assertEquals(READING, developer.execute());

        developer.setActivity(new Training());
        assertEquals(TRAINING, developer.execute());

        developer.setActivity(new Sleeping());
        assertEquals(SLEEPING, developer.execute());
    }
}
