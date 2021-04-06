package logan.compound.factory;

import logan.compound.models.DuckCall;
import logan.compound.models.MallardDuck;
import logan.compound.QuackCounter;
import logan.compound.Quackable;
import logan.compound.models.RedHeadDuck;
import logan.compound.models.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
