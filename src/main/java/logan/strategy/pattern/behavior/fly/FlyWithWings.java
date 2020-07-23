package logan.strategy.pattern.behavior.fly;

import logan.strategy.pattern.behavior.FlyBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I’m flying!!");
    }

}
