package design.exam03;

/**
 * 抽象狼实现类
 * Created by MelloChan on 2017/10/19.
 */
public class BigWolf extends Wolf {
    public BigWolf() {
        description = "大灰狼";
    }

    @Override
    public void eat() {
        System.out.println("大灰狼吃羊~");
    }
}
