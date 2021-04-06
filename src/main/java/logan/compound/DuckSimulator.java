package logan.compound;

import logan.compound.factory.AbstractDuckFactory;
import logan.compound.factory.CountingDuckFactory;
import logan.compound.models.goose.Goose;
import logan.compound.models.goose.GooseAdapter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckSimulator {

    public static void main(String[] args) {
        var simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulator(duckFactory);
    }

    void simulator(AbstractDuckFactory duckFactory) {
        var redHeadDuck = duckFactory.createRedHeadDuck();
        var duckCall = duckFactory.createDuckCall();
        var rubberDuck = duckFactory.createRubberDuck();
        var gooseDuck = new GooseAdapter(new Goose());

        log.info("Duck Simulator: With Composite - Flock");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallardDucks = new Flock();
        flockOfMallardDucks.add(duckFactory.createMallardDuck());
        flockOfMallardDucks.add(duckFactory.createMallardDuck());
        flockOfMallardDucks.add(duckFactory.createMallardDuck());
        flockOfMallardDucks.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallardDucks);

        log.info("Duck Simulator: Whole flock of ducks");
        simulator(flockOfDucks);
        log.info("Duck Simulator: Mallard ducks");
        simulator(flockOfMallardDucks);

        log.info("The ducks quacked {} times", QuackCounter.getNumberOfQuacks());
    }

    void simulator(Quackable quackable) {
        quackable.quack();
    }
}
