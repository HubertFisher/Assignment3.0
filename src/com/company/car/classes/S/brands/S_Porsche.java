package com.company.car.classes.S.brands;

import com.company.car.classes.S.S_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class S_Porsche extends S_Class {
    public S_Porsche(int id, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"Porsche", model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
