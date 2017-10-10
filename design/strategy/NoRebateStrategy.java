package design.strategy;

/**
 * 未提供折扣类
 * Created by MelloChan on 2017/10/10.
 */
public class NoRebateStrategy implements RebateStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("此类图片未提供折扣");
        return booksPrice;
    }
}
