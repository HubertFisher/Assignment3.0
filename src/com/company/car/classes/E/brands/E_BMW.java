package com.company.car.classes.E.brands;

import com.company.car.classes.E.E_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class E_BMW extends E_Class {

    public E_BMW(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("BMW", model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
