package com.company.car.classes.S;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class S_class extends Car {
    protected String suspension = "Sport";
    protected boolean turboEnabled = false;
    protected boolean isDriftModeActivated = false;

    public S_class(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction,price,numberOfSeats);
    }

    public void setTurboEnabled(boolean turboEnabled) {
        this.turboEnabled = turboEnabled;
    }

    public void setDriftModeActivated(boolean driftModeActivated) {
        isDriftModeActivated = driftModeActivated;
    }

    public String getSuspension() {
        return suspension;
    }

    public boolean isTurboEnabled() {
        return turboEnabled;
    }

    public boolean driftModeActivated() {
        return isDriftModeActivated;
    }
}
