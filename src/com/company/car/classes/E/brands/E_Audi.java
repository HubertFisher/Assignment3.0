package com.company.car.classes.E.brands;

import com.company.car.classes.E.E_Class;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class E_Audi extends E_Class {

    public E_Audi(int id, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
            super(id,"Audi", model, engine, transmission, VIN, color, yearOfProduction, price);
    }
}
