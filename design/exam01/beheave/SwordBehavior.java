package exam01.beheave;

/**
 * 宝剑具体类
 * Created by Administrator on 2017/10/12.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用大宝剑进行战斗");
    }
}
