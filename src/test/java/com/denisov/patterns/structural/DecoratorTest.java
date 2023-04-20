package com.denisov.patterns.structural;

import com.denisov.patterns.structural.decorator.Developer;
import com.denisov.patterns.structural.decorator.JavaDeveloper;
import com.denisov.patterns.structural.decorator.SeniorJavaDeveloper;
import com.denisov.patterns.structural.decorator.TeemLeadDeveloper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    private static final String JAVA        = "java";
    private static final String SENIOR_JAVA = JAVA + " code review";
    private static final String TEEM_LEAD   = JAVA + " week report";

    @Test
    void testJava() {
        Developer developer = new JavaDeveloper();
        assertEquals(JAVA, developer.makeJob());
    }

    @Test
    void testSenior() {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        assertEquals(SENIOR_JAVA, developer.makeJob());
    }

    @Test
    void testTeamLead() {
        Developer developer = new TeemLeadDeveloper(new JavaDeveloper());
        assertEquals(TEEM_LEAD, developer.makeJob());
    }
}
