package logan.factory.abstract_factory;

import logan.factory.abstract_factory.pizza.Pizza;
import logan.factory.abstract_factory.store.PizzaStore;
import logan.factory.abstract_factory.store.impl.ChicagoPizzaStore;
import logan.factory.abstract_factory.store.impl.NYPizzaStore;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        log.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("cheese");
        log.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("clam");
        log.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("clam");
        log.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("pepperoni");
        log.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("pepperoni");
        log.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("veggie");
        log.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("veggie");
        log.info("Joel ordered a {}", pizza);
    }
}
