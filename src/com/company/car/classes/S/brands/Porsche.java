package com.company.car.classes.S.brands;

import com.company.car.classes.S.S_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Porsche extends S_Class {
    public Porsche(String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super("Porsche", model, engine, transmission, VIN, color, yearOfProduction);
    }
}
