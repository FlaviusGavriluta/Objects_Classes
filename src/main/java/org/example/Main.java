package org.example;

public class Main {
    public static void battle(Battler battler1, Battler battler2) {
        battler1.attack(battler2);
        battler2.attack(battler1);
    }

    public static void main(String[] args) {
        // Creates objects
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);
        Dragon argon = new Dragon("Argon", "Fire", 100);
        Pokemon raichu = new ElectricPokemon("Raichu", 20);
        Pokemon squirtle = new WaterPokemon("Squirtle", 25);

        // Action
        System.out.println(pikachu.getName() + " vs " + bulbasaur.getName());
        battle(pikachu, bulbasaur);

        System.out.println(bulbasaur.getName() + " has " + bulbasaur.getHealth() + " health left");
        System.out.println(pikachu.getName() + " has " + pikachu.getHealth() + " health left");

        System.out.println(argon.getName() + " is of " + argon.getElement() + " element.");
        argon.breatheFire();

        System.out.println(raichu.getName() + " vs " + squirtle.getName());
        battle(raichu, squirtle);

        System.out.println(raichu.getName() + " has " + raichu.getHealth() + " health left");
        System.out.println(squirtle.getName() + " has " + squirtle.getHealth() + " health left");

        // Interfaces and Abstraction
        Animal dog = new Dog("Peper");
        Bird bird = new Bird("Tweety");
        Insect insect = new Insect("Buggy");

        dog.eat();
        System.out.print(dog.getName() + " makes: ");
        dog.makeSound();

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
    }

    public static void makeItFly(Flying flyingEntity) {
        System.out.println("Making it fly...");
        flyingEntity.fly();
    }
}