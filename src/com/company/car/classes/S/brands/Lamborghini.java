package com.company.car.classes.S.brands;

import com.company.car.classes.S.S_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghini extends S_Class {

    public Lamborghini(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("Lamborghini", model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}