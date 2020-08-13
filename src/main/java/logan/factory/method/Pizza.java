package logan.factory.method;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        log.info("Preparing " + name);
        log.info("Tossing dough...");
        log.info("Adding sauce...");
        log.info("Adding toppings: ");
        for (int i = 0, len = toppings.size(); i < len; i++) {
            log.info("   {}", toppings.get(i));
        }
    }

    public void bake() {
        log.info("Bake for 25 minutes at 350");
    }

    public void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    public void box() {
        log.info("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append('\n');
        display.append(sauce).append('\n');
        for (int i = 0, len = toppings.size(); i < len; i++) {
            display.append(toppings.get(i)).append('\n');
        }
        return display.toString();
    }
}
