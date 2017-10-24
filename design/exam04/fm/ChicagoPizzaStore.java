package design.exam04.fm;

/**
 * 芝加哥披萨店
 * Created by MelloChan on 2017/10/24.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza=null;
        switch (item){
            case"cheese":pizza=new ChicagoStyleCheesePizza();break;
            case"veggie":pizza=new ChicagoStyleVeggiePizza();break;
            case"clam":pizza=new ChicagoStyleClamPizza();break;
            case"pepperoni":pizza=new ChicagoStylePepperoniPizza();break;
            default:break;
        }
        return pizza;
    }
}
