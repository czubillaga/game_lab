import characters.Player;
import characters.mage.Wizard;
import items.Item;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import types.CharacterType;
import types.WeaponType;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Player player2;
    Wizard mage;
    Item item;
    Weapon axe;
    Weapon sword;

    @Before
    public void before(){
        item = new Item("Coin");
        player = new Player(CharacterType.MELEE);
        player2 = new Player(CharacterType.MELEE);
        axe = new Weapon(WeaponType.AXE.stringify(), WeaponType.AXE);
        sword = new Weapon(WeaponType.SWORD.stringify(), WeaponType.SWORD);
        mage = new Wizard();
    }
    @Test
    public void canAddItemToInventory(){
        player.addToInventory(item);
        assertEquals(2,player.getInventory().size());
    }
    @Test
    public void canCollect(){
        player.collect(item);
        assertEquals(2, player.getInventory().size());
    }
//    @Test
//    public void canDecreaseHealth(){
//        player.decreaseHealth(10);
//        assertEquals(90, player.getHealth());
//    }
    @Test
    public void canAttack(){
        player.collect(sword);
        player.equipWeapon(sword);
        player.attack(player2);
        assertEquals(90, player2.getHealth());
    }
    @Test
    public void canEquipWeapon(){
        player.collect(axe);
        player.equipWeapon(axe);
        assertEquals(WeaponType.AXE,player.getWeaponType());
    }
    @Test
    public void canAttackWithWeapon() {
        player.collect(axe);
        player.equipWeapon(axe);
        player.attack(player2);
        assertEquals(80, player2.getHealth());
    }
    @Test
    public void willOnlyEquipWeaponsInInventory() {
        player.equipWeapon(axe);
        assertEquals(WeaponType.SWORD, player.getWeapon().getWeaponType());
    }

    @Test
    public void startsWithWeapon() {
        assertEquals(WeaponType.SWORD, player.getWeaponType());
    }

    @Test
    public void willBeProtectedIfMage() {
        player.attack(mage);
        assertEquals(75, mage.getHealth());
    }
}
