package com.cloudbees.assessment.entity;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String email;

    public User(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
}
