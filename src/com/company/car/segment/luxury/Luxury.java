package com.company.car.segment.luxury;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Luxury extends Car
{
    private final String suspension = "Soft";
    private final boolean haveNoiseSupression = true;
    private final boolean haveAirConditioning = true;
    private final boolean haveHeatedSeats = true;

    public Luxury(String name, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
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
