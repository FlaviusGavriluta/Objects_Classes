package org.example;

public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int health) {
        super(name, "Electric", health);
    }

    @Override
    public void attack(Pokemon enemy) {
        System.out.println(getName() + " shocks with electricity!");
        if (!enemy.dodge())
            enemy.setHealth(enemy.getHealth() - 3);
    }
}
