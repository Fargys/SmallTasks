package com.denisov.patterns.behavioral.chainofresponsobility;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public String write(String message) {
        return "simple report" + message;
    }
}
