package com.denisov.patterns.behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    String notifyObservers();
}
