package com.company.car;

import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Car {

    private double price;
    private int numberOfSeats;
    private String name;
    private double VIN;
    private String color;
    private int yearOfProduction;
    private String brand;
    private String model;

    private final Engine engine;
    private final Transmission transmission;

    public Car(String brand,String model,Engine engine,Transmission transmission, double VIN, String color,int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.VIN =VIN;
        this.yearOfProduction =yearOfProduction;

    }


    //setters
        public void setVIN(double VIN) {
            this.VIN = VIN;
        }

        public void setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
        }
        public void setColor(String color) {
        this.color = color;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;

    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    //getters

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getVIN() {

        return VIN;
    }

        public String getColor() {
        return color;
    }

    public int getYearOfProduction() {

        return yearOfProduction;
    }

        public Engine getEngine() {
        return engine;
    }
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
