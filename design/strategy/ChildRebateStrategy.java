package design.strategy;

/**
 * 儿童类图书折扣类
 * Created by MelloChan on 2017/10/10.
 */
public class ChildRebateStrategy implements RebateStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("儿童类图书实习一元折扣");
        return booksPrice - 1;
    }
}
