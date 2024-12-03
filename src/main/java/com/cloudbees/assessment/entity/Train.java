package com.cloudbees.assessment.entity;

import java.util.HashMap;

public class Train {
    private Location origin;
    private Location destination;
    private int price;
    private HashMap<Character, TrainSection> sections;

    public Train(Location origin, Location destination, int price, HashMap<Character, TrainSection> sections) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.sections = sections;
    }
}
