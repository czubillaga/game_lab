import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Player player2;
    Item item;
    Weapon axe;
    Weapon sword;

    @Before
    public void before(){
        item = new Item("Coin");
        player = new Player(100);
        player2 = new Player(100);
        axe = new Weapon(WeaponType.AXE.stringify(), WeaponType.AXE);
        sword = new Weapon(WeaponType.SWORD.stringify(), WeaponType.SWORD);
    }
    @Test
    public void canAddItemToInventory(){
        player.addToInventory(item);
        assertEquals(1,player.getInventory().size());
    }
    @Test
    public void canCollect(){
        player.collect(item);
        assertEquals(1, player.getInventory().size());
    }
//    @Test
//    public void canDecreaseHealth(){
//        player.decreaseHealth(10);
//        assertEquals(90, player.getHealth());
//    }
    @Test
    public void canAttack(){
        player.equipWeapon(sword);
        player.attack(player2);
        assertEquals(90, player2.getHealth());
    }
    @Test
    public void canEquipWeapon(){
        player.equipWeapon(axe);
        assertEquals(WeaponType.AXE,player.getWeaponType());
    }
    @Test
    public void canAttackWithWeapon() {
        player.equipWeapon(axe);
        player.attack(player2);
        assertEquals(80, player2.getHealth());
    }
}
