package org.example;

public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int health) {
        super(name, "Electric", health);
    }

    @Override
    public void attack(Battler enemy) {
        System.out.println(getName() + " shocks with electricity!");
        if (!enemy.dodge())
            if (enemy instanceof Pokemon)
                ((Pokemon) enemy).setHealth(((Pokemon) enemy).getHealth() - 3);
    }
}
