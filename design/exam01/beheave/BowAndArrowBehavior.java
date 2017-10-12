package exam01.beheave;

/**
 * 弓箭具体类
 * Created by Administrator on 2017/10/12.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用弓箭进行战斗");
    }
}
