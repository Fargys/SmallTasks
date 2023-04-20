package com.denisov.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private final Map<String, Developer> map = new HashMap<>();

    public Developer getDevBySpeciality(String speciality) {
        Developer developer = map.get(speciality);

        if(developer == null) {
            switch (speciality) {
                case ("java") -> developer = new JavaDeveloper();
                case ("C++") -> developer = new CppDeveloper();
            }
            map.put(speciality, developer);
        }

        return developer;
    }
}
