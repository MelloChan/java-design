package design.exam07.adapter;

/**
 * 火鸡具体类
 * Created by MelloChan on 2017/11/23.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
