package com.denisov.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeCodeReview() {
        return "code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
