package com.company.car.classes.S.brands;

import com.company.car.classes.S.S_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW extends S_Class {
    public BMW(String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super("BMW", model, engine, transmission, VIN, color, yearOfProduction);
    }
}
