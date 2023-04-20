package com.denisov.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public String handleEvent(List<String> vacancies) {
        StringBuilder result = new StringBuilder();

        for(String str: vacancies)
            result.append(str).append(" ");

        return result.toString();
    }
}
