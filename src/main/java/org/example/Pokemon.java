package org.example;

public class Pokemon {
    String name;
    String type;
    int health;

    boolean dodge() {
        return Math.random() > .5;
    }

    void attack(Pokemon enemy) {
        if (!enemy.dodge())
            enemy.health--;
    }
}