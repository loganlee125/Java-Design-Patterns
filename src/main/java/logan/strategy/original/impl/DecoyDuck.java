package logan.strategy.original.impl;

import logan.strategy.original.AbstractDuck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoyDuck extends AbstractDuck {

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

    @Override
    public void quack() {
        log.info("{} can not quack.", this.getClass().getSimpleName());
    }

    @Override
    public void fly() {
        log.info("{} can not fly.", this.getClass().getSimpleName());
    }

}
