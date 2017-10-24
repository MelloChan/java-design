package design.exam04.fm;

/**
 * 抽象披萨店
 * Created by MelloChan on 2017/10/24.
 */
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);
    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
