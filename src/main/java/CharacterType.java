public enum CharacterType {
    MELEE(100, WeaponType.SWORD),
    MAGE(80, WeaponType.FIREBALL),
    HEALER(50, WeaponType.HEAL);

    private final int health;
    private final WeaponType startingWeaponType;

    CharacterType(int health, WeaponType startingWeaponType) {
        this.health = health;
        this.startingWeaponType = startingWeaponType;
    }

    public int getHealth() {
        return health;
    }

    public WeaponType getStartingWeaponType() {
        return this.startingWeaponType;
    }

}
