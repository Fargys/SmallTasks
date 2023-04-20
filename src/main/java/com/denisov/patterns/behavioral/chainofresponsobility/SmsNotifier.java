package com.denisov.patterns.behavioral.chainofresponsobility;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public String write(String message) {
        return "send sms" + message;
    }
}
