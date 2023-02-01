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

    private final Engine engine;
    private final Transmission transmission;

    public Car(String name,Engine engine,Transmission transmission, double VIN, String color,int yearOfProduction, double price, int numberOfSeats) {
        setName(name);
        setVIN(VIN);
        setColor(color);
        setYearOfProduction(yearOfProduction);
        setPrice(price);
        setNumberOfSeats(numberOfSeats);
        this.engine=engine;
        this.transmission=transmission;
    }


    //setters

    public void setVIN(double VIN) {
            this.VIN = VIN;
        }
    public void setYearOfProduction(int yearOfProduction) {this.yearOfProduction = yearOfProduction;}
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {this.name = name;}
    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

    //getters

    public String getName() {return name;}
    public Transmission getTransmission() {return transmission;}
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getPrice() {
        return price;
    }

    public double getVIN() {return VIN;}

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {return yearOfProduction;}

    public Engine getEngine() {
        return engine;
    }
}
