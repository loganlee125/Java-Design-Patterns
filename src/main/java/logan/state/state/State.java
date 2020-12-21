package logan.state.state;

import logan.state.GumballMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class State {

    protected final GumballMachine machine;

    public State(GumballMachine machine) {
        this.machine = machine;
    }

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

    public void refill() {
        log.info("No need to reset state at current state [{}]", this.getClass().getSimpleName());
    }
}