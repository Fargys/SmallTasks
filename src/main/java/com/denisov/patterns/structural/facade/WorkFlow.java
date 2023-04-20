package com.denisov.patterns.structural.facade;

public class WorkFlow {
    private final Developer developer = new Developer();
    private final Job job = new Job();
    private final BugTracker bugTracker = new BugTracker();

    public String solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        return developer.doJobBeforeDeadline(bugTracker);
    }
}
