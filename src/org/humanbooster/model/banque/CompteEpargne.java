package org.humanbooster.model.banque;

public class CompteEpargne extends Compte {

    private float taux;

    public CompteEpargne(float solde, float taux) {
        super(solde);
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
