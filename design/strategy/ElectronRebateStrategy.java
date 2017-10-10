package design.strategy;

/**
 * 电子类图书折扣类
 * Created by MelloChan on 2017/10/10.
 */
public class ElectronRebateStrategy implements RebateStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("电子类图书折扣3%!");
        return booksPrice * 0.97;
    }
}
