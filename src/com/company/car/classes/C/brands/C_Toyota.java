package com.company.car.classes.C.brands;

import com.company.car.classes.C.C_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class C_Toyota extends C_Class {

    public C_Toyota(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super("Toyota", model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
