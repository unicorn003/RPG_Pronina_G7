package com.isep.rpg;

public abstract class Consumable extends Item {
    public Consumable(String name, int effect) {
        super(name);
        this.effect = effect;
    }
    private int effect;
}

