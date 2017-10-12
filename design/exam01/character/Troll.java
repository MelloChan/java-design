package exam01.character;


/**
 * 妖怪实现类
 * Created by Administrator on 2017/10/12.
 */
public class Troll extends Character {


    @Override
    public void fight() {
        System.out.println("Torll:"+this.toString());
        weaponBehavior.useWeapon();
    }

}
