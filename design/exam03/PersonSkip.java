package design.exam03;

/**
 * 人皮具体类
 * Created by MelloChan on 2017/10/19.
 */
public class PersonSkip extends Skip {
    private Wolf wolf;

    public PersonSkip(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public String getDescription() {
        return "披着人皮的" + wolf.getDescription();
    }

    @Override
    public void eat() {
        System.out.println(getDescription() + "吃羊");
    }
}
