package items;

import types.WeaponType;

public class Weapon extends Item{
    private WeaponType weaponType;

    public Weapon(String name, WeaponType weaponType) {
        super(name);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getAttackValue() {
        return this.getWeaponType().getAttackValue();
    }

}
