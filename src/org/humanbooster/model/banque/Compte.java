package org.humanbooster.model.banque;

public abstract class Compte {

    private int id;
    private static int countComptes = 0;
    protected float solde = 0;

    public Compte(float solde) {
        id = ++countComptes;
        this.solde = solde;
    }

    public void verser(float montant) {
        solde += montant;
    }

    public void retirer(float montant) throws OpeBanqueException {
        if (montant > solde) {
            throw new RetraitException("Solde insuffisant pour effectuer le ertrait.");
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
