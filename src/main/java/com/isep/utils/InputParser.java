package com.isep.utils;

import com.isep.rpg.Combatant;

import java.util.List;

public interface InputParser {
    public void askName();
    public void sayWelocome();
    public void startGame();
    public void showHeros(List<Combatant> heros);


}
