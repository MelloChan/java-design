package design.exam04.fm;

/**
 * 纽约披萨店
 * Created by MelloChan on 2017/10/24.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza=null;
        switch (item){
            case"cheese":pizza=new NYStyleCheesePizza();break;
            case"veggie":pizza=new NYStyleVeggiePizza();break;
            case"clam":pizza=new NYStyleClamPizza();break;
            case"pepperoni":pizza=new NYStylePepperoniPizza();break;
            default:break;
        }
        return pizza;
    }
}
