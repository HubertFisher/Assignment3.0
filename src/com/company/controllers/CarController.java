package com.company.controllers;


import com.company.car.Car;
import com.company.repositories.interfaces.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    private final ICarRepository repo;

    public CarController(ICarRepository repo) {
        this.repo = repo;
    }

    public Car getCar(int id) {
        Car car = repo.getCar(id);
        return (car);
    }
    public void getAllCars() {
        List<Car> cars = repo.getAllCars();
        if (cars==null){
            System.out.println("Cars were not found!");
        }else {
            for(Car car:cars){
                System.out.println(car.toString());
            }
        }
    }
    public void getCarByPrice(int start, int end) {
        List<Car> cars = repo.getCarByPrice(start,end);

        if (cars==null){
            System.out.println("Cars were not found!");
        }else {
            for(Car car:cars){
                System.out.println(car.toString());
            }
        }
    }

    public void getCarByYear(int start, int end) {
        List<Car> cars = repo.getCarByYear(start,end);
        if (cars==null){
            System.out.println("Cars were not found!");
        }else {
            for(Car car:cars){
                System.out.println(car.toString());
            }
        }
    }
    public void getCarByBrand(int brand) {

        List<Car> cars = repo.getCarByBrand(brand);
        if (cars==null){
            System.out.println("Cars were not found!");
        }else {
            for(Car car:cars){
                System.out.println(car.toString());
            }
        }
    }
    public void getCarByModel(int brand, int[] models) {
        int counter=0;
        for (int model: models) {
            if (model!=0)
                counter++;
        }
         List<Car> cars=null;
        switch (counter){
            case 1:
                cars=repo.getCarByModel(brand,models[0]);
                break;
            case 2:
                cars = repo.getCarByModel(brand, models[0]);
                cars.addAll(repo.getCarByModel(brand,models[1]));
                break;
            case 3:
                cars = repo.getCarByModel(brand, models[0]);
                cars.addAll(repo.getCarByModel(brand,models[1]));
                cars.addAll(repo.getCarByModel(brand,models[2]));
                break;

        }

        if (cars==null){
            System.out.println("Cars were not found!");
        }else {
            for(Car car:cars){
            System.out.println(car.toString());
            }
        }
    }
}
