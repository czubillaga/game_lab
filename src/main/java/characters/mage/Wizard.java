package characters.mage;

import characters.Player;
import items.creatures.Creature;
import types.CharacterType;
import types.CreatureType;

public class Wizard extends Player {

    private Creature creature;
    private int protection;

    public Wizard() {
        super(CharacterType.MAGE);
        CreatureType creatureType = CharacterType.MAGE.getStartingCreatureType();
        this.creature = new Creature(creatureType.toString(), creatureType);
        this.protection = creature.getCreatureType().getProtection();
    }

    public Creature getCreature() {
        return creature;
    }

    @Override
    public void decreaseHealth(int i) {
        i -= this.protection;
        this.setHealth(this.getHealth() - i);
    }
}
