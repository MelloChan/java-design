package design.exam04.sf;

/**
 * 简单披萨工厂 配置披萨口味
 * Created by MelloChan on 2017/10/24.
 */
public class SimplePizzaFactory {
    public Pizza createPizze(String type){
        Pizza pizza=null;
        switch (type){
            case "cheese":pizza=new CheesePizza();break;
            case"pepperoni":pizza=new PepperoniPizza();break;
            case"clam":pizza=new CheesePizza();break;
            case"veggie":pizza=new VeggiePizza();break;
            default:break;
        }
        return pizza;
    }

}
