package logan.state.state;

import logan.state.GumballMachine;

public abstract class State {

    protected final GumballMachine machine;

    public State(GumballMachine machine) {
        this.machine = machine;
    }

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();
}