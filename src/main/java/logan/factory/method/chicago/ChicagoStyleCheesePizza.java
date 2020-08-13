package logan.factory.method.chicago;

import logan.factory.method.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
