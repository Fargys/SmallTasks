package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.memento.GitHubRepository;
import com.denisov.patterns.behavioral.memento.Project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    private static final String VERSION_1_0 = "v1.0";
    private static final String VERSION_2_0 = "v2.0";

    public static final String FIRST_STATE  = "Project{version='v1.0}";
    public static final String SECOND_STATE = "Project{version='v2.0}";

    @Test
    void test() {
        Project project = new Project();
        GitHubRepository repository = new GitHubRepository();
        project.setVersion(VERSION_1_0);
        assertEquals(FIRST_STATE, project.toString());

        repository.setSave(project.save());
        project.setVersion(VERSION_2_0);
        assertEquals(SECOND_STATE, project.toString());

        project.load(repository.getSave());
        assertEquals(FIRST_STATE, project.toString());
    }
}
