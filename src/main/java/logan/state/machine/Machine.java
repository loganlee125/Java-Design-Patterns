package logan.state.machine;

import logan.state.state.StateType;

public interface Machine {

    void switchState(StateType newState);

    void releaseBall();

    boolean isEmpty();

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

}
