package logan.decorator.coffee;

import logan.decorator.Beverage;
import lombok.ToString;

@ToString(callSuper = true)
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
