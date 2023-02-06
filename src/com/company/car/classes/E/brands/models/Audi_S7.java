package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_Audi;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Audi_S7 extends E_Audi {
    public Audi_S7(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("S7", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
