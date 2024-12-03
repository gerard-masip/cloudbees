package com.cloudbees.assessment.entity;

public class Ticket {

    private Train train;
    private User user;

    public Ticket(Train train, User user) {
        this.train = train;
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
