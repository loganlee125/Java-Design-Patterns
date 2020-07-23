package logan.strategy.pattern;

import java.util.List;

import logan.strategy.pattern.impl.DecoyDuck;
import logan.strategy.pattern.impl.MallardDuck;
import logan.strategy.pattern.impl.RedHeadDuck;
import logan.strategy.pattern.impl.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        List<AbstractDuck> ducks = List.of(new DecoyDuck(), new MallardDuck(), new RedHeadDuck(), new RubberDuck());
        ducks.forEach(d -> {
            d.display();
            d.performFly();
            d.performQuack();
            d.swim();
        });
    }

}
