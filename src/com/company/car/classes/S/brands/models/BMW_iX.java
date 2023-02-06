package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_iX extends S_BMW {
    public BMW_iX(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {

        super("BMW", "iX", engine, transmission, VIN, color, yearOfProduction, price);

    }
}
