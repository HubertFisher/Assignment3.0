package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Lamborghini;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghini_Huracan extends S_Lamborghini {
    public Lamborghini_Huracan(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("Lamborghini", "Huracan LP 580-2", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
