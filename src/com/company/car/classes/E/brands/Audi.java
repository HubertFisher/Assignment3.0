package com.company.car.classes.E.brands;

import com.company.car.classes.E.E_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Audi extends E_Class {

    public Audi(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
            super("Audi", model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
