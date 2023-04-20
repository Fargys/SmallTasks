package com.denisov.patterns.behavioral.mediator;

public class SampleUser implements User {
    private final Chat chat;
    private String name;

    public SampleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sendMessage(String message) {
        return chat.sendMessage(message, this);
    }

    @Override
    public String getMessage(String message) {
        return "sample user got message";
    }
}
