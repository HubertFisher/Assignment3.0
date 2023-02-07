package com.company.car.classes.E.brands.models;

import com.company.car.classes.E.brands.E_Audi;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Audi_e_tron_GT extends E_Audi {

    public Audi_e_tron_GT(int id, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price) {
        super(id,"e-tron GT", engine, transmission, VIN, color, yearOfProduction, price);
    }
}
