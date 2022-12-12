package com.isep.utils;

import com.isep.rpg.Combatant;

import java.util.List;

public interface InputParser {
    String askName();
    void sayWelcome();
    void startGame();
    void showHeros(List<Combatant> heros);
    void showEnemies(List<Combatant> enemies);
    void askForFight();
    void win();
    void loose();


}
