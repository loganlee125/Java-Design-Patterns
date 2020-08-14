package logan.adapter.ducks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck implements Duck {
    public void quack() {
        log.info("Quack");
    }

    public void fly() {
        log.info("I'm flying");
    }
}
