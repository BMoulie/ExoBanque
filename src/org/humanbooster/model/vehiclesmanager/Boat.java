package org.humanbooster.model.vehiclesmanager;

public class Boat extends Vehicle {

    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("Le bateau " + brand + " lève l'ancre.");
    }

    @Override
    public void stop() {
        System.out.println("Le bateau " + brand + " jette l'ancre.");
    }

    public void sail() {
        System.out.println("Le bateau " + brand + " navigue sur les flots.");
    }

}
