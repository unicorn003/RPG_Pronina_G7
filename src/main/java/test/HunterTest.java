package test;

import com.isep.rpg.Combatant;
import com.isep.rpg.Dragon;
import com.isep.rpg.Hunter;

import org.junit.jupiter.api.Assertions.*;
import org.junit.Assert.*;
import org.testng.annotations.Test;

class HunterTest {
    public Combatant claire = new Hunter("Claire");
    Combatant tors = new Dragon("Tors");
    claire.fight(tors);

}