package org.humanbooster.model.vehiclesmanager;

public class Car extends Vehicle {

    public Car(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("La voiture " + brand + " prend la route.");
    }

    @Override
    public void stop() {
        System.out.println("La voiture " + brand + " se gare sur le bas-côté.");
    }


}
