package logan.factory.abstract_factory.pizza;

import java.util.List;
import logan.factory.abstract_factory.ingredient.cheese.Cheese;
import logan.factory.abstract_factory.ingredient.clams.Clams;
import logan.factory.abstract_factory.ingredient.dough.Dough;
import logan.factory.abstract_factory.ingredient.pepperoni.Pepperoni;
import logan.factory.abstract_factory.ingredient.sauce.Sauce;
import logan.factory.abstract_factory.ingredient.veggies.Veggies;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Pizza {

    @Getter
    @Setter
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggies> veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        log.info("Bake for 25 minutes at 350");
    }

    public void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    public void box() {
        log.info("Place pizza in official PizzaStore box");
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough).append('\n');
        }
        if (sauce != null) {
            result.append(sauce).append('\n');
        }
        if (cheese != null) {
            result.append(cheese).append('\n');
        }
        if (veggies != null) {
            for (int i = 0, len = veggies.size(); i < len; i++) {
                result.append(veggies.get(i));
                if (i < len - 1) {
                    result.append(", ");
                }
            }
            result.append('\n');
        }
        if (clam != null) {
            result.append(clam).append('\n');
        }
        if (pepperoni != null) {
            result.append(pepperoni).append('\n');
        }
        return result.toString();
    }
}
