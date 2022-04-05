package org.humanbooster;

import org.humanbooster.model.Compte;
import org.humanbooster.model.CompteEpargne;
import org.humanbooster.model.ComptePayant;
import org.humanbooster.model.CompteSimple;

public class Main {

    public static void main(String[] args) {
        ComptePayant cpt = new ComptePayant();
        cpt.verser(500);
        System.out.println(cpt);
        cpt.retirer(200);
        System.out.println(cpt);
        cpt.retirer(400);
        System.out.println(cpt);
    }
}
