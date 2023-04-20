package com.denisov.patterns.creational;

import com.denisov.patterns.creational.abcsractfactory.Developer;
import com.denisov.patterns.creational.abcsractfactory.Manager;
import com.denisov.patterns.creational.abcsractfactory.TeamFactory;
import com.denisov.patterns.creational.abcsractfactory.Tester;
import com.denisov.patterns.creational.abcsractfactory.banking.BankingTeamFactory;
import com.denisov.patterns.creational.abcsractfactory.website.WebsiteTeamFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryTest {

    private static final String BANK_DEV_EXPECTED      = "Java";
    private static final String BANK_TEST_EXPECTED     = "test QA";
    private static final String BANK_MANAGER_EXPECTED  = "manage banking";

    @Test
    void testBanking() {
        TeamFactory factory = new BankingTeamFactory();

        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        Manager manager = factory.getManager();

        String actual = developer.writeCode();
        assertEquals(BANK_DEV_EXPECTED, actual);

        actual = tester.testCode();
        assertEquals(BANK_TEST_EXPECTED, actual);

        actual = manager.manage();
        assertEquals(BANK_MANAGER_EXPECTED, actual);
    }

    private static final String WEBSITE_DEV_EXPECTED      = "PHP";
    private static final String WEBSITE_TEST_EXPECTED     = "test manual";
    private static final String WEBSITE_MANAGER_EXPECTED  = "manage website";

    @Test
    void testWebsite() {
        TeamFactory factory = new WebsiteTeamFactory();

        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        Manager manager = factory.getManager();

        String actual = developer.writeCode();
        assertEquals(WEBSITE_DEV_EXPECTED, actual);

        actual = tester.testCode();
        assertEquals(WEBSITE_TEST_EXPECTED, actual);

        actual = manager.manage();
        assertEquals(WEBSITE_MANAGER_EXPECTED, actual);
    }
}
