package com.company.details.transmission.types;

import com.company.details.transmission.Transmission;

public class Manual extends Transmission {

    private int gear;
    private boolean clutchEngaged;
    private boolean isDriving;

    public Manual() {
        this.gear = 1;
        this.clutchEngaged = false;
        this.isDriving = false;
    }

    public Manual(int numberOfGears, double speed) {
        super(numberOfGears, speed);
        this.gear = 1;
        this.clutchEngaged = false;
        this.isDriving = false;
    }

    public void shiftUp() {
        if (clutchEngaged == false && gear < 5) {
            gear++;
        }
    }

    public void shiftDown() {
        if (clutchEngaged == false && gear > 1) {
            gear--;
        }
    }

    public void engageClutch() {
        clutchEngaged = true;
    }

    public void releaseClutch() {
        clutchEngaged = false;
    }

    public void startDriving() {
        isDriving = true;
    }

    public void stopDriving() {
        isDriving = false;
    }

    public int getGear() {
        return gear;
    }

    public boolean isClutchEngaged() {
        return clutchEngaged;
    }

    public boolean isDriving() {
        return isDriving;
    }
}
