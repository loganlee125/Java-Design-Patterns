package logan.decorator;

import lombok.ToString;

@ToString(callSuper = true)
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
