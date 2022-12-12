package com.isep.rpg;

public class MageAchievment extends Achievement{

    public MageAchievment(String d, boolean i) {
        super("20 points of aim", "Given to your mage, if you determine that it was he who won and give him the opportunity to attack +20 points", i);
    }
    private Potion superPotion = new Potion("superPotion", 20);
    public Potion returnAchievement(){
        return superPotion;
    }
}