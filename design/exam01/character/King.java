package exam01.character;


/**
 * 国王实现类
 * Created by Administrator on 2017/10/12.
 */
public class King extends Character {
    @Override
    public void fight() {
        System.out.println("King:"+this.toString());
        weaponBehavior.useWeapon();
    }

}
