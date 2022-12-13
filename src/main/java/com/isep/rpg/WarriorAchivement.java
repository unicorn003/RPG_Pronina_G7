package com.isep.rpg;

public class WarriorAchivement extends Achievement{

    public WarriorAchivement(boolean i) {
        super("Stinger", "Given to your warrior, if you determine that it was he who won and give him a stinger", i);
    }
    private Weapon stinger = new Weapon("Stinger", 40);
    public Weapon returnAchievement() {
        return stinger;
    }
}
