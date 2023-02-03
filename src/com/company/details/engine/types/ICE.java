package com.company.details.engine.types;

import com.company.details.engine.Engine;

public class ICE extends Engine {
    //capacity is the var which shows  the distance car can ride with full fuel tank
    private final String type = "ICE";
    private double engineVolume;
    private int horsepower;
    private String typeOfFuel;

    public ICE(double torque, String manufacturer, double engineVolume, int horsepower, String typeOfFuel) {
        super(torque, manufacturer);
        this.engineVolume = engineVolume;
        this.horsepower = horsepower;
        this.typeOfFuel = typeOfFuel;
    }
    public String getType() {
        return type;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public int getHorsepower() {
        return horsepower;
    }


    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }


}
