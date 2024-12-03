package com.cloudbees.assessment.entity;

import java.util.HashMap;

public class TrainSection {

    private String name;
    private int capacity;
    private HashMap<Integer,User> seats = new HashMap<>();

    public TrainSection(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
