package logan.factory.method;

import logan.factory.method.chicago.ChicagoStyleCheesePizza;
import logan.factory.method.chicago.ChicagoStyleClamPizza;
import logan.factory.method.chicago.ChicagoStylePepperoniPizza;
import logan.factory.method.chicago.ChicagoStyleVeggiePizza;
import logan.factory.method.ny.NYStyleCheesePizza;
import logan.factory.method.ny.NYStyleClamPizza;
import logan.factory.method.ny.NYStylePepperoniPizza;
import logan.factory.method.ny.NYStyleVeggiePizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            log.error("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
