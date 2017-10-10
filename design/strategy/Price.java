package design.strategy;

/**
 * 价格类
 * 提供价格计算api给客户端
 * Created by MelloChan on 2017/10/10.
 */
public class Price {
    private RebateStrategy rebateStrategy;

    /**
     * 传入具体的价格策略
     *
     * @param rebateStrategy 具体策略
     */
    public Price(RebateStrategy rebateStrategy) {
        this.rebateStrategy = rebateStrategy;
    }

    /**
     * 返回折扣后的书籍价格
     *
     * @param price 书籍原始价格
     * @return 返回折扣后价格
     */
    public double getRebatePrice(double price) {
        return rebateStrategy.calcPrice(price);
    }

}
