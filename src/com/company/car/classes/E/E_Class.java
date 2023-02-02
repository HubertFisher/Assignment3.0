package com.company.car.classes.E;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class E_Class extends Car {
    private String suspension = "Soft";
    private boolean GPSEnabled;
    private boolean sunRoofOpened;

    public E_Class(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction);
    }

    public void enableGPS() {
        GPSEnabled = true;
        System.out.println("GPS enabled.");
    }

    public void disableGPS() {
        GPSEnabled = false;
        System.out.println("GPS disabled.");
    }
    public void openSunRoof() {
        sunRoofOpened = true;
        System.out.println("Sunroof opened.");
    }

    public void closeSunRoof() {
        sunRoofOpened = false;
        System.out.println("Sunroof closed.");
    }

    public void setSuspension(String suspension){
        this.suspension=suspension;
    }
    public String getSuspension(){
        return suspension;
    }
    public boolean isGPSEnabled() {
        return GPSEnabled;
    }

    public void setGPSEnabled(boolean GPSEnabled) {
        this.GPSEnabled = GPSEnabled;
    }

    public boolean isSunRoofOpened() {
        return sunRoofOpened;
    }

    public void setSunRoofOpened(boolean sunRoofOpened) {
        this.sunRoofOpened = sunRoofOpened;
    }
}
