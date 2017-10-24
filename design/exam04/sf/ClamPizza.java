package design.exam04.sf;

/**
 * 披萨具体类
 * Created by MelloChan on 2017/10/24.
 */
public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
