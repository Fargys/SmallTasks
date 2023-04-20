package com.denisov.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SampleTextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();;

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public String sendMessage(String message, User user) {
        StringBuilder result = new StringBuilder();
        for(User u : users) {
            if(u != user) {
                result.append(u.getMessage(message));
                result.append(" ");
            }
        }

        return result.append(admin.getMessage(message)).toString();
    }
}
