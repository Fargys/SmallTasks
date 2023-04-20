package com.denisov.patterns.structural;

import com.denisov.patterns.structural.facade.BugTracker;
import com.denisov.patterns.structural.facade.Developer;
import com.denisov.patterns.structural.facade.Job;
import com.denisov.patterns.structural.facade.WorkFlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {

    public static final String ACTIVE_SPRING_JOB     = "do job";
    public static final String NOT_ACTIVE_SPRING_JOB = "do study";

    @Test
    void test() {
        Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();

        Developer developer = new Developer();
        assertEquals(ACTIVE_SPRING_JOB, developer.doJobBeforeDeadline(bugTracker));

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
        assertEquals(NOT_ACTIVE_SPRING_JOB, developer.doJobBeforeDeadline(bugTracker));
    }

    @Test
    void testWithFacade() {
        WorkFlow workFlow = new WorkFlow();
        assertEquals(ACTIVE_SPRING_JOB, workFlow.solveProblems());

    }
}
