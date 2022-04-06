package org.humanbooster.model.exointerfaces;

public class Boat implements Flottant {

    @Override
    public void naviguer() {
        System.out.println("Le bateau navigue.");
    }

    @Override
    public void leverAncre() {
        System.out.println("Le bateau lève l'ancre.");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le bateau jette l'ancre.");
    }

}
