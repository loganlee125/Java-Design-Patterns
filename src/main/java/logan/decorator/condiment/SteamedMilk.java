package logan.decorator.condiment;

import logan.decorator.Beverage;
import logan.decorator.CondimentDecorator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
