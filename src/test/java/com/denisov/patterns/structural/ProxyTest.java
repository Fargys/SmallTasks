package com.denisov.patterns.structural;

import com.denisov.patterns.structural.proxy.Project;
import com.denisov.patterns.structural.proxy.ProxyProject;
import com.denisov.patterns.structural.proxy.RealProject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    public static final String URL      = "github/myproject";
    public static final String EXPECTED = URL + " loaded";

    @Test
    void test() {
        Project project = new RealProject(URL); // project.url = expected
        String actual = project.run();
        assertEquals(EXPECTED, actual);
    }

    @Test
    void testProxy() {
        Project project = new ProxyProject(URL); // project.url = url
        String actual = project.run();           // project.url = expected
        assertEquals(EXPECTED, actual);
    }
}
