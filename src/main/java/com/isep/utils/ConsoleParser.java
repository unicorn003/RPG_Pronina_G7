package com.isep.utils;

import com.isep.rpg.Combatant;

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
    public void startGame() {

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
        return 0;
    }

    @Override
    public void win() {
        System.out.println("Congratulations. You have won this game. Chose your hero to take an achievement");
    }

    @Override
    public void loose() {
        System.out.println("The game is over, you lost it.");
    }
}
