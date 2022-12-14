package test;

import com.isep.rpg.Hunter;
import com.isep.rpg.Warrior;
import com.isep.utils.ConsoleParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleParserTest {

    Hunter natan = new Hunter("Natan");
    Warrior sam = new Warrior("Sam");
    ConsoleParser cP = new ConsoleParser();
    @Test
    void getRewardsHunter() {
        cP.getRewards(natan);
        assertEquals(natan.getAttackPoint(),44);
    }
    @Test
    void getRewardsWarrior(){
        cP.getRewards(sam);
        assertEquals(sam.getAttackPoint(), 48);
    }
}