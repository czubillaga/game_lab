package types;

public enum CharacterType {
    MELEE(100, WeaponType.SWORD, null),
    MAGE(80, WeaponType.FIREBALL, CreatureType.GOBLIN),
    HEALER(50, WeaponType.HEAL, null);

    private final int health;
    private final WeaponType startingWeaponType;
    private final CreatureType startingCreatureType;

    CharacterType(int health, WeaponType startingWeaponType, CreatureType startingCreatureType) {
        this.health = health;
        this.startingWeaponType = startingWeaponType;
        this.startingCreatureType = startingCreatureType;
    }

    public int getHealth() {
        return health;
    }

    public WeaponType getStartingWeaponType() {
        return this.startingWeaponType;
    }

    public CreatureType getStartingCreatureType() {
        return startingCreatureType;
    }
}
