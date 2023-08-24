package org.example.Anime;

public class Pokemon extends Creature implements Battler {
    private String type;
    private int maxHealth;

    // Constructor
    public Pokemon(String name, String type, int health) {
        super(name, health);
        this.type = type;
        this.maxHealth = health;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getMaxHealth() {
        return maxHealth;
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

    public void makeSound() {
        System.out.println(getName() + " makes a generic Pokemon sound!");
    }
}