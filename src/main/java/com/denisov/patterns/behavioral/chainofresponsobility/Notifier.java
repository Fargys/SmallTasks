package com.denisov.patterns.behavioral.chainofresponsobility;

public abstract class Notifier {
    private final int priority;
    private Notifier next;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public String notifyManager(String message, int level) {
        String result = "";

        if(level >= priority)
            result += write(message);

        if(next != null)
            result += " " + next.notifyManager(message, level);

        return result;
    }

    public abstract String write(String message);
}
