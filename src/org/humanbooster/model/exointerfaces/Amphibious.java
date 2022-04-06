package org.humanbooster.model.exointerfaces;

public class Amphibious implements Roulant, Flottant {

    @Override
    public void rouler() {
        System.out.println("Le véhicule amphibie roule");
    }

    @Override
    public void naviguer() {
        System.out.println("Le véhicule amphibie navigue.");
    }

    @Override
    public void leverAncre() {
        System.out.println("Le véhicule amphibie lève l'ancre.");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le véhicule amphibie jette l'ancre.");
    }

}
