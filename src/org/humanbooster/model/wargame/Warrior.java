package org.humanbooster.model.wargame;

public class Warrior extends Humanoid {

    private boolean doubleAttackReady;

    public Warrior(String name, double health, int force, boolean doubleAttackReady) {
        super(name, health, force);
        this.doubleAttackReady = doubleAttackReady;
    }

    public Warrior() {
        this("Warrior", 100, 20, true);
    }

    @Override
    public void attack(Humanoid h) {
        super.attack(h);
        doubleAttackReady = true;
    }

    public void doubleAttack(Humanoid h) {
        if (doubleAttackReady) {
            h.receiveDamage(force * 0.7);
            h.receiveDamage(force * 0.7);
            doubleAttackReady = false;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", doubleAttackReady=" + doubleAttackReady +
                '}';
    }
}
