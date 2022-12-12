package com.isep.rpg;

public class Achievement {
    private String achievementName;
    private String achievementDescription;
    private boolean isAchieved;

    public Achievement(String n, String d, boolean i){
        achievementName = n;
        achievementDescription = d;
        isAchieved = i;
    }
    public String getAchievementDescription() {
        return achievementDescription;
    }
    public String getAchievementName() {
        return achievementName;
    }
    public boolean isAchieved() {
        return isAchieved;
    }
    public void setAchieved(boolean achieved) {
        isAchieved = achieved;
    }
}
