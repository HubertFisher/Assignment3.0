package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_M5 extends E_BMW {
    public BMW_M5(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("M5", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
