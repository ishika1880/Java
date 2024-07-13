package com.Java.Oops.Interfaces;

public class Car implements Engine, Media, Brake {

    int power;

    @Override
    public void brake() {
        System.out.println("Brakes are pulled");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void acc() {
        System.out.println("increase the speed");
    }

}
