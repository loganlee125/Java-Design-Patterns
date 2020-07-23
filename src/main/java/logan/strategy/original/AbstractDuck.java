package logan.strategy.original;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractDuck {

    public void quack() {
        log.info("quack");
    }

    public void swim() {
        log.info("swim");
    }

    public void fly() {
        log.info("fly");
    }

    public abstract void display();
}
