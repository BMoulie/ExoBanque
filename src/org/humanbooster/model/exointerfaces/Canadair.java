package org.humanbooster.model.exointerfaces;

public class Canadair implements Volant, Flottant {

    @Override
    public void decoller() {
        System.out.println("Le canadair décolle.");
    }

    @Override
    public void atterrir() {
        System.out.println("Le canadair se pose.");
    }

    @Override
    public void barrelRoll() {
        System.out.println("Accrochez-vous ! Tonneau !");
    }

    @Override
    public void naviguer() {
        System.out.println("Le canadair se déplace sur l'eau.");
    }

    @Override
    public void leverAncre() {
        System.out.println("Le canadair quitte la surface de l'eau.");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le canadair se pose sur l'eau.");
    }
}
