package test;

import com.isep.rpg.Combatant;
import com.isep.rpg.Dragon;
import com.isep.rpg.Food;
import com.isep.rpg.Hunter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HunterTest {
    Combatant claire = new Hunter("Claire");
    Combatant tors = new Dragon("Tors") ;
    Food potato = new Food("Potato", 3);
    @Test
    void fightTest() {
        claire.fight(tors);
        assertEquals(claire.getHealthPoint(), 16);
    }
    @Test
    void takeTest(){
        claire.eat(potato);
        assertEquals(claire.getHealthPoint(), 18);
    }
}