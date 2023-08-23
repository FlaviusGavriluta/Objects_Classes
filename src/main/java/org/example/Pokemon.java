package org.example;

public class Pokemon {
    public final String name;
    public final String type;
    public int health;

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    boolean dodge() {
        return Math.random() > .5;
    }

    void attack(Pokemon enemy) {
        if (!enemy.dodge())
            enemy.health--;
    }
}