package homeWork.game.warriors;

import homeWork.game.weapon.WeaponWarrior;

public abstract class Gladiator {
    public abstract int attack();
    public abstract void protection(int damage);
    public abstract int getHealth();
    public abstract int getPower();
    public abstract int getDamage();
    public abstract int strength();

    protected WeaponWarrior weaponWarrior;

    public void changeWeapon(WeaponWarrior weaponWarrior) {
        this.weaponWarrior = weaponWarrior;
    }

}
