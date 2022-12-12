package com.isep.rpg;

public class HealerAchievement extends Achievement{

    public HealerAchievement(String d, boolean i) {
        super("20 points of aim", "Given to your healer, if you determine that it was he who won and give him the opportunity to heal everyone by +20 points", i);
    }
    @Override
    public int returnAchievement(){
        return 20;
    }
}
