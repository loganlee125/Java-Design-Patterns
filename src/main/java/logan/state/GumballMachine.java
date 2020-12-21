package logan.state;

import logan.state.state.StateType;

public interface GumballMachine {

    void switchState(StateType newState);

    void releaseBall();

    boolean isEmpty();

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();
}
