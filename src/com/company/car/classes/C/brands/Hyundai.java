package com.company.car.classes.C.brands;

import com.company.car.classes.C.C_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Hyundai extends C_Class {
    public Hyundai(String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction) {
        super("Hyundai", model, engine, transmission, VIN, color, yearOfProduction);
    }
}
