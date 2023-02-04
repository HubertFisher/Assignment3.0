package com.company.car.classes.C;

import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class C_Class extends Car {
    protected final String suspension = "Hard";

    public C_Class(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction,price);
    }

    public String getSuspension() {
        return suspension;
    }
}
