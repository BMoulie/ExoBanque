package org.humanbooster.model.wargame;

public class Berserker extends Humanoid {

    private int rage;

    public Berserker(String name, double health, int force, int rage) {
        super(name, health, force);
        this.rage = rage;
    }

    public Berserker() {
        this("Berserker", 100, 20, 0);
    }

    public void useRage(Humanoid h) {
        if (rage >= 8) {
            rage -= 8;
            h.receiveDamage(force * 1.5);
        }
    }

    public void addRage(int rage) {
        this.rage += rage;
    }

    @Override
    public void receiveDamage(double damage) {
        super.receiveDamage(damage);
        addRage(3);
    }

    @Override
    public String toString() {
        return "Berserker{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", rage=" + rage +
                '}';
    }
}
