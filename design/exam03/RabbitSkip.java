package design.exam03;

/**
 * 兔皮具体类
 * Created by MelloChan on 2017/10/19.
 */
public class RabbitSkip extends Skip {
    private Wolf wolf;

    public RabbitSkip(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public String getDescription() {
        return "披着兔皮的" + wolf.getDescription();
    }

    @Override
    public void eat() {
        System.out.println(getDescription() + "吃羊");
    }
}
