package com.cloudbees.assessment.entity;

public class Ticket {

    private Train train;
    private TrainUser user;

    public Ticket(Train train, TrainUser user) {
        this.train = train;
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public TrainUser getUser() {
        return user;
    }

    public void setUser(TrainUser user) {
        this.user = user;
    }
}
