package org.example;

public class Pokemon extends Creature implements Battler {
    private String type;

    // Constructor
    public Pokemon(String name, String type, int health) {
        super(name, health);
        this.type = type;
    }

    // Getters
    public String getType() {
        return type;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean dodge() {
        return Math.random() > .5;
    }

    @Override
    public void attack(Battler enemy) {
        System.out.println(getName() + " attacks!");
        if (!enemy.dodge()) {
            ((Pokemon) enemy).setHealth(((Pokemon) enemy).getHealth() - 1);
        }
    }
}