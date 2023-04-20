package com.denisov.patterns.structural;

import com.denisov.patterns.structural.composite.CppDeveloper;
import com.denisov.patterns.structural.composite.JavaDeveloper;
import com.denisov.patterns.structural.composite.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    public static final String EXPECTED_PROJECT = "team java java C++";

    @Test
    void test() {
        Team team = new Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());

        assertEquals(EXPECTED_PROJECT, team.createProject());
    }
}
