package com.company;

import com.company.car.Car;
import com.company.controllers.CarController;

import java.util.*;

public class MyApplication {
    private final CarController controller;
    private final Scanner scanner;
    private List<Car> cars = new LinkedList<>();

    public java.util.List<Car> getCars() {
        return cars;
    }

    public MyApplication(CarController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Select option:");
            System.out.println("1. Get all cars");
            System.out.println("2. Get car by id");
            System.out.println("3. Get car by price");
            System.out.println("4. Get car by year of production");
            System.out.println("5. Get car by brand");
            System.out.println("6. Get car by model");
            System.out.println("7. Get cart");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-7): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllCarsMenu();
                } else if (option == 2) {
                    getCarByIdMenu();
                } else if (option == 3) {
                    getCarByPriceMenu();
                } else if (option == 4) {
                    getCarByYearMenu();
                } else if (option == 5) {
                    getCarByBrandMenu();
                } else if (option == 6) {
                    getCarByModelMenu();
                } else if (option == 7) {
                    cartMenu();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*************************");

        }
    }

    public void getAllCarsMenu() {
        controller.getAllCars();
    }

    public void getCarByIdMenu() {
        System.out.println("Please enter id");
        int id = scanner.nextInt();
        Car car = controller.getCar(id);
        System.out.println(car.toString());
        System.out.println("To add this car to cart press 1, else 0");
        int choice = scanner.nextInt();
        if(choice==1){
        cars.add(car);
            System.out.println(car.getBrand()+" "+car.getModel()+" successfully added to cart");
        }
    }

    public void getCarByPriceMenu() {
        System.out.println("Please enter price range");
        System.out.println("Please enter start price: ");
        int start = scanner.nextInt();
        System.out.println("Please enter end price: ");
        int end = scanner.nextInt();
        controller.getCarByPrice(start, end);

    }
    public void getCarByYearMenu() {
        System.out.println("Please enter year range");
        System.out.println("Please enter start year: ");
        int start = scanner.nextInt();
        System.out.println("Please enter end year: ");
        int end = scanner.nextInt();
        controller.getCarByYear(start,end);

    }
    public void getCarByBrandMenu() {
        System.out.println("""
                Please choose car brand in the list:
                1.BMW
                2.Hyundai
                3.Toyota
                4.Volkswagen
                5.Audi
                6.Mercedes-Benz
                7.Lamborghini
                8.Porsche""");
        int brand = scanner.nextInt();
        controller.getCarByBrand(brand);
    }
    public void getCarByModelMenu() {
        System.out.println("""
                Please choose car brand in the list:
                1.BMW
                2.Hyundai
                3.Toyota
                4.Volkswagen
                5.Audi
                6.Mercedes-Benz
                7.Lamborghini
                8.Porsche""");
        int brand = scanner.nextInt();
        switch (brand){
            case 1:
                System.out.println("""
                      Please choose car model in the list:
                      1.iX
                      2.Z4
                      3.M2
                      4.520d
                      5.540i
                      6.M5 F90""");
                break;
            case 2:
                System.out.println("""
                      Please choose car model in the list:
                      1.Accent
                      2.Elantra
                      3.i30""");
                break;
            case 3:
                System.out.println("""
                      Please choose car model in the list:
                      1.Auris
                      2.Corolla
                      3.Prius""");
                break;
            case 4:
                System.out.println("""
                      Please choose car model in the list:
                      1.Polo
                      2.id.3
                      3.Golf 7""");
                break;
            case 5:
                System.out.println("""
                      Please choose car model in the list:
                      1.RS6
                      2.S7
                      3.e-tron GT""");
                break;
            case 6:
                System.out.println("""
                      Please choose car model in the list:
                      1.CLS
                      2.CLA
                      3.E-class""");
                break;
            case 7:
                System.out.println("""
                      Please choose car model in the list:
                      1.Aventador LP 780-4
                      2.Huracan LP 580-2
                      3.Urus""");
                break;
            case 8:
                System.out.println("""
                      Please choose car model in the list:
                      1.Cayman
                      2.911 Turbo-S
                      3.Taycan""");
                break;
        }
        int model = scanner.nextInt();
        controller.getCarByModel(brand, model);
    }
    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }
    public void cartMenu(){
        while(true) {
            System.out.println();
            if(cars.isEmpty()){
                System.out.println("Cart is empty");
                break;
            } else {
                System.out.println("Cars in your cart:");
                for (Car cars : cars) {
                    System.out.println(cars.toString());
                }
            }
            System.out.println("Select option:");
            System.out.println("1. Delete car from cart");
            System.out.println("2. Clear cart");
            System.out.println("0. Exit");
            try {
                System.out.print("Enter option (1-2): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Enter the ID of the car you want to delete:");
                    int id = scanner.nextInt();
                    Car deletedCar = null;
                    for(Car car:cars){
                        if(car.getId()==id){
                            deletedCar = car;
                        }
                    }
                    if(deletedCar!=null) {
                        cars.remove(deletedCar);
                        System.out.println(deletedCar.getBrand()+" "+deletedCar.getModel()+" has been deleted from cart");
                    } else {
                        System.out.println("There is no such a car");
                    }
                } else if (option == 2) {
                    cars.clear();
                    System.out.println("Cart has been cleared");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("*************************");
        }
    }
}
