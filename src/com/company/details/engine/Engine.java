package com.company.details.engine;
public class Engine {
    private String name;
    private double VIN;
    private double torque;
    private int dateOfProduction;
    private String manufacturer;
    public Engine(String name, double torque, int dateOfProduction, String manufacturer) {
        setTorque(torque);
        this.dateOfProduction = dateOfProduction;
        this.manufacturer = manufacturer;
        this.name = name;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }
    //getters


    public String getName() {
        return name;
    }

    public double getVIN() {
        return VIN;
    }

    public double getTorque() {
        return torque;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
