package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_MercedesBenz;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class MercedesBenz_CLA extends E_MercedesBenz {
    public MercedesBenz_CLA(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"CLA", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
