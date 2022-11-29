package com.isep.rpg;

public class Warrior extends Hero {

    public Warrior(String n) {
        super(n, 14, 8);
    }
    @Override
    public void take(Item item) {
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
            this.attackPoint += weapon.getDamagePoints();
        } else if (item instanceof Food) {
            Food food = (Food) item;
            this.healthPoint += food.getEffect();
        }
        else
        {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }

    private Weapon weapon;
}

