package com.denisov.patterns.structural.decorator;

public class TeemLeadDeveloper extends DeveloperDecorator {
    public TeemLeadDeveloper(Developer developer) {
        super(developer);
    }

    private String createWeekReport() {
        return "week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + createWeekReport();
    }
}
