package com.company.details.engine.types;

import com.company.details.engine.Engine;

public class ICE extends Engine {
    //capacity is the var which shows the distance car can ride with full fuel tank
    private final String type = "ICE";
    private int capacity;
    private double cylinderVolume;
    private int horsepower;
    private String typeOfFuel;

    public ICE(String name, double torque, int dateOfProduction, String manufacturer) {
        super(name, torque, dateOfProduction, manufacturer);
    }

    public ICE(String name, double torque, int dateOfProduction, String manufacturer, int capacity, double cylinderVolume, int horsepower, String typeOfFuel) {
        super(name, torque, dateOfProduction, manufacturer);
        this.capacity = capacity;
        this.cylinderVolume = cylinderVolume;
        this.horsepower = horsepower;
        this.typeOfFuel = typeOfFuel;
    }
    public String getType() {
        return type;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(double cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }


}
