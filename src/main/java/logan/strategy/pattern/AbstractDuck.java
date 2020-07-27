package logan.strategy.pattern;

import logan.strategy.pattern.behavior.FlyBehavior;
import logan.strategy.pattern.behavior.QuackBehavior;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public abstract class AbstractDuck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        log.info("All ducks float, even decoys!");
    }
}
