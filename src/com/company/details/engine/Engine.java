package com.company.details.engine;
public class Engine {
    private double torque;//крутящий момент
    private String manufacturer;
    public Engine(double torque,String manufacturer) {
        this.torque = torque;
        this.manufacturer = manufacturer;
    }

    public double getTorque() {
        return torque;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                ", torque=" + torque +
                ", manufacturer='" + manufacturer +
                '}';
    }
}
