package com.company.car.classes.C.brands.models;

import com.company.car.classes.C.brands.C_Volkswagen;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Volkswagen_ID3 extends C_Volkswagen {
    public Volkswagen_ID3(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"id.3", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
