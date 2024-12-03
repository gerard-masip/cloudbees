package com.cloudbees.assessment.entity;

public class Train {
    private City origin;
    private City destination;
    private int price;

    public Train(City origin, City destination, int price) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }
}
