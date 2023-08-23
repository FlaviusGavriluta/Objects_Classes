package org.example;

public class Pokemon extends Creature {
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

    public boolean dodge() {
        return Math.random() > .5;
    }

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.setHealth(enemy.getHealth() - 1);
        }
    }
}