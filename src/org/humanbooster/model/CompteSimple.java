package org.humanbooster.model;

public class CompteSimple extends Compte {

    private float decouvert;

    public CompteSimple(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) {
        if (montant > solde + decouvert) {
            System.out.println("Votre autoristion de découvert est de : " + solde + ".\nNous ne pouvons vous délivrer que cette somme en plus de votre solde qui est de : " + solde + ".");
            solde = - decouvert;
        } else {
            solde -= montant;
        }
    }

    @Override
    public String toString() {
        return "CompteSimple{" +
                "id=" + this.getId() +
                ", solde=" + solde +
                ", decouvert=" + decouvert +
                '}';
    }
}
