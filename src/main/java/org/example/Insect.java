package org.example;

public class Insect extends Animal implements Flying {
    public Insect(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Insect is flying.");
    }

    @Override
    public void land() {
        System.out.println("Insect is landing");
    }

    @Override
    public void makeSound() {
        System.out.println("Cry! Cry!");
    }
}
