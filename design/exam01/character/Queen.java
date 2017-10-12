package exam01.character;


/**
 * 皇后实现类
 * Created by Administrator on 2017/10/12.
 */
public class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("Queen:"+this.toString());
        weaponBehavior.useWeapon();
    }

}
