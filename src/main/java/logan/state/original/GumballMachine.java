package logan.state.original;

import logan.state.original.state.State;

public interface GumballMachine {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void setState(State state);

    boolean isEmpty();

    void dispenseGumball();

    void subGumball(int gumball);
}
