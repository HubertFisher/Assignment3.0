package com.company.car.classes.S.brands;

import com.company.car.classes.S.S_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class S_Lamborghini extends S_Class {

    public S_Lamborghini(String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("Lamborghini", model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}