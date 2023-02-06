package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.car.Car;
import com.company.details.engine.Engine;
import com.company.details.engine.types.Electro;
import com.company.details.engine.types.ICE;
import com.company.details.transmission.Transmission;
import com.company.details.transmission.types.Auto;
import com.company.details.transmission.types.Manual;
import com.company.repositories.interfaces.ICarRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final IDB db;
    Engine engine;
    Transmission transmission;

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
                    engine = new ICE(rs.getDouble("torque"),rs.getDouble("volume"),rs.getInt("power"),rs.getString("fuel"));
                } else if(rs.getString("engine_type").equals("Electro")) {
                    engine = new Electro(rs.getDouble("torque"),rs.getInt("power"));
                }

                if(rs.getString("transmission").equals("Auto")) {
                    transmission = new Auto(rs.getInt("gears"));
                } else if(rs.getString("transmission").equals("Manual")) {
                    transmission = new Manual(rs.getInt("gears"));
                }

                return new Car(rs.getString("brand"),rs.getString("model"),engine,transmission,
                        rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
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
                if(rs.getString("engine_type").equals("ICE")) {
                    engine = new ICE(rs.getDouble("torque"),rs.getDouble("volume"),rs.getInt("power"),rs.getString("fuel"));
                } else if(rs.getString("engine_type").equals("Electro")) {
                    engine = new Electro(rs.getDouble("torque"),rs.getInt("power"));
                }

                if(rs.getString("transmission").equals("Auto")) {
                    transmission = new Auto(rs.getInt("gears"));
                } else if(rs.getString("transmission").equals("Manual")) {
                    transmission = new Manual(rs.getInt("gears"));
                }

                Car car = new Car(rs.getString("brand"),rs.getString("model"),engine,transmission,
                        rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
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
