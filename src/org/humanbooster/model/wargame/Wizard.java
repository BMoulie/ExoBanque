package org.humanbooster.model.wargame;

public class Wizard extends Humanoid {

    private int mana;
    private int intelligence;
    private boolean shield;
    private int hitsOnShield;

    public Wizard(String name, double health, int force, int mana, int intelligence, boolean shield, int hitsOnShield) {
        super(name, health, force);
        this.mana = mana;
        this.intelligence = intelligence;
        this.shield = shield;
        this.hitsOnShield = hitsOnShield;
    }

    public Wizard() {
        this("Wizard", 100, 20, 20, 5, false, 0);
    }

    public void spellCast(Humanoid h) {
        if (mana >= 10) {
            mana -= 10;
            h.receiveDamage(force + intelligence);
        }
    }

    public void activateShield(){
        if (mana >= 3) {
            mana -= 3;
            shield = true;
            hitsOnShield = 0;
        }
    }

    public void addMana(int mana) {
        this.mana += mana;
    }

    @Override
    public void receiveDamage(double damage) {
        if (shield) {
            super.receiveDamage(damage * 0.8);
            hitsOnShield++;
            if (hitsOnShield >= 5) {
                shield = false;
                hitsOnShield = 0;
            }
        } else {
            super.receiveDamage(damage);
        }
    }

    @Override
    public void attack(Humanoid h) {
        super.attack(h);
        addMana(1);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                ", shield=" + shield +
                ", hitsOnShield=" + hitsOnShield +
                '}';
    }
}
