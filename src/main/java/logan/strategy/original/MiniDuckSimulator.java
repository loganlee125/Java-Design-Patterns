package logan.strategy.original;

import java.util.List;

import logan.strategy.original.impl.DecoyDuck;
import logan.strategy.original.impl.MallardDuck;
import logan.strategy.original.impl.RedHeadDuck;
import logan.strategy.original.impl.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        List<AbstractDuck> ducks = List.of(new DecoyDuck(), new MallardDuck(), new RedHeadDuck(), new RubberDuck());
        ducks.forEach(d -> {
            d.display();
            d.fly();
            d.quack();
            d.swim();
        });
    }

}
