package com.denisov.patterns.behavioral.visitor;

public interface Developer {
    String create(ProjectClass projectClass);
    String create(Database database);
    String create(Test test);
}
