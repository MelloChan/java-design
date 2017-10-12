package exam01.character;

import exam01.beheave.WeaponBehavior;

/**
 * Created by Administrator on 2017/10/12.
 * 角色抽象类
 */
public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

}
