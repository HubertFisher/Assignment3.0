package com.company.details.engine.types;

import com.company.details.engine.Engine;

public class Electro extends Engine {
    //batteryLifeTime is the var which shows the distance car can ride with full battery
    private final String type = "Electro";
    private int power;


    public Electro(double torque,String manufacturer, int power) {
        super(torque,manufacturer);

        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }


}
