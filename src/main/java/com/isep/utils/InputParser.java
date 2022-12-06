package com.isep.utils;

import com.isep.rpg.Combatant;

import java.util.List;

public interface InputParser {
    void askName();
    void sayWelocome();
    void startGame();
    void showHeros(List<Combatant> heros);
    void showEnemies(List<Combatant> enemies);
    void askForFight();


}
