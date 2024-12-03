package com.cloudbees.assessment.entity;

import java.util.HashMap;
import java.util.List;

public class Train {
    private Location origin;
    private Location destination;
    private int price;
    private HashMap<Character, List<TrainUser>> sections;
    private final static int capacity = 50;

    public Train(Location origin, Location destination, int price, HashMap<Character, List<TrainUser>> sections) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.sections = sections;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
