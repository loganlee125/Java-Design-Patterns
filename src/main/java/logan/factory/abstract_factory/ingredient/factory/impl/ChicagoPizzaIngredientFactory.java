package logan.factory.abstract_factory.ingredient.factory.impl;

import java.util.List;
import logan.factory.abstract_factory.ingredient.cheese.Cheese;
import logan.factory.abstract_factory.ingredient.cheese.impl.MozzarellaCheese;
import logan.factory.abstract_factory.ingredient.clams.Clams;
import logan.factory.abstract_factory.ingredient.clams.impl.FrozenClams;
import logan.factory.abstract_factory.ingredient.dough.Dough;
import logan.factory.abstract_factory.ingredient.dough.impl.ThickCrustDough;
import logan.factory.abstract_factory.ingredient.factory.PizzaIngredientFactory;
import logan.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import logan.factory.abstract_factory.ingredient.pepperoni.impl.SlicedPepperoni;
import logan.factory.abstract_factory.ingredient.sauce.Sauce;
import logan.factory.abstract_factory.ingredient.sauce.impl.PlumTomatoSauce;
import logan.factory.abstract_factory.ingredient.veggies.Veggies;
import logan.factory.abstract_factory.ingredient.veggies.impl.BlackOlives;
import logan.factory.abstract_factory.ingredient.veggies.impl.Eggplant;
import logan.factory.abstract_factory.ingredient.veggies.impl.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return List.of(new BlackOlives(), new Spinach(), new Eggplant());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
