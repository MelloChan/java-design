package design.exam07.adapter;

/**
 * 测试驱动类
 * Created by MelloChan on 2017/11/23.
 */
public class Main {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);

        System.out.println("The TurketAdapter says:");
        adapter.quack();
        adapter.fly();
    }
}
