package org.example.Anime;

public abstract class MysticalCreature extends Creature implements Healer {
    public MysticalCreature(String name, int health) {
        super(name, health);
    }

    @Override
    public void heal(Creature creature) {
        System.out.println(getName() + " is healing " + creature.getName() + "!");
        creature.setHealth(creature.getHealth() + 5);
    }
}
