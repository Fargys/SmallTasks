package com.denisov.patterns.behavioral;

import com.denisov.patterns.behavioral.templatemethod.NewsPage;
import com.denisov.patterns.behavioral.templatemethod.WebSiteTemplate;
import com.denisov.patterns.behavioral.templatemethod.WelcomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateMethodTest {

    public static final String WELCOME_PAGE = "Header, Welcome, Footer";
    public static final String NEWS_PAGE    = "Header, News, Footer";

    @Test
    void test() {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        assertEquals(WELCOME_PAGE, welcomePage.showPage());
        assertEquals(NEWS_PAGE, newsPage.showPage());
    }
}
