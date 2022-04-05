package org.humanbooster.model;

public abstract class Compte {

    private int id;
    private static int countComptes = 0;
    protected float solde = 0;

    public Compte() {

        id = ++countComptes;

    }

    public void verser(float montant) {
        solde += montant;
    }

    public void retirer(float montant) {
        if (montant > solde) {
            System.out.println("Votre solde est de : " + solde + ".\nNous ne pouvons vous délivrer que cette somme.");
            solde = 0;
        } else {
            solde -= montant;
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }
}
