package logan.strategy.pattern.impl;

import logan.strategy.pattern.AbstractDuck;
import logan.strategy.pattern.behavior.fly.FlyWithWings;
import logan.strategy.pattern.behavior.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        super();
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

}
