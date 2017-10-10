package design.strategy;

/**
 * 折扣类接口
 * Created by MelloChan on 2017/10/10.
 */
public interface RebateStrategy {
    /**
     * 计算图书价格
     *
     * @param booksPrice 原价
     * @return 折扣后价格
     */
    double calcPrice(double booksPrice);
}
