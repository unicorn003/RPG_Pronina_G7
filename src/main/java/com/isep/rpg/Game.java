package com.isep.rpg;

import com.isep.utils.ConsoleParser;
import com.isep.utils.InputParser;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Game(InputParser inputParser) {

        this.inputParser = inputParser;

        heros = new ArrayList<>();
        //
        Hero ronal = new Warrior("Ronal");
        ronal.take( new Weapon("knife", 1) );
        heros.add(ronal);
        //
        Hero conan = new Warrior("Conan");
        conan.take( new Weapon("sword", 2) );
        heros.add(conan);
        //
        Hero max = new Mage("Max");
        max.take(new Potion( "frog eyes", 3));
        heros.add(max);
        //
        Hero greg = new Healer("Greg");
        greg.take(new Potion("Mountain water", 2));
        heros.add(greg);
        //
        Hero mike = new Hunter("Mike");
        mike.take(new Weapon("Axe", 4));
        heros.add(mike);


        // Il faut normalement 5 ennemis de types différents...
        enemies = new ArrayList<>();
        enemies.add( new Dragon("Dracofeu") );
        enemies.add( new Dragon("Smaug") );
        enemies.add(new Dragon("Ukrainian iron ore"));
        enemies.add(new Dragon("Polish talking"));
    }


    public void start() {
        inputParser.sayWelcome();
        this.displayStatus();
        int ixHero = 0;


        while (true) {
            displayStatus();
            Combatant goodOne = heros.get(ixHero);
            Combatant badOne = enemies.get(0);

            displayMessage("Enemy  " + badOne.getName()
                    + " attack " + goodOne.getName() + "...");
            badOne.fight(goodOne);
            if (goodOne.getHealthPoint() <= 0) {
                heros.remove(ixHero);
                ixHero--;
            } else {
                if (badOne.getHealthPoint() <= 0) {
                    enemies.remove(0);
                }
            }

            // Tests de fin du jeu
            if (heros.size() == 0) {
                inputParser.loose();
                break;
            }
            if (enemies.size() == 0) {
                inputParser.win();
                for (Combatant c: heros){
                    inputParser.getRewards(c);
                }
                break;
            }
            ixHero = (ixHero + 1) % heros.size();
        }
    }


    private final InputParser inputParser;

    private final List<Combatant> heros;
    private final List<Combatant> enemies;




    public void displayStatus() {
        System.out.println("#########################");
        inputParser.showHeros(heros);
        inputParser.showEnemies(enemies);
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}

