package logan.factory.abstract_factory.pizza.impl;

import logan.factory.abstract_factory.ingredient.factory.PizzaIngredientFactory;
import logan.factory.abstract_factory.pizza.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        log.info("Preparing {}", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
