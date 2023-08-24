package org.example.Anime;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int health) {
        super(name, "Water", health);
    }

    @Override
    public void attack(Battler enemy) {
        System.out.println(getName() + " splashes water!");
        if (!enemy.dodge())
            if (enemy instanceof Pokemon)
                ((Pokemon) enemy).setHealth(((Pokemon) enemy).getHealth() - 2);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " splashes water!");
    }
}
