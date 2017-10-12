package exam01.beheave;

/**
 * 匕首具体类
 * Created by Administrator on 2017/10/12.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用匕首进行战斗");
    }
}
