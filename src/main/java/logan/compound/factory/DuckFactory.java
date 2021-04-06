package logan.compound.factory;

import logan.compound.models.DuckCall;
import logan.compound.models.MallardDuck;
import logan.compound.Quackable;
import logan.compound.models.RedHeadDuck;
import logan.compound.models.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

}
