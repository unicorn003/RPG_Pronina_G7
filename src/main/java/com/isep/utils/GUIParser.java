package com.isep.utils;

import com.isep.rpg.Combatant;

import java.util.List;

public class GUIParser implements InputParser{
    @Override
    public String askName() {
        String name = "Voila";
        return name;
    }

    @Override
    public void sayWelcome() {

    }

    @Override
    public void startGame() {

    }

    @Override
    public void showHeros(List<Combatant> heros) {

    }
    public void showEnemies(List<Combatant> enemies){

    }
    public void askForFight(){

    }
}
