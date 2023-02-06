package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_540i extends E_BMW {
    public BMW_540i(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("540i", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
