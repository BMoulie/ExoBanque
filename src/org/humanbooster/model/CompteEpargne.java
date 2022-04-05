package org.humanbooster.model;

public class CompteEpargne extends Compte {

    private float taux;

    public CompteEpargne(float taux) {
        this.taux = taux;
    }

    public void calculInterets() {
        System.out.println("Intérêts : " + solde * taux / 100);
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "id=" + this.getId() +
                ", solde=" + solde +
                ", taux=" + taux +
                '}';
    }
}
