package com.company.details.engine.types;

import com.company.details.engine.Engine;

public class Electro extends Engine {
    //batteryLifeTime is the var which shows the distance car can ride with full battery
    private final String type = "Electro";
    private int batteryLifeTime;
    private double voltage;

    public Electro(String name, double torque, int dateOfProduction, String manufacturer) {
        super(name, torque, dateOfProduction, manufacturer);
    }

    public Electro(String name, double torque, int dateOfProduction, String manufacturer, int batteryLifeTime, double voltage) {
        super(name, torque, dateOfProduction, manufacturer);
        this.batteryLifeTime = batteryLifeTime;
        this.voltage = voltage;
    }

    public String getType() {
        return type;
    }

    public int getBatteryLifeTime() {
        return batteryLifeTime;
    }

    public void setBatteryLifeTime(int batteryLifeTime) {
        this.batteryLifeTime = batteryLifeTime;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}
