package logan.strategy.pattern.impl;

import logan.strategy.pattern.AbstractDuck;
import logan.strategy.pattern.behavior.fly.FlyNoWay;
import logan.strategy.pattern.behavior.quack.MuteQuack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoyDuck extends AbstractDuck {

    public DecoyDuck() {
        super();
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

}
