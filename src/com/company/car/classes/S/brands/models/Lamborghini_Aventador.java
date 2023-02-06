package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Lamborghini;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghini_Aventador extends S_Lamborghini {

    public Lamborghini_Aventador(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
