package design.strategy;

/**
 * 计算机类图书折扣类
 * Created by MelloChan on 2017/10/10.
 */
public class ComputerRebateStrategy implements RebateStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("计算机类图书折扣7%!");
        return booksPrice * 0.93;
    }
}
