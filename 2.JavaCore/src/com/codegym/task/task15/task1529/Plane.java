package com.codegym.task.task15.task1529;

public class Plane implements CanFly {
    int passengers;

    public Plane (int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
