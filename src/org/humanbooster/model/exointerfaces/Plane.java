package org.humanbooster.model.exointerfaces;

public class Plane implements Volant {

    @Override
    public void decoller() {
        System.out.println("L'avion décolle.");
    }

    @Override
    public void atterrir() {
        System.out.println("L'avion se pose.");
    }

    @Override
    public void barrelRoll() {
        System.out.println("Accrochez-vous ! Tonneau !");
    }
}
