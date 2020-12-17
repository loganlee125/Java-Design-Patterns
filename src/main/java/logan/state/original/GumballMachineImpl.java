package logan.state.original;

import logan.state.original.state.NoQuarter;
import logan.state.original.state.OutOfGumball;
import logan.state.original.state.State;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GumballMachineImpl implements GumballMachine {

    private int count;
    private State state;

    public GumballMachineImpl(int count) {
        this.count = count;
        this.state = isEmpty() ? new OutOfGumball() : new NoQuarter();
        log.info("Init state [{}] number Gumball [{}]", this.state.getClass().getSimpleName(), count);
    }

    @Override
    public boolean isEmpty() {
        return count <= 0;
    }

    @Override
    public void dispenseGumball() {
        this.state.dispenseGumball(this);
    }

    @Override
    public void subGumball(int gumball) {
        this.count--;
        log.info("Number gumball [{}]", this.count);
    }

    @Override
    public void insertQuarter() {
        log.info("insertQuarter");
        state.insertQuarter(this);
    }

    @Override
    public void ejectQuarter() {
        log.info("ejectQuarter");
        state.ejectQuarter(this);
    }

    @Override
    public void turnCrank() {
        log.info("turnCrank");
        state.turnCrank(this);
    }

    @Override
    public void setState(State state) {
        log.info("Current state [{}] new state [{}]", this.state.getClass().getSimpleName(), state.getClass().getSimpleName());
        this.state = state;
    }
}
