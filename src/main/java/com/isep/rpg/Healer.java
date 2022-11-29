package com.isep.rpg;

public class Healer extends SpellCaster{
    public Healer(String n) {
        super(n, 18, 3);
    }


    @Override
    public void take(Item item) {
        if (item instanceof Potion) {
            potion = (Potion) item;
        } else
        {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }
}
