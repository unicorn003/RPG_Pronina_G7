package com.isep.rpg;

public class Hunter extends Hero{

    public Hunter(String n) {
        super(n, 15, 4);
    }
    @Override
    public void take(Item item) {
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
            this.attackPoint += weapon.getDamagePoints();
        } else
        {
            Game.displayMessage("Oups ! " + item.getName() + " est inutile...");
        }
    }
    private Weapon weapon;
}
