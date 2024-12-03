package com.cloudbees.assessment.entity;

import java.util.HashMap;

public class TrainSection {

    private int capacity;
    private HashMap<Integer,User> seats = new HashMap<>();

    public TrainSection(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<Integer, User> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<Integer, User> seats) {
        this.seats = seats;
    }
}
