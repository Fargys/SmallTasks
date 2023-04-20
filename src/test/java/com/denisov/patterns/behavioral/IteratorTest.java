package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.iterator.Iterator;
import com.denisov.patterns.behavioral.iterator.JavaDeveloper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {
    private static final List<String> SKILLS = Arrays.asList("Java", "Spring", "REST", "Docker");
    private static final String DEV_NAME = "name";

    @Test
    void test() {
        JavaDeveloper javaDeveloper = new JavaDeveloper(DEV_NAME, SKILLS);
        Iterator iterator = javaDeveloper.getIterator();

        List<String> actualSkills = new ArrayList<>();

        while(iterator.hasNext())
            actualSkills.add(iterator.next().toString());

        assertEquals(SKILLS, actualSkills);
    }
}
