package com.denisov.patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public String beWritten(Developer developer) {
        return developer.create(this);
    }
}
