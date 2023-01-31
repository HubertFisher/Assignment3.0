package com.company.car;

import com.company.details.Engine;

public class Car {
    private  double VIN;
    public String color;
    private  String originalColor;
    private int yearOfProduction;
    private final Engine engine;

        public Car(Engine engine, double VIN, String color, String originalColor, int yearOfProduction) {
            setVIN(VIN);
            setOriginalColor(originalColor);
            setYearOfProduction(yearOfProduction);
            setColor(color);
            this.engine=engine;

        }
    //setters
        public void setVIN(double VIN) {
            this.VIN = VIN;
        }
        public void setOriginalColor(String originalColor) {
            this.originalColor = originalColor;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }
        public void setColor(String color) {
        this.color = color;
    }
    //getters
        public  double getVIN() {
        return VIN;
    }

        public String getColor() {
        return color;
    }

        public  String getOriginalColor() {
        return originalColor;
    }

        public int getYearOfProduction() {
        return yearOfProduction;
    }

        public Engine getEngine() {
        return engine;
    }
}
