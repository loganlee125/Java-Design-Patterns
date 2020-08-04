package logan.factory.method;

import logan.factory.method.chicago.ChicagoPizzaStore;
import logan.factory.method.ny.NYPizzaStore;
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
