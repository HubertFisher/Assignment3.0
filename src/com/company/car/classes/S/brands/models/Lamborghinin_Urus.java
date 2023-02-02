package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Lamborghini;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghinin_Urus extends S_Lamborghini {
    public Lamborghinin_Urus(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("Lamborghini", "URUS", engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
