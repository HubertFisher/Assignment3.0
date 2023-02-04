package com.company.repositories.interfaces;

import com.company.car.Car;

import java.util.List;

public interface ICarRepository {
    boolean createUser(Car car);
    Car getCar(int id);
    List<Car> getAllCars();
}
