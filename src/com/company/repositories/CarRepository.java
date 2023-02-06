package com.company.repositories;

import com.company.car.classes.E.brands.models.*;
import com.company.car.classes.S.brands.models.BMW_M2;
import com.company.car.classes.S.brands.models.BMW_Z4;
import com.company.car.classes.S.brands.models.BMW_iX;
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
    Car car;

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

                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("Z4")){
                    car = new BMW_Z4(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("M2")){
                    car = new BMW_M2(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("iX")){
                    car = new BMW_iX(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("520d")){
                    car = new BMW_520d(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("540i")){
                    car = new BMW_540i(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("BMW") && rs.getString("model").equals("M5")){
                    car = new BMW_M5(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Audi") && rs.getString("model").equals("RS6")){
                    car = new Audi_RS6(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Audi") && rs.getString("model").equals("S7")){
                    car = new Audi_S7(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Audi") && rs.getString("model").equals("e-tron GT")){
                    car = new Audi_e_tron_GT(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Mercedes-Benz") && rs.getString("model").equals("RS6")){
                    car = new Audi_RS6(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Audi") && rs.getString("model").equals("S7")){
                    car = new Audi_S7(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else
                if(rs.getString("brand").equals("Audi") && rs.getString("model").equals("e-tron GT")){
                    car = new Audi_e_tron_GT(engine,transmission, rs.getInt("VIN"),rs.getString("color"),rs.getInt("years"),rs.getInt("price"));
                } else

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
