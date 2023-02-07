package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_BMW;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class BMW_M2 extends S_BMW {

    public BMW_M2(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"M2", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
