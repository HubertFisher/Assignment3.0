package com.company.car.classes.C.brands.models;

import com.company.car.classes.C.brands.C_Toyota;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Toyota_Auris extends C_Toyota {

    public Toyota_Auris(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
