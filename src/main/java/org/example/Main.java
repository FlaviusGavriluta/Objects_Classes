package org.example;

public class Main {
    public static void main(String[] args) {
        // Creates objects
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);
        Dragon argon = new Dragon("Argon", "Fire", 100);
        Pokemon raichu = new ElectricPokemon("Raichu", 20);
        Pokemon squirtle = new WaterPokemon("Squirtle", 25);

        // Action
        System.out.println(pikachu.getName() + " attacks " + bulbasaur.getName());
        pikachu.attack(bulbasaur);
        System.out.println(bulbasaur.getName() + " has " + bulbasaur.getHealth() + " health left");

        System.out.println(argon.getName() + " is of " + argon.getElement() + " element.");
        argon.breatheFire();

        System.out.println(raichu.getName() + " vs " + squirtle.getName());
        squirtle.attack(raichu);
        raichu.attack(squirtle);

        System.out.println(raichu.getName() + " has " + raichu.getHealth() + " health left");
        System.out.println(squirtle.getName() + " has " + squirtle.getHealth() + " health left");
    }
}