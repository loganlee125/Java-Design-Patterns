package logan.strategy.original.impl;

import logan.strategy.original.AbstractDuck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedHeadDuck extends AbstractDuck {

    @Override
    public void display() {
        log.info("display [{}]", this.getClass().getSimpleName());
    }

}
