package com.denisov.leetCode.challenge;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FizzBizzTest {

    private final FizzBizz fizzBizz = new FizzBizz();

    @Test
    public void positive() {
        List<String> actual = fizzBizz.fizzBuzz(3);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        Assertions.assertEquals(expected, actual);

        actual = fizzBizz.fizzBuzz(5);
        expected.clear();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        Assertions.assertEquals(expected, actual);

        actual = fizzBizz.fizzBuzz(15);
        expected.clear();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("FizzBuzz");
        Assertions.assertEquals(expected, actual);
    }
}
