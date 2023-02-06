package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_MercedesBenz;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class MercedesBenz_E_Class_All_Terrain extends E_MercedesBenz {
    public MercedesBenz_E_Class_All_Terrain(Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super("E-class All Terrain", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
