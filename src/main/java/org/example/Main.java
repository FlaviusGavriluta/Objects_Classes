package org.example;

public class Main {
    public static void main(String[] args) {
        // First pokemon
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "Electric";
        pikachu.health = 10;

        // Second pokemon
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.type = "Grass";
        bulbasaur.health = 10;

        // Atack
        System.out.println(pikachu.name + " attacks " + bulbasaur.name);
        pikachu.attack(bulbasaur);

        System.out.println(bulbasaur.name + " has " + bulbasaur.health + " health left");
    }
}