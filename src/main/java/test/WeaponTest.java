package test;

import com.isep.rpg.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon hummer = new Weapon("Hummer", 5);
    @Test
    void getDamagePoint(){
        assertEquals(hummer.getDamagePoints(), 5);
    }


}