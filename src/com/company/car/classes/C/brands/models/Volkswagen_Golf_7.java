package com.company.car.classes.C.brands.models;

import com.company.car.classes.C.brands.C_Volkswagen;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Volkswagen_Golf_7 extends C_Volkswagen {
    public Volkswagen_Golf_7(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
