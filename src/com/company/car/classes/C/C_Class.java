package com.company.car.classes.C;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class C_Class extends Car {
    private String suspension = "Hard";

    public C_Class(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction);
    }

    public String getSuspension() {
        return suspension;
    }
}
