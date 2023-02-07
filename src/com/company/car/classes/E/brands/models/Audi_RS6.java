package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_Audi;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Audi_RS6 extends E_Audi {
    public Audi_RS6(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"RS6", engine, transmission, VIN, color, yearOfProduction, price);
    }
}

