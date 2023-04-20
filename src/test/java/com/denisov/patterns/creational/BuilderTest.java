package com.denisov.patterns.creational;

import com.denisov.patterns.creational.builder.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    private static final String VISIT_CARD_EXPECTED = "Website{name='visit card', cms=WORDPRESS, price=500}";
    private static final String ENTERPRISE_EXPECTED = "Website{name='Enterprise', cms=ALIFRESCO, price=10000}";

    @Test
    void testVisitCard() {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());

        Website website = director.buildWebsite();

        assertEquals(VISIT_CARD_EXPECTED, website.toString());
    }

    @Test
    void testEnterprise() {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());

        Website website = director.buildWebsite();

        assertEquals(ENTERPRISE_EXPECTED, website.toString());
    }
}
