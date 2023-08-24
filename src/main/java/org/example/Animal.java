package org.example;

import java.sql.SQLOutput;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound(); // Abstract method, no body

    public void eat() {
        System.out.println(name + " is eating!");
    }
}