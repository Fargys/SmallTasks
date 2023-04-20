package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.visitor.Developer;
import com.denisov.patterns.behavioral.visitor.JuniorDeveloper;
import com.denisov.patterns.behavioral.visitor.Project;
import com.denisov.patterns.behavioral.visitor.SeniorDeveloper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

    private static final String JUNIOR_PROJECT = "Junior class Junior database Junior test";
    private static final String SENIOR_PROJECT = "Senior class Senior database Senior test";

    @Test
    void test() {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        assertEquals(JUNIOR_PROJECT, project.beWritten(junior));
        assertEquals(SENIOR_PROJECT, project.beWritten(senior));
    }
}
