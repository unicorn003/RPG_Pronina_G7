package com.isep.utils;

import com.isep.rpg.*;

import java.util.List;
import java.util.Scanner;

public class ConsoleParser implements InputParser{
    Scanner s = new Scanner(System.in);
    @Override
    public String askName() {
        System.out.println("Hello. I am a game. What's your name?");
        String name = s.nextLine();
        return name;
    }

    @Override
    public void sayWelcome() {
        String name = askName();
        System.out.println("Hello, my dear " + name + "! Welcome here!");
        System.out.println("#########################");
    }


    @Override
    public void showHeros(List<Combatant> heros) {
        for (int i = 0; i < heros.size(); i++){
            System.out.println(i+1 +" " + heros.get(i).getName() + " " + heros.get(i).getHealthPoint());
        }
        System.out.println("#########################");
    }
    public void showEnemies(List<Combatant> enemies){
        for (int i = 0; i < enemies.size(); i++){
            System.out.println(i+1 +" " + enemies.get(i).getName() + " " + enemies.get(i).getHealthPoint());
        }
        System.out.println("#########################");
    }

    public int askNumber(){
        System.out.println("Please, type the number of chosen hero ");
        int n = s.nextInt();
        return n;
    }

    @Override
    public void win() {
        System.out.println("Congratulations. You have won this game. Chose your hero to take an achievement");
    }

    public void getRewards(Combatant combatant){
        if (combatant instanceof Healer) {
            HealerAchievement hA = new HealerAchievement(true);
            ((Healer) combatant).take(hA.returnAchievement());
        } else
        if (combatant instanceof Hunter)
        {
            HunterAchievement hunA = new HunterAchievement(true);
            ((Hunter) combatant).take(hunA.returnAchievement());
        }
        else if(combatant instanceof Mage ){
            MageAchievement mA = new MageAchievement(true);
            ((Mage) combatant).take(mA.returnAchievement());
        }
        else if (combatant instanceof Warrior){
            WarriorAchivement wA = new WarriorAchivement(true);
            ((Warrior) combatant).take(wA.returnAchievement());
        }
        else{
            System.out.println("Oups, something wrong");
        }
    }
    @Override
    public void loose() {
        System.out.println("The game is over, you lost it.");
    }
}
