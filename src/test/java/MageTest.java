import characters.Player;
import characters.mage.Warlock;
import characters.mage.Wizard;
import characters.melee.Barbarian;
import org.junit.Before;
import org.junit.Test;
import types.CharacterType;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Warlock mage;
    Barbarian barbarian;

    @Before
    public void before() {
        mage = new Warlock();
        barbarian = new Barbarian();
    }

    @Test
    public void willUseCreatureForDefence() {
        barbarian.attack(mage);
        assertEquals(75, mage.getHealth());
    }

}
