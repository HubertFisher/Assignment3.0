package com.company.details.transmission.types;

import com.company.details.transmission.Transmission;

public class Automatic extends Transmission {

    private String gear;
    private int manualGears;
    private boolean isDriving;
    private final String type = "Automatic";

    public Automatic() {
    this.gear = "Parking";
    this.isDriving = false;
    this.manualGears = 1;
    }

    public Automatic(int numberOfGears) {
        super(numberOfGears);
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

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void startDriving() {
        isDriving = true;
    }

    public void stopDriving() {
        isDriving = false;
    }
    public String getType() {
        return type;
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
