package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_Audi;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Audi_s7 extends E_Audi {

    public Audi_s7(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
