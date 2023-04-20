package com.denisov.patterns.behavioral.visitor;

public class Project implements ProjectElement {
    private final ProjectElement[] elements;

    public Project() {
        elements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public String beWritten(Developer developer) {
        StringBuilder result = new StringBuilder();

        for(ProjectElement elem: elements)
            result.append(elem.beWritten(developer)).append(" ");

        return result.toString().trim();

    }
}
