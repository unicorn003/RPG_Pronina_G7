package test;

import com.isep.rpg.HealerAchievement;
import com.isep.rpg.Potion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealerAchievementTest {
    HealerAchievement hA = new HealerAchievement(false);
    private Potion superPotion = new Potion("superPotion", 20);
    @Test
    public void healerAchievementTest(){
        assertEquals(hA.returnAchievement().getEffect(), superPotion.getEffect());
    }

}