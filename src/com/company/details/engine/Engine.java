package com.company.details.engine;
public class Engine {
    private double torque;//крутящий момент
    public Engine(double torque) {
        this.torque = torque;

    }
    public double getTorque() {
        return torque;
    }

    @Override
    public String toString() {
        return "Engine{" +
                ", torque=" + torque +
                '}';
    }
}
