package com.company.car.segment.econom;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class EconomSUV extends Car {
    private final String suspension = "Hard";
    private final boolean haveNoiseSupression = false;
    private final boolean haveAirConditioning = true;
    private final boolean haveHeatedSeats = false;
    public EconomSUV(String name, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super(name, engine, transmission, VIN, color, yearOfProduction);
    }

    public String getSuspension() {
        return suspension;
    }

    public boolean isHaveNoiseSupression() {
        return haveNoiseSupression;
    }

    public boolean isHaveAirConditioning() {
        return haveAirConditioning;
    }

    public boolean isHaveHeatedSeats() {
        return haveHeatedSeats;
    }
}
