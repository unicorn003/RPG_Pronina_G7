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

        int ixHero = 0;

        // Boucle de jeu
        while (true) {

            displayStatus(heros, enemies);

            Combatant goodOne = heros.get(ixHero);
            Combatant badOne = enemies.get(0);

            // Attaque de l'ennemi
            displayMessage("Le méchant " + badOne.getName()
                    + " attaque le gentil " + goodOne.getName() + "...");
            badOne.fight(goodOne);
            if (goodOne.getHealthPoint() <= 0) {
                displayMessage
                        ("Le pauvre " + goodOne.getName() + " a été vaincu...");
                heros.remove(ixHero);
                ixHero--; // Correction: évite que le suivant perde son tour
            } else {

                // Riposte du gentil, s'il n'est pas vaincu
                displayMessage("Le gentil " + goodOne.getName()
                        + " attaque le méchant " + badOne.getName() + "...");
                goodOne.fight(badOne);
                if (badOne.getHealthPoint() <= 0) {
                    displayMessage("Bravo, " + goodOne.getName()
                            + " a vaincu " + badOne.getName() + " !!!");
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
                break;
            }

            // Au tour du héro suivant
            ixHero = (ixHero + 1) % heros.size();
        }
    }


    private final InputParser inputParser;

    private final List<Combatant> heros;
    private final List<Combatant> enemies;




    public void displayStatus(List<Combatant> h, List<Combatant> e) {
        System.out.println("#########################");
        inputParser.showHeros(heros);
        inputParser.showEnemies(enemies);
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}

