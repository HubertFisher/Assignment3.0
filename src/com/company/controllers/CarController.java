package com.company.controllers;


import com.company.repositories.interfaces.ICarRepository;

import java.util.List;

public class CarController {
    private final ICarRepository repo;

    public CarController(ICarRepository repo) {
        this.repo = repo;
    }

    public String getUser(int id) {
        User user = repo.getUser(id);

        return (user == null ? "User was not found!" : user.toString());
    }

    public String getAllUsers() {
        List<User> users = repo.getAllUsers();

        return users.toString();
    }
}
