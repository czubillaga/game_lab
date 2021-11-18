package items.creatures;

import types.CreatureType;

public class Dragon extends Creature{

    private CreatureType creatureType;
    private int protection;

    public Dragon() {
        super(CreatureType.DRAGON.toString(), CreatureType.DRAGON);
        this.creatureType = CreatureType.DRAGON;
        this.protection = CreatureType.DRAGON.getProtection();
    }
}
