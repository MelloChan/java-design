package design.exam04.sf;

import java.util.ArrayList;
import java.util.List;

/**
 * head first 简单工厂方法demo
 * Created by MelloChan on 2017/10/24.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
