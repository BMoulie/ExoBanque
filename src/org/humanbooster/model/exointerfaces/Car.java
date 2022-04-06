package org.humanbooster.model.exointerfaces;

public class Car implements Roulant {

    @Override
    public void rouler() {
        System.out.println("La voiture roule.");
    }
}
