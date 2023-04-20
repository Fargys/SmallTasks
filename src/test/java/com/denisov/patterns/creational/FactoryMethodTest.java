package com.denisov.patterns.creational;

import com.denisov.patterns.creational.factorymethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

    private static final String JAVA = "Java";
    private static final String CPP  = "C++";
    private static final String PHP  = "PHP";

    @Test
    void javaTest() {
        DeveloperFactory factory = createDeveloperBySpeciality(JAVA);
        Developer javaDeveloper = factory.createDeveloper();
        String actual = javaDeveloper.writeCode();

        assertEquals(JAVA, actual);
    }

    @Test
    void cppTest() {
        DeveloperFactory factory = createDeveloperBySpeciality(CPP);
        Developer cppDeveloper = factory.createDeveloper();
        String actual = cppDeveloper.writeCode();

        assertEquals(CPP, actual);
    }

    @Test
    void phpTest() {
        DeveloperFactory factory = createDeveloperBySpeciality(PHP);
        Developer cppDeveloper = factory.createDeveloper();
        String actual = cppDeveloper.writeCode();

        assertEquals(PHP, actual);
    }

    private static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        return switch (speciality) {
            case (JAVA) -> new JavaDeveloperFactory();
            case (CPP) -> new CppDeveloperFactory();
            case (PHP) -> new PhpDeveloperFactory();
            default -> throw new UnsupportedOperationException();
        };
    }
}
