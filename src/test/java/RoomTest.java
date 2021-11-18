import characters.healer.Cleric;
import characters.mage.Wizard;
import characters.melee.Barbarian;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Barbarian barbarian;
    Wizard wizard;
    Cleric cleric;
    Room room;

    @Before
    public void before() {
        barbarian = new Barbarian();
        wizard = new Wizard();
        cleric = new Cleric();
        room = new Room();
    }

    @Test
    public void canAddPlayers() {
        room.addPlayer(barbarian);
        assertEquals(1, room.getPlayerCount());
    }
}
