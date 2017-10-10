package design.strategy;

/**
 * 书籍购买客户端
 * Created by MelloChan on 2017/10/10.
 */
public class Clien {
    public static void main(String[] args) {
        RebateStrategy rebateStrategy = new ComputerRebateStrategy();
        Price price = new Price(rebateStrategy);
        double computerPrice = price.getRebatePrice(100);
        System.out.println("最终价格:" + computerPrice);

        rebateStrategy = new ElectronRebateStrategy();
        price = new Price(rebateStrategy);
        double electronPrice = price.getRebatePrice(100);
        System.out.println("最终价格:" + electronPrice);

        rebateStrategy = new ChildRebateStrategy();
        price = new Price(rebateStrategy);
        double childPrice = price.getRebatePrice(100);
        System.out.println("最终价格:" + childPrice);

        rebateStrategy = new NoRebateStrategy();
        price = new Price(rebateStrategy);
        double noRebatePrice = price.getRebatePrice(100);
        System.out.println("最终价格:" + noRebatePrice);

    }
}
