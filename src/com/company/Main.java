package com.company;

import com.company.car.Car;
import com.company.car.classes.S.brands.models.BMW_M2;
import com.company.controllers.CarController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;
import com.company.repositories.CarRepository;
import com.company.repositories.interfaces.ICarRepository;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        IDB db = new PostgresDB();
        ICarRepository repo = new CarRepository(db);
        CarController controller = new CarController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
