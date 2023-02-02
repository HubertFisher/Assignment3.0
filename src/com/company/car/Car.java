package com.company.car;

import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Car {

    protected double price;
    protected final int numberOfSeats;
    protected double VIN;
    protected String color;
    protected final int yearOfProduction;
    protected final String brand;
    protected final String model;
    protected final Engine engine;
    protected final Transmission transmission;

    public Car(String brand,String model,Engine engine,Transmission transmission, double VIN, String color,int yearOfProduction,int price, int numberOfSeats) {
        setVIN(VIN);
        setColor(color);
        setPrice(price);
        this.brand=brand;
        this.model=model;
        this.engine=engine;
        this.transmission=transmission;
        this.yearOfProduction=yearOfProduction;
        this.numberOfSeats=numberOfSeats;

    }


    //setters

    public void setVIN(double VIN) {
            this.VIN = VIN;
        }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //getters

    public Transmission getTransmission() {return transmission;}
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
    public double getVIN() {return  VIN;}
    public String getColor() {return color;}
    public int getYearOfProduction() {return yearOfProduction;}
    public Engine getEngine() {return engine;}
    public void startEngine() {System.out.println("Engine started.");}
    public void stopEngine() {System.out.println("Engine stopped.");}
}
