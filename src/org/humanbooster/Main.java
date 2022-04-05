package org.humanbooster;

import org.humanbooster.model.banque.ComptePayant;
import org.humanbooster.model.banque.CompteSimple;
import org.humanbooster.model.vehiclesmanager.Boat;
import org.humanbooster.model.vehiclesmanager.Car;
import org.humanbooster.model.vehiclesmanager.Owner;
import org.humanbooster.model.vehiclesmanager.Plane;
import org.humanbooster.model.wargame.Berserker;
import org.humanbooster.model.wargame.Warrior;
import org.humanbooster.model.wargame.Wizard;

public class Main {

    public static void main(String[] args) {
        testVehicules();
    }

    public static void testVehicules() {
        Car c = new Car(150, "Peugeot");
        Car c2 = new Car(100, "Citroën");
        Car c3 = new Car(120, "BMW");

        Plane p = new Plane(500, "Airbus");
        Plane p2 = new Plane(600, "Airbus");
        Plane p3 = new Plane(750, "Boeing");

        Boat b = new Boat(3000, "Poséidon");
        Boat b2 = new Boat(3000, "Zodiac");

        Owner o = new Owner("Paul");

        o.add(c);
        o.add(c2);
        o.add(c3);
        o.add(p);
        o.add(p2);
        o.add(p3);
        o.add(b);
        o.add(b2);

        o.countByBrand("Citroën");
        o.countByBrand("Airbus");

        b2.start();
        c.start();
        b2.stop();
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
