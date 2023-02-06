package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Lamborghini;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Lamborghini_Aventador extends S_Lamborghini {
    public Lamborghini_Aventador(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("Aventador LP 780-4", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
