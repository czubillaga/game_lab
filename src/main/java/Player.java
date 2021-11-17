public class Player extends Character{
    public Weapon getWeapon() {
        return weapon;
    }

    private Weapon weapon;
    public Player(CharacterType characterType) {
        super(characterType);
        WeaponType startingWeaponType = characterType.getStartingWeaponType();
        weapon = new Weapon(startingWeaponType.stringify(), startingWeaponType);
        this.addToInventory(weapon);
    }
    public void attack(Character opponent) {
        opponent.decreaseHealth(this.getWeaponType().getAttackValue());
    }

    public void collect(Item item) {
        this.addToInventory(item);
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void equipWeapon(Weapon weapon){
        if(this.inventoryContains(weapon)) {
            this.setWeapon(weapon);
        }
    }

    public WeaponType getWeaponType() {
        return this.weapon.getWeaponType();
    }

}
