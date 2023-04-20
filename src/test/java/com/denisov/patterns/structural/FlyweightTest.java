package com.denisov.patterns.structural;

import com.denisov.patterns.structural.flyweight.Developer;
import com.denisov.patterns.structural.flyweight.DeveloperFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {

    public static final String JAVA_SPEC = "java";
    public static final String CPP_SPEC  = "C++";
    public static final String EXPECTED = "java java java java C++ C++ C++";

    @Test
    void test() {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> team = new ArrayList<>();
        team.add(factory.getDevBySpeciality(JAVA_SPEC));
        team.add(factory.getDevBySpeciality(JAVA_SPEC));
        team.add(factory.getDevBySpeciality(JAVA_SPEC));
        team.add(factory.getDevBySpeciality(JAVA_SPEC));

        team.add(factory.getDevBySpeciality(CPP_SPEC));
        team.add(factory.getDevBySpeciality(CPP_SPEC));
        team.add(factory.getDevBySpeciality(CPP_SPEC));

        String actual = team.stream()
                .map(Developer::writeCode)
                .collect(Collectors.joining(" "));
        assertEquals(EXPECTED, actual);
    }
}
