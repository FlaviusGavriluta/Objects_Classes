package org.example.Anime;

public class Dragon extends Creature {
    private String element;

    public Dragon(String name, String element, int health) {
        super(name, health);
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void breatheFire() {
        System.out.println(getName() + " is breathing fire!");
    }
}
