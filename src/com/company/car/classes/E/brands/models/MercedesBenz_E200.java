package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_MercedesBenz;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class MercedesBenz_E200 extends E_MercedesBenz {
    public MercedesBenz_E200(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}