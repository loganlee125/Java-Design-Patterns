package logan.state.original.state;

import logan.state.original.GumballMachine;

public class NoQuarter implements State {

    @Override
    public void insertQuarter(GumballMachine machine) {
        machine.setState(new HasQuarter());
    }

}
