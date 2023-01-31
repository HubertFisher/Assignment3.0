package com.company.car;

import com.company.details.Engine;

public class Car {
private static double VIN;
public String color;
private static String originalColor;
private static int yearOfProduction;

private final Engine engine;

    public Car(Engine engine, double VIN, String color, String originalColor, int yearOfProduction) {
        this.color = color;
        this.engine = engine;
        Car.VIN =VIN;
        Car.originalColor = originalColor;
        Car.yearOfProduction =yearOfProduction;

    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }
//getters
    public static double getVIN() {
        return VIN;
    }

    public String getColor() {
        return color;
    }

    public static String getOriginalColor() {
        return originalColor;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Engine getEngine() {
        return engine;
    }
}
