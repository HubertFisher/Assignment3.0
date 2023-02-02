package com.company.car.classes.E.brands;

import com.company.car.classes.E.E_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class MercedesBenz extends E_Class {

    public MercedesBenz(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("MercedesBenz", model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
