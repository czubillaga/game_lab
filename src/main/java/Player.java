public class Player extends Character{
    private Weapon weapon;
    public Player(int health) {
        super(health);
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
        this.setWeapon(weapon);
    }

    public WeaponType getWeaponType() {
        return this.weapon.getWeaponType();
    }
}
