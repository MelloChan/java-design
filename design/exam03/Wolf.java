package design.exam03;

/**
 * 抽象狼类
 * Created by MelloChan on 2017/10/19.
 */
public abstract class Wolf {
    String description = "抽象狼";

    public String getDescription() {
        return description;
    }

    public abstract void eat();
}
