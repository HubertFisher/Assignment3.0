package com.company.car.classes.C.brands;

import com.company.car.classes.C.C_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Volkswagen extends C_Class {
    public Volkswagen(String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super("Volkswagen", model, engine, transmission, VIN, color, yearOfProduction);
    }
}
