

# OOP Principles:

Let's start with a simple example to help you understand how to create and use objects in Java.

1. **Creating Objects**

In the Main class, you can create objects of the Pokemon type and use them to interact.
Create two Pokemon and make them attack each other.

```
package org.example;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "Electric";
        pikachu.health = 10;

        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.type = "Grass";
        bulbasaur.health = 10;

        System.out.println(pikachu.name + " attacks " + bulbasaur.name);
        pikachu.attack(bulbasaur);

        System.out.println(bulbasaur.name + " has " + bulbasaur.health + " health left");
    }
}
```

2. **Adding a Constructor**

It's a good idea to add a constructor to the Pokemon class, so you can create objects more easily.
A constructor is a special method that is called when you create a new object.

```
public Pokemon(String name, String type, int health) {
    this.name = name;
    this.type = type;
    this.health = health;
}
```

Now you can create objects in Main using the new constructor:

```
Pokemon pikachu = new Pokemon("Pikachu", "Electric", 10);
Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 10);
```

3. **Understanding Methods**

The dodge and attack methods in the Pokemon class help you understand how objects can interact with each other.
In this case, a Pokemon can attack another Pokemon, and the attacked one can try to dodge the attack.

If you want to continue and add more functionality or improve the code, you can tell me what
specifically interests you, and I will be happy to explain and provide more examples!