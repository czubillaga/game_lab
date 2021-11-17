import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    private Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.AXE.stringify(), WeaponType.AXE);
    }

    @Test
    public void canReturnAttackValue() {
        assertEquals(20, weapon.getAttackValue());
    }
}
