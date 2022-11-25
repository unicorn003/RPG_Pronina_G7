package com.isep.rpg;

public class Warrior extends Hero {

    public Warrior(String n) {
        super(n, 14, 8);
    }
    @Override
    public void take(Item item) {
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
        } else {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }

    private Weapon weapon;
}

