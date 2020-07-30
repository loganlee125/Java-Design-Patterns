package logan.decorator.coffee;

import logan.decorator.Beverage;
import lombok.ToString;

@ToString(callSuper = true)
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }

}
