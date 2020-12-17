package logan.state.original.state;

import logan.state.original.GumballMachine;

public class GumballSold implements State {

    @Override
    public void dispenseGumball(GumballMachine machine) {
        machine.subGumball(1);
        if (machine.isEmpty()) {
            machine.setState(new OutOfGumball());
        } else {
            machine.setState(new NoQuarter());
        }
    }
}
