package com.company.car.classes.C.brands.models;

import com.company.car.classes.C.brands.C_Hyundai;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Hyundai_i30 extends C_Hyundai {
    public Hyundai_i30(String brand, String model, Engine engine, Transmission transmission, double VIN, String color, int yearOfProduction, int price, int numberOfSeats) {
        super(brand, model, engine, transmission, VIN, color, yearOfProduction, price, numberOfSeats);
    }
}
