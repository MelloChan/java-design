package design.exam04.sf;

/**
 * 披萨具体类
 * Created by MelloChan on 2017/10/24.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
