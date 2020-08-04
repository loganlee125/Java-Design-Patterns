package logan.factory.abstract_factory.ingredient.factory.impl;

import java.util.List;
import logan.factory.abstract_factory.ingredient.cheese.Cheese;
import logan.factory.abstract_factory.ingredient.cheese.impl.ReggianoCheese;
import logan.factory.abstract_factory.ingredient.clams.Clams;
import logan.factory.abstract_factory.ingredient.clams.impl.FreshClams;
import logan.factory.abstract_factory.ingredient.dough.Dough;
import logan.factory.abstract_factory.ingredient.dough.impl.ThinCrustDough;
import logan.factory.abstract_factory.ingredient.factory.PizzaIngredientFactory;
import logan.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import logan.factory.abstract_factory.ingredient.pepperoni.impl.SlicedPepperoni;
import logan.factory.abstract_factory.ingredient.sauce.Sauce;
import logan.factory.abstract_factory.ingredient.sauce.impl.MarinaraSauce;
import logan.factory.abstract_factory.ingredient.veggies.Veggies;
import logan.factory.abstract_factory.ingredient.veggies.impl.Garlic;
import logan.factory.abstract_factory.ingredient.veggies.impl.Mushroom;
import logan.factory.abstract_factory.ingredient.veggies.impl.Onion;
import logan.factory.abstract_factory.ingredient.veggies.impl.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
