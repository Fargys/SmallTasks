package com.denisov.leetCode.challenge;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReducedStepsTest {

    private final ReducedSteps reducedSteps = new ReducedSteps();

    @Test
    public void positive() {
        int expected = 6;
        int result = reducedSteps.numberOfSteps(14);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void positive2() {
        int expected = 4;
        int result = reducedSteps.numberOfSteps(8);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void positive3() {
        int expected = 12;
        int result = reducedSteps.numberOfSteps(123);
        Assertions.assertEquals(expected, result);
    }
}
