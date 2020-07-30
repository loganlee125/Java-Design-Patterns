package logan.decorator.coffee;

import logan.decorator.Beverage;
import lombok.ToString;

@ToString(callSuper = true)
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
