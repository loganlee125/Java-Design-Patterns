package logan.factory.abstract_factory.store.impl;

import logan.factory.abstract_factory.ingredient.factory.PizzaIngredientFactory;
import logan.factory.abstract_factory.ingredient.factory.impl.NYPizzaIngredientFactory;
import logan.factory.abstract_factory.pizza.Pizza;
import logan.factory.abstract_factory.pizza.impl.CheesePizza;
import logan.factory.abstract_factory.pizza.impl.ClamPizza;
import logan.factory.abstract_factory.pizza.impl.PepperoniPizza;
import logan.factory.abstract_factory.pizza.impl.VeggiePizza;
import logan.factory.abstract_factory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
