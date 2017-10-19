package design.exam03;

/**
 * 羊皮具体类
 * Created by MelloChan on 2017/10/19.
 */
public class SheepSkip extends Skip {
    private Wolf wolf;

    public SheepSkip(Wolf wolf) {
        this.wolf = wolf;
    }

    @Override
    public String getDescription() {
        return "披着羊皮的" + wolf.getDescription();
    }

    @Override
    public void eat() {
        System.out.println(getDescription() + "吃羊");
    }
}
