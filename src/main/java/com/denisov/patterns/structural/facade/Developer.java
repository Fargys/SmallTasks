package com.denisov.patterns.structural.facade;

public class Developer {

    public String doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint())
            return "do job";
        else
            return "do study";
    }
}
