package com.isep.rpg;

public abstract class Consumable extends Item {
    public Consumable(String name, int effect) {
        super(name);
        this.effect = effect;
    }
    private final int effect;
    public int getEffect(){
        return effect;
    }
}

