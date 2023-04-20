package com.denisov.patterns.behavioral.templatemethod;

public abstract class WebSiteTemplate {
    public String showPage() {
        return "Header, " + showPageContent() + ", Footer";
    }

    public abstract String showPageContent();
}
