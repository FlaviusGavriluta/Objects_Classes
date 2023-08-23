package org.example;

public class Pokemon {
    private String name;
    private String type;
    private int health;

    // Constructor
    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public boolean dodge() {
        return Math.random() > .5;
    }

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.setHealth(enemy.health - 1);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}