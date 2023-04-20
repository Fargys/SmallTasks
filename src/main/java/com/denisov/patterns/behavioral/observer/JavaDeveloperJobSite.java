package com.denisov.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private final List<String> vacancies = new ArrayList<>();
    private final List<Observer> subscribers = new ArrayList<>();

    public String addVacancy(String vacancy) {
        vacancies.add(vacancy);
        return notifyObservers().trim();
    }

    public String removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        return notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public String notifyObservers() {
        StringBuilder result = new StringBuilder();

        for(Observer observer: subscribers) {
            result.append(observer.handleEvent(this.vacancies));

        }

        return result.toString();
    }
}
