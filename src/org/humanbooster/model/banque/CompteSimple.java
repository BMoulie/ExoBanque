package org.humanbooster.model.banque;

public class CompteSimple extends Compte {

    private float decouvert;

    public CompteSimple(float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) throws OpeBanqueException {
        if (montant > solde + decouvert) {
            throw new DecouvertException("Ce retrait excède votre découvert autorisé.");
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
