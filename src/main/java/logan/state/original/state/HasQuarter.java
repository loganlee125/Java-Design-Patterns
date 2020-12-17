package logan.state.original.state;

import logan.state.original.GumballMachine;

public class HasQuarter implements State {

    @Override
    public void ejectQuarter(GumballMachine machine) {
        machine.setState(new NoQuarter());
    }

    @Override
    public void turnCrank(GumballMachine machine) {
        machine.setState(new GumballSold());
        machine.dispenseGumball();
    }
}
