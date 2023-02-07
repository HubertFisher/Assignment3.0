package com.company.car.classes.S.brands.models;

import com.company.car.classes.S.brands.S_Porsche;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Porsche_Taycan extends S_Porsche {
    public Porsche_Taycan(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"Taycan", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
