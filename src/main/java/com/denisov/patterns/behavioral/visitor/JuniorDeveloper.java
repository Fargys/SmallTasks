package com.denisov.patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {
    private final static String JUNIOR = "Junior";

    @Override
    public String create(ProjectClass projectClass) {
        return JUNIOR + " class";
    }

    @Override
    public String create(Database database) {
        return JUNIOR + " database";
    }

    @Override
    public String create(Test test) {
        return JUNIOR + " test";
    }
}
