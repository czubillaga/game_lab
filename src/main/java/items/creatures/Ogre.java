package items.creatures;

import types.CreatureType;

public class Ogre extends Creature{

    private CreatureType creatureType;
    private int protection;

    public Ogre() {
        super(CreatureType.OGRE.toString(), CreatureType.OGRE);
        this.creatureType = CreatureType.OGRE;
        this.protection = CreatureType.OGRE.getProtection();
    }
}
