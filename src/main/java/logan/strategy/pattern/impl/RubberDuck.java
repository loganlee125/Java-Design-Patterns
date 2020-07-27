package logan.strategy.pattern.impl;

import logan.strategy.pattern.AbstractDuck;
import logan.strategy.pattern.behavior.fly.FlyNoWay;
import logan.strategy.pattern.behavior.quack.Squeak;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        super();
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

}
