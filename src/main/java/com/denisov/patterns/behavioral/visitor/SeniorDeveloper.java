package com.denisov.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    private final static String SENIOR = "Senior";

    @Override
    public String create(ProjectClass projectClass) {
        return SENIOR + " class";
    }

    @Override
    public String create(Database database) {
        return SENIOR + " database";
    }

    @Override
    public String create(Test test) {
        return SENIOR + " test";
    }
}
