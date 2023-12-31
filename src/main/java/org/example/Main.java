package org.example;

import org.example.Animals.*;
import org.example.Anime.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void battle(Battler battler1, Battler battler2) {
        battler1.attack(battler2);
        battler2.attack(battler1);
    }

    public static void main(String[] args) {
        // Creates objects
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);
        Dragon argon = new Dragon("Argon", "Fire", 70);
        Pokemon raichu = new ElectricPokemon("Raichu", 20);
        Pokemon squirtle = new WaterPokemon("Squirtle", 25);
        Guardian guardian = new Guardian("Gordon", 100);

        // Action
        System.out.println("Battles begin!");
        battle(raichu, squirtle);
        raichu.makeSound();
        battle(squirtle, pikachu);
        pikachu.makeSound();
        battle(bulbasaur, raichu);
        bulbasaur.makeSound();
        battle(pikachu, squirtle);
        squirtle.makeSound();

        System.out.println("Healing begins!");
        guardian.heal(raichu);
        guardian.heal(pikachu);

        PokemonCenter center = new PokemonCenter();
        center.heal(squirtle);
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(bulbasaur);
        pokemonList.add(raichu);
        center.heal(pokemonList);

        System.out.println(pikachu.getName() + " has " + pikachu.getHealth() + " health left");
        System.out.println(squirtle.getName() + " has " + squirtle.getHealth() + " health left");

        // Interfaces and Abstraction
        System.out.println("--------------------------");
        Animal dog = new Dog("Peper");
        Bird bird = new Bird("Tweety");
        Insect insect = new Insect("Buggy");

        dog.eat();
        System.out.print(dog.getName() + " makes: ");
        dog.makeSound();
        System.out.println("--------------------------");

        bird.fly();
        bird.land();
        bird.eat();
        System.out.print(bird.getName() + " makes: ");
        bird.makeSound();

        System.out.println("--------------------------");
        Flying flyingBird = new Bird("Robin");
        flyingBird.fly();
        flyingBird.land();

        System.out.println("--------------------------");
        makeItFly(bird);
        makeItFly(flyingBird);
        makeItFly(insect);

        System.out.println("--------------------------");

        Pokedex pokedex = new Pokedex();
        Trainer ash = new Trainer("Ash");

        pokedex.addPokemon(pikachu);
        pokedex.addPokemon(raichu);

        ash.catchPokemon(bulbasaur);
        ash.catchPokemon(squirtle);

        pokedex.listPokemons();
        ash.listPokemons();
    }

    public static void makeItFly(Flying flyingEntity) {
        System.out.println("Making it fly...");
        flyingEntity.fly();
    }
}