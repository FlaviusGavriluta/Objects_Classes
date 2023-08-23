package org.example;

public class Main {
    public static void main(String[] args) {
        // Creates objects
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);
        Dragon argon = new Dragon("Argon", "Fire", 100);

        // Action
        System.out.println(pikachu.getName() + " attacks " + bulbasaur.getName());
        pikachu.attack(bulbasaur);
        System.out.println(bulbasaur.getName() + " has " + bulbasaur.getHealth() + " health left");

        System.out.println(argon.getName() + " is of " + argon.getElement() + " element.");
        argon.breatheFire();
    }
}