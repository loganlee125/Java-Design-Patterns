package logan.decorator.coffee;

import logan.decorator.Beverage;
import lombok.ToString;

@ToString(callSuper = true)
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
