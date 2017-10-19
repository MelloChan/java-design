package design.exam03;

/**
 * 客户端测试类
 * Created by MelloChan on 2017/10/19.
 */
public class Main {
    public static void main(String[] args) {
        Wolf wolf = new BigWolf();
        wolf = new SheepSkip(wolf);
        wolf.eat();

        Wolf wolf1 = new BigWolf();
        wolf1 = new PersonSkip(wolf1);
        wolf1.eat();
    }
}
