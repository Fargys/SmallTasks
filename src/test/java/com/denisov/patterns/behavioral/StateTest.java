package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.state.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {

    private static final String CODDING = "codding";
    private static final String READING = "reading";
    private static final String TRAINING = "training";
    private static final String SLEEPING = "sleeping";

    @Test
    void test() {
        Developer developer = new Developer();

        developer.setActivity(new Codding());
        assertEquals(CODDING, developer.justDoIt());

        developer.setActivity(new Reading());
        assertEquals(READING, developer.justDoIt());

        developer.setActivity(new Training());
        assertEquals(TRAINING, developer.justDoIt());

        developer.setActivity(new Sleeping());
        assertEquals(SLEEPING, developer.justDoIt());
    }
}
