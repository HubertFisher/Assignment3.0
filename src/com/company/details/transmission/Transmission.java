package com.company.details.transmission;

public class Transmission {
    private int numberOfGears;
    private double speed;

    public Transmission() {
    }

    public Transmission(int numberOfGears, double speed) {
        this.numberOfGears = numberOfGears;
        this.speed = speed;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

