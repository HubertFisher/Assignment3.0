package com.company.controllers;


import com.company.car.Car;
import com.company.repositories.interfaces.ICarRepository;

import java.util.List;

public class CarController {
    private final ICarRepository repo;

    public CarController(ICarRepository repo) {
        this.repo = repo;
    }

    public String getCar(int id) {
        Car car = repo.getCar(id);

        return (car == null ? "Car was not found!" : car.toString());
    }
    public String getAllCars() {
        List<Car> cars = repo.getAllCars();

        return cars.toString();
    }
    public String getCarByPrice(int start, int end) {
        List<Car> cars = repo.getCarByPrice(start,end);

        return (cars == null ? "Cars was not found!" : cars.toString());
    }

    public String getCarByYear(int start, int end) {
        List<Car> cars = repo.getCarByYear(start,end);

        return (cars == null ? "Cars was not found!" : cars.toString());
    }
}
