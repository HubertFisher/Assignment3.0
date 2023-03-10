package com.company.car;

import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;

public class Car {
    protected int id;
    protected double price;
    protected double VIN;
    protected String color;
    protected final int yearOfProduction;
    protected final String brand;
    protected final String model;
    protected final Engine engine;
    protected final Transmission transmission;

    public Car(int id,String brand,String model,Engine engine,Transmission transmission, double VIN, String color,int yearOfProduction,int price) {
        setVIN(VIN);
        setColor(color);
        setPrice(price);
        this.id = id;
        this.brand=brand;
        this.model=model;
        this.engine=engine;
        this.transmission=transmission;
        this.yearOfProduction=yearOfProduction;
    }


    //setters

    private void setVIN(double VIN) {
            this.VIN = VIN;
        }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //getters
    public int getId() {
        return id;
    }
    public Transmission getTransmission() {return transmission;}
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
    public void startEngine() {System.out.println("Engine started. Car");}
    public void stopEngine() {System.out.println("Engine stopped.");}

    @Override
    public String toString() {
        return brand + " " + model + "\n" + "ID: " + id + "\n" + "Price: " + price + "\n" + "VIN: " + (int)VIN + "\n" + "Color: " + color + "\n" + "Year of Production: " +yearOfProduction + "\n"
                + "Engine: " + engine + "\n" + "Transmission: "+ transmission+"\n";
    }
}
