package exam01.character;


/**
 * 骑士实现类
 * Created by Administrator on 2017/10/12.
 */
public class Knight extends Character {


    @Override
    public void fight() {
        System.out.println("Knight:"+this.toString());
        weaponBehavior.useWeapon();
    }

}
