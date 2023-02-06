package com.company.car.classes.C.brands.models;

import com.company.car.classes.C.brands.C_Toyota;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Toyota_Prius extends C_Toyota {
    public Toyota_Prius(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("Prius", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
