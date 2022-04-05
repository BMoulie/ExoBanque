package org.humanbooster;

import org.humanbooster.model.banque.ComptePayant;
import org.humanbooster.model.banque.CompteSimple;
import org.humanbooster.model.wargame.Berserker;
import org.humanbooster.model.wargame.Warrior;
import org.humanbooster.model.wargame.Wizard;

public class Main {

    public static void main(String[] args) {
        testWarGame();
    }

    public static void testWarGame() {
        Wizard magicien = new Wizard();
        Warrior guerrier = new Warrior();
        Berserker berserk = new Berserker();

        guerrier.attack(magicien);
        magicien.spellCast(guerrier);
        System.out.println(guerrier);
        System.out.println(magicien);
        System.out.println();

        berserk.attack(guerrier);
        guerrier.attack(berserk);
        System.out.println(berserk);
        System.out.println(guerrier);
        System.out.println();

        magicien.attack(berserk);
        guerrier.doubleAttack(berserk);
        System.out.println(berserk);
        System.out.println(magicien);
        System.out.println(guerrier);
        System.out.println();

        berserk.useRage(magicien);
        System.out.println(berserk);
        System.out.println(magicien);
        System.out.println(guerrier);
        System.out.println();
    }

    public static void testBanque() {
        ComptePayant cpt = new ComptePayant(0);
        cpt.verser(500);
        System.out.println(cpt);
        cpt.retirer(200);
        System.out.println(cpt);
        cpt.retirer(400);
        System.out.println(cpt);

        CompteSimple cpt2 = new CompteSimple(0,200);
        cpt2.verser(1000);
        System.out.println(cpt2);
    }

}
