package com.denisov.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    String handleEvent(List<String> vacancies);
}
