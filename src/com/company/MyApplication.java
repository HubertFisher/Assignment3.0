package com.company;

import com.company.controllers.CarController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final CarController controller;
    private final Scanner scanner;

    public MyApplication(CarController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Select option:");
            System.out.println("1. Get all users");
            System.out.println("2. Get car by id");
            System.out.println("3. Get car by price");
            System.out.println("4. Get car by year of production");
            System.out.println("5. Get car by brand");
            System.out.println("6. Get car by model");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-6): ");
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
        String response = controller.getAllCars();
        System.out.println(response);
    }

    public void getCarByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getCar(id);
        System.out.println(response);
    }

    public void getCarByPriceMenu() {
        System.out.println("Please enter price range");
        System.out.println("Please enter start price: ");
        int start = scanner.nextInt();
        System.out.println("Please enter end price: ");
        int end = scanner.nextInt();
        String response = controller.getCarByPrice(start,end);
        System.out.println(response);
    }
    public void getCarByYearMenu() {
        System.out.println("Please enter year range");
        System.out.println("Please enter start year: ");
        int start = scanner.nextInt();
        System.out.println("Please enter end year: ");
        int end = scanner.nextInt();
        String response = controller.getCarByYear(start,end);
        System.out.println(response);
    }
    public void getCarByBrandMenu() {
        System.out.println("Please enter car brand");
        String brand = scanner.next();
        String response = controller.getCarByBrand(brand);
        System.out.println(response);
    }
    public void getCarByModelMenu() {
        System.out.println("Please enter car brand");
        String brand = scanner.next();
        System.out.println("Please enter car model");
        String model = scanner.next();
        String response = controller.getCarByModel(brand, model);
        System.out.println(response);
    }
}
