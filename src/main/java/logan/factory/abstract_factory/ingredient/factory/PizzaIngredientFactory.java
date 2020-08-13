package logan.factory.abstract_factory.ingredient.factory;

import java.util.List;
import logan.factory.abstract_factory.ingredient.cheese.Cheese;
import logan.factory.abstract_factory.ingredient.clams.Clams;
import logan.factory.abstract_factory.ingredient.dough.Dough;
import logan.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import logan.factory.abstract_factory.ingredient.sauce.Sauce;
import logan.factory.abstract_factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public List<Veggies> createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
