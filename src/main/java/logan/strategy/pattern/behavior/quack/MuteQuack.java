package logan.strategy.pattern.behavior.quack;

import logan.strategy.pattern.behavior.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("<< Silence >>");
    }

}
