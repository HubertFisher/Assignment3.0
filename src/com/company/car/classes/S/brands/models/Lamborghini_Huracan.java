package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Lamborghini;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghini_Huracan extends S_Lamborghini {
    public Lamborghini_Huracan(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("Lamborghini", "HARUCAN LP 580-2 ", engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
