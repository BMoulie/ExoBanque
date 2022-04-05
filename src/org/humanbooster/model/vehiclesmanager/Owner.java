package org.humanbooster.model.vehiclesmanager;

import java.util.ArrayList;

public class Owner {

    private String name;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public void add(Vehicle v) {
        vehicles.add(v);
    }

    public void countByBrand(String brand) {
        System.out.println(vehicles.stream().filter(v -> v.brand.equals(brand)).count() + " véhicules de la marque " + brand + ".");
    }
}
