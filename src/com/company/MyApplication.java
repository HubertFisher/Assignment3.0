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
        if(car!=null){
            System.out.println(car.toString());
            System.out.println("To add this car to cart press 1, else 0");
            int choice = scanner.nextInt();
            if(choice==1){
                cars.add(car);
                System.out.println(car.getBrand()+" "+car.getModel()+" successfully added to cart");
            }
        } else {
            System.out.println("Car was not found!");
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
        switch (brand) {
            case 1 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.iX
                    2.Z4
                    3.M2
                    4.520d
                    5.540i
                    6.M5 F90""");
            case 2 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.Accent
                    2.Elantra
                    3.i30""");
            case 3 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.Auris
                    2.Corolla
                    3.Prius""");
            case 4 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.Polo
                    2.id.3
                    3.Golf 7""");
            case 5 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.RS6
                    2.S7
                    3.e-tron GT""");
            case 6 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.CLS
                    2.CLA
                    3.E-class""");
            case 7 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.Aventador LP 780-4
                    2.Huracan LP 580-2
                    3.Urus""");
            case 8 -> System.out.println("""
                    Please choose car model or models in the list:
                    1.Cayman
                    2.911 Turbo-S
                    3.Taycan""");
        }
        int[] modelId = new int[3];
        int counter=0;
        while (counter<3){
            modelId[counter]=scanner.nextInt();

            if (modelId[counter]==0)
                break;
            System.out.println("List of selected models:");
            for (int i = 0; i <=counter ; i++) {
                System.out.print(defineCarBrandAndModel(brand,modelId[i])+"\n");
            }
            System.out.println("Enter 0 to start searching or select another model ");
            counter++;
        }
        controller.getCarByModel(brand, modelId);
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
    private String defineCarBrandAndModel(int brandId,int modelId){
        String[] BrandAndModel = new String[2];
        BrandAndModel[0]= switch (brandId) {
            case 1 -> "BMW";
            case 2 -> "Hyundai";
            case 3 -> "Toyota";
            case 4 -> "Volkswagen";
            case 5 -> "Audi";
            case 6 -> "Mercedes-Benz";
            case 7 -> "Lamborghini";
            case 8 -> "Porsche";
            default -> "";
        };

        switch (BrandAndModel[0]){
            case "":
                BrandAndModel[1]="";
            case "Audi":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "RS6";
                    case 2 -> "S7";
                    case 3-> "e-tron GT";
                    default ->  BrandAndModel[1];
                };
                break;
            case "BMW":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "iX";
                    case 2 -> "Z4";
                    case 3-> "M2";
                    case 4-> "520d";
                    case 5-> "540i";
                    case 6-> "M5 F90";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Hyundai":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "Accent";
                    case 2 -> "Elantra";
                    case 3-> "i30";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Lamborghini":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "Aventador LP 780-4";
                    case 2 -> "Huracan LP 580-2";
                    case 3-> "Urus";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Mercedes-Benz":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "CLS";
                    case 2 -> "CLA";
                    case 3-> "E-class";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Porsche":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "Cayman";
                    case 2 -> "911 Turbo-S";
                    case 3-> "Taycan";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Toyota":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "Auris";
                    case 2 -> "Corolla";
                    case 3-> "Prius";
                    default ->  BrandAndModel[1];
                };
                break;
            case "Volkswagen":
                BrandAndModel[1] = switch (modelId) {
                    case 1 -> "Polo";
                    case 2 -> "id.3";
                    case 3-> "Golf 7";
                    default ->  BrandAndModel[1];
                };
        };
        return BrandAndModel[1];
    }
}
