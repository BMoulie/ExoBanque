package org.humanbooster.model;

public class ComptePayant extends Compte {

    public ComptePayant() {
    }

    @Override
    public void verser(float montant) {
        if (montant > 1) {
            solde += montant - 1;
        } else {
            solde = 0;
        }
    }

    @Override
    public void retirer(float montant) {
        if (montant + 1 > solde) {
            System.out.println("Votre solde est de : " + solde + ".\nNous ne pouvons vous délivrer que cette somme moins les frais.");
            solde = 0;
        } else {
            solde -= montant + 1;
        }
    }
}
