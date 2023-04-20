package com.denisov.patterns.creational;

import com.denisov.patterns.creational.prototype.Project;
import com.denisov.patterns.creational.prototype.ProjectFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class PrototypeTest {

    private static final String EXPECTED = "Project{id=1, projectName='name', source='source'}";

    @Test
    void test() {
        Project master = new Project(1, "name", "source");
        assertEquals(EXPECTED, master.toString());

        ProjectFactory factory = new ProjectFactory(master);

        Project clone = factory.cloneProject();
        assertEquals(master, clone);
        assertNotSame(master, clone);
    }
}
