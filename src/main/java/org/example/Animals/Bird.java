package org.example.Animals;

public class Bird extends Animal implements Flying {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing!");
    }

    @Override
    public void makeSound() {
        System.out.println("Pew! Pew!");
    }
}