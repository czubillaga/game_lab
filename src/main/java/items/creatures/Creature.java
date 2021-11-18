package items.creatures;

import items.Item;
import types.CreatureType;

public class Creature extends Item {

    private CreatureType creatureType;

    public Creature(String name, CreatureType creatureType) {
        super(name);
        this.creatureType = creatureType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }
}
