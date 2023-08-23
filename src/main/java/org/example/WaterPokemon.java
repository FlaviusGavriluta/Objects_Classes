package org.example;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int health) {
        super(name, "Water", health);
    }

    @Override
    public void attack(Pokemon enemy) {
        System.out.println(getName() + " splashes water!");
        if (!enemy.dodge())
            enemy.setHealth(enemy.getHealth() - 2);
    }
}
