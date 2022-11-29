package com.isep.rpg;

public abstract class SpellCaster extends Hero{
    public SpellCaster(String n, int h, int a) {
        super(n, h,a);
    }
    protected Potion potion;
}
