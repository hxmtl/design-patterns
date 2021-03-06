package com.eprogrammerz.examples.gof.patterns.proxy.vehicle;

/**
 * Proxy interface implementation
 */
public class Car implements IVehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Car " + name + " started");
    }
}
