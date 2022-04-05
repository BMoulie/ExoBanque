package org.humanbooster.model.vehiclesmanager;

public class Plane extends Vehicle {

    public Plane(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("L'avion " + brand + " décolle.");
    }

    @Override
    public void stop() {
        System.out.println("L'avion " + brand + " atterrit.");
    }

    public void fly() {
        System.out.println("L'avion " + brand + " vole dans les airs.");
    }

}
