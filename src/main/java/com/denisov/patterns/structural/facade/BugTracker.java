package com.denisov.patterns.structural.facade;

public class BugTracker {
    private boolean isActiveSprint;

    public void startSprint() {
        isActiveSprint = true;
    }

    public void finishSprint() {
        isActiveSprint = false;
    }

    public boolean isActiveSprint() {
        return isActiveSprint;
    }
}
