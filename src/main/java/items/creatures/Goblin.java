package items.creatures;

import types.CreatureType;

public class Goblin extends Creature{

    private CreatureType creatureType;
    private int protection;

    public Goblin() {
        super(CreatureType.GOBLIN.toString(), CreatureType.GOBLIN);
        this.creatureType = CreatureType.GOBLIN;
        this.protection = CreatureType.GOBLIN.getProtection();
    }
}
