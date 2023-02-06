package com.company.repositories;

import com.company.car.classes.C.brands.models.*;
import com.company.car.classes.E.brands.models.*;
import com.company.car.classes.S.brands.models.*;
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

                if(rs.getString("brand").equals("BMW")) {
                    if (rs.getString("model").equals("Z4")) {
                        car = new BMW_Z4(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("M2")) {
                        car = new BMW_M2(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("iX")) {
                        car = new BMW_iX(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("520d")) {
                        car = new BMW_520d(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("540i")) {
                        car = new BMW_540i(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("M5")) {
                        car = new BMW_M5(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Audi")) {
                    if (rs.getString("model").equals("S7")) {
                        car = new Audi_S7(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("RS6")) {
                        car = new Audi_RS6(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("iX")) {
                        car = new Audi_e_tron_GT(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Mercedes-Benz")) {
                    if (rs.getString("model").equals("E-class")) {
                        car = new MercedesBenz_E_Class(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("E-class All Terrain")) {
                        car = new Audi_RS6(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("iX")) {
                        car = new Audi_e_tron_GT(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Porsche")) {
                    if (rs.getString("model").equals("Cayman")) {
                        car = new Porsche_Cayman(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Taycan")) {
                        car = new Porsche_Taycan(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("911 Turbo-S")) {
                        car = new Porsche_911_Turbo_S(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Lamborghini")) {
                    if (rs.getString("model").equals("Huracan LP 580-2")) {
                        car = new Lamborghini_Huracan(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Urus")) {
                        car = new Lamborghini_Urus(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Aventador LP 780-4")) {
                        car = new Lamborghini_Aventador(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Hyundai")) {
                    if (rs.getString("model").equals("Accent")) {
                        car = new Hyundai_Accent(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("i30")) {
                        car = new Hyundai_i30(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Elantra")) {
                        car = new Hyundai_Elantra(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Toyota")) {
                    if (rs.getString("model").equals("Auris")) {
                        car = new Toyota_Auris(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Corolla")) {
                        car = new Toyota_Corolla(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Prius")) {
                        car = new Toyota_Prius(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                } else if(rs.getString("brand").equals("Volkswagen")) {
                    if (rs.getString("model").equals("Golf 7")) {
                        car = new Volkswagen_Golf_7(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("id.3")) {
                        car = new Volkswagen_ID3(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    } else if (rs.getString("model").equals("Polo")) {
                        car = new Volkswagen_Polo(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                    }
                }

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
                    if (rs.getString("engine_type").equals("ICE")) {
                        engine = new ICE(rs.getDouble("torque"), rs.getDouble("volume"), rs.getInt("power"), rs.getString("fuel"));
                    } else if (rs.getString("engine_type").equals("Electro")) {
                        engine = new Electro(rs.getDouble("torque"), rs.getInt("power"));
                    }

                    if (rs.getString("transmission").equals("Auto")) {
                        transmission = new Auto(rs.getInt("gears"));
                    } else if (rs.getString("transmission").equals("Manual")) {
                        transmission = new Manual(rs.getInt("gears"));
                    }

                    if (rs.getString("brand").equals("BMW")) {
                        if (rs.getString("model").equals("Z4")) {
                            car = new BMW_Z4(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("M2")) {
                            car = new BMW_M2(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("iX")) {
                            car = new BMW_iX(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("520d")) {
                            car = new BMW_520d(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("540i")) {
                            car = new BMW_540i(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("M5")) {
                            car = new BMW_M5(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Audi")) {
                        if (rs.getString("model").equals("S7")) {
                            car = new Audi_S7(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("RS6")) {
                            car = new Audi_RS6(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("iX")) {
                            car = new Audi_e_tron_GT(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Mercedes-Benz")) {
                        if (rs.getString("model").equals("E-class")) {
                            car = new MercedesBenz_E_Class(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("E-class All Terrain")) {
                            car = new Audi_RS6(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("iX")) {
                            car = new Audi_e_tron_GT(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Porsche")) {
                        if (rs.getString("model").equals("Cayman")) {
                            car = new Porsche_Cayman(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Taycan")) {
                            car = new Porsche_Taycan(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("911 Turbo-S")) {
                            car = new Porsche_911_Turbo_S(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Lamborghini")) {
                        if (rs.getString("model").equals("Huracan LP 580-2")) {
                            car = new Lamborghini_Huracan(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Urus")) {
                            car = new Lamborghini_Urus(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Aventador LP 780-4")) {
                            car = new Lamborghini_Aventador(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Hyundai")) {
                        if (rs.getString("model").equals("Accent")) {
                            car = new Hyundai_Accent(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("i30")) {
                            car = new Hyundai_i30(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Elantra")) {
                            car = new Hyundai_Elantra(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Toyota")) {
                        if (rs.getString("model").equals("Auris")) {
                            car = new Toyota_Auris(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Corolla")) {
                            car = new Toyota_Corolla(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Prius")) {
                            car = new Toyota_Prius(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    } else if (rs.getString("brand").equals("Volkswagen")) {
                        if (rs.getString("model").equals("Golf 7")) {
                            car = new Volkswagen_Golf_7(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("id.3")) {
                            car = new Volkswagen_ID3(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        } else if (rs.getString("model").equals("Polo")) {
                            car = new Volkswagen_Polo(engine, transmission, rs.getInt("VIN"), rs.getString("color"), rs.getInt("years"), rs.getInt("price"));
                        }
                    }

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
