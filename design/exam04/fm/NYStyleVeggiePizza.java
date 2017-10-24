package design.exam04.fm;

/**
 * 披萨具体类
 * Created by MelloChan on 2017/10/24.
 */
public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
