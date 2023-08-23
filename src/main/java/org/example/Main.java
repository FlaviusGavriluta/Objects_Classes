package org.example;

public class Main {
    public static void main(String[] args) {
        // Creates two Pokemon
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);

        // Atack
        System.out.println(pikachu.name + " attacks " + bulbasaur.name);
        pikachu.attack(bulbasaur);

        System.out.println(bulbasaur.dodge());
        System.out.println(bulbasaur.name + " has " + bulbasaur.health + " health left");
    }
}