package logan.factory.simple;

import logan.factory.simple.impl.CheesePizza;
import logan.factory.simple.impl.ClamPizza;
import logan.factory.simple.impl.PepperoniPizza;
import logan.factory.simple.impl.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
