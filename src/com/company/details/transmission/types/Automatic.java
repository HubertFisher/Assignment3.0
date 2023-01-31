package com.company.details.transmission.types;

import com.company.details.transmission.Transmission;

public class Automatic extends Transmission {
    private String gear;
    private int manualGears;
    private boolean isDriving;

    public Automatic() {
    this.gear = "Parking";
    this.isDriving = false;
    this.manualGears = 1;
    }

    public Automatic(int numberOfGears, double speed) {
        super(numberOfGears, speed);
    }

    public void shiftUp() {
        if (gear.equals("Manual") && manualGears < 5) {
            manualGears++;
        }
    }

    public void shiftDown() {
        if (gear.equals("Manual") && manualGears > 1) {
            manualGears--;
        }
    }

    public void startDriving() {
        isDriving = true;
    }

    public void stopDriving() {
        isDriving = false;
    }

    public String getGear() {
        return gear;
    }

    public int getManualGears() {
        return manualGears;
    }

    public boolean isDriving() {
        return isDriving;
    }
}
