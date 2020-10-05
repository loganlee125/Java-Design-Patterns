package logan.state.state;

import logan.state.machine.Machine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldState implements State {

    private Machine machine;

    public SoldState(Machine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        log.error("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        log.error("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        log.error("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.isEmpty()) {
            machine.switchState(StateType.NO_QUARTER);
        } else {
            log.info("Oops, out of gumballs!");
            machine.switchState(StateType.SOLD_OUT);
        }
    }
}
