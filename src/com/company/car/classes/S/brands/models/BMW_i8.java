package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_i8 extends S_BMW {
    public BMW_i8(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("BMW", "BMW i8", engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
