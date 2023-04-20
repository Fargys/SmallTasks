package com.denisov.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private final List<Developer> devs = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        devs.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        devs.remove(developer);
    }

    public String createProject() {
        String result = "team ";

        return result + devs.stream()
                .map(Developer::writeCode)
                .collect(Collectors.joining(" "));
    }
}
