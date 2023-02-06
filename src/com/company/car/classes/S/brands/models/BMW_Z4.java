package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_Z4 extends S_BMW {
    public BMW_Z4(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("BMW", "Z4", engine, transmission, VIN, color, yearOfProduction, price, 2);
    }
}
