package com.denisov.patterns.behavioral.chainofresponsobility;

public class EmailReportNotifier extends Notifier {
    public EmailReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public String write(String message) {
        return "sending email" + message;
    }
}
