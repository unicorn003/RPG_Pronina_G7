package com.isep.rpg;

public class HunterAchievement extends Achievement{
    public HunterAchievement(String n, String d, boolean i) {
        super("Golder axe", "Given to your warrior, if you determine that it was he who won and give him a golden axe", i);
    }
    private Weapon goldenAxe = new Weapon("Golder axe", 40);
    public Weapon returnAchievement() {
        return goldenAxe;
    }

}
