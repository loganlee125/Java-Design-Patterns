package logan.strategy.pattern.impl;

import logan.strategy.pattern.AbstractDuck;
import logan.strategy.pattern.behavior.fly.FlyWithWings;
import logan.strategy.pattern.behavior.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedHeadDuck extends AbstractDuck {

    public RedHeadDuck() {
        super();
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

}
