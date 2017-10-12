package exam01.beheave;

/**
 * 斧头具体类
 * Created by Administrator on 2017/10/12.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头进行战斗");
    }
}
