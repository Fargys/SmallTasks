package com.denisov.patterns.behavioral.templatemethod;

public class WelcomePage extends WebSiteTemplate {
    @Override
    public String showPageContent() {
        return "Welcome";
    }
}
