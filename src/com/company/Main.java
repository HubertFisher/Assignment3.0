package com.company;

import java.sql.*;
import com.company.controllers.CarController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;

import com.company.repositories.CarRepository;
import com.company.repositories.interfaces.ICarRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args){
        IDB db = new PostgresDB();
        ICarRepository repo = new CarRepository(db);
        CarController controller = new CarController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
