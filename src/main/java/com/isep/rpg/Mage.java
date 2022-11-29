package com.isep.rpg;

public class Mage extends SpellCaster{
    public Mage(String n) {
        super(n, 10, 5);
    }
    @Override
    public void take(Item item) {
        if (item instanceof Potion) {
            potion = (Potion) item;
            this.attackPoint += potion.getEffect();
        } else
        {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }
}
