package logan.factory.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        log.info("pizza {}", pizza);

        pizza = store.orderPizza("veggie");
        log.info("pizza {}", pizza);

        pizza = store.orderPizza("pepperoni");
        log.info("pizza {}", pizza);

        pizza = store.orderPizza("clam");
        log.info("pizza {}", pizza);
    }
}
