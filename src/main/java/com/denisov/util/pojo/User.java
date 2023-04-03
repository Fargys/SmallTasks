package com.denisov.util.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private User[] subUsers;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}