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

    public void startAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            if (vehicle instanceof Boat) {
                ((Boat) vehicle).sail();
            } else if (vehicle instanceof Plane p) {
                p.fly();
            }
        }
    }

}
