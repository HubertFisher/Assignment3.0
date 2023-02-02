package com.company.details.transmission;

public class Transmission {
    private int numberOfGears;
    private double speed;
    //constructors
    public Transmission() {
    }

    public Transmission(int numberOfGears, double speed) {
        this.numberOfGears = numberOfGears;
        this.speed = speed;
    }


    //setters
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
   //getters
    public int getNumberOfGears() {
        return numberOfGears;
    }
    public double getSpeed() {
        return speed;
    }
}

