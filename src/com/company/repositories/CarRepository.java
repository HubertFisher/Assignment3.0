package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.transmission.Transmission;
import com.company.repositories.interfaces.ICarRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final IDB db;

    public CarRepository(IDB db) {
        this.db = db;
    }

    @Override
    public Car getCar(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,brand,model,engine_type,fuel,torque,volume,power,transmission,gears,years,price,class,VIN,color  FROM cars WHERE id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                if(rs.getString("engine_type").equals("ICE")) {
                    Engine engine = new Engine(rs.getDouble("torque"),
                            rs.getDouble("volume"),
                            rs.getInt("power"),
                            rs.getString("fuel"));
                }
                Transmission transmission = new Transmission()

                Car car = new Car();

                return car;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,name,surname,gender FROM users";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Car> cars = new LinkedList<>();
            while (rs.next()) {
                Car car = new Car()

                cars.add(car);
            }

            return cars;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
