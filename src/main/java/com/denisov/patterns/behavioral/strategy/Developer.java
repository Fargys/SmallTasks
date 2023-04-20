package com.denisov.patterns.behavioral.strategy;

public class Developer {
    private Activity activity;

    public String execute() {
        return activity.justDoIt();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
