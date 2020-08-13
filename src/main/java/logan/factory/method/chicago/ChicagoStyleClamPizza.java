package logan.factory.method.chicago;

import logan.factory.method.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    public void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
