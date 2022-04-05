package org.humanbooster.model.vehiclesmanager;

public abstract class Vehicle {

    private int engine;
    protected String brand;

    public Vehicle(int engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public abstract void start();

    public abstract void stop();

    public final void displayEngine() {
        System.out.println("Le vehicule " + brand + " a une puissance de " + engine + ".");
    }

}
