package logan.factory.method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        log.info("--- Making a {} ---", pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
