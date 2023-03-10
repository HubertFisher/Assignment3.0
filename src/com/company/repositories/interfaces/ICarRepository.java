package com.company.repositories.interfaces;

import com.company.car.Car;

import java.util.List;

public interface ICarRepository {
    Car getCar(int id);
    List<Car> getAllCars();
    List<Car> getCarByPrice(int start, int end);
    List<Car> getCarByYear(int start, int end);
    List<Car> getCarByBrand(int brand);
    List<Car> getCarByModel(int brand, int model);

}
