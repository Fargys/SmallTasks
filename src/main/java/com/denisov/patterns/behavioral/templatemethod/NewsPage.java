package com.denisov.patterns.behavioral.templatemethod;

public class NewsPage extends WebSiteTemplate {
    @Override
    public String showPageContent() {
        return "News";
    }
}
