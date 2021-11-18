import behaviors.IContent;
import characters.healer.Cleric;
import characters.mage.Wizard;
import characters.melee.Barbarian;
import characters.melee.Dwarf;
import items.Item;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Barbarian barbarian;
    Wizard wizard;
    Cleric cleric;
    Room room;
    Item treasure;
    Dwarf dwarf;

    @Before
    public void before() {
        barbarian = new Barbarian();
        wizard = new Wizard();
        cleric = new Cleric();
        room = new Room();
        treasure =  new Item("Coin");
        dwarf = new Dwarf();
    }

    @Test
    public void canAddPlayers() {
        room.addPlayer(barbarian);
        assertEquals(1, room.getPlayerCount());
    }

    @Test
    public void canAddContents() {
        room.addContent(treasure);
        assertEquals(1, room.getContents().size());
    }

    @Test
    public void canContainEntitiesAndTreasure() {
        room.addContent(dwarf);
        room.addContent(treasure);
        assertEquals(2, room.getContents().size());
    }
}
