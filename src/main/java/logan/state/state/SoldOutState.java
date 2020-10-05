package logan.state.state;

import logan.state.machine.Machine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldOutState implements State {

    private Machine machine;

    public SoldOutState(Machine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        log.error("You can’t insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        log.error("You can’t eject, you haven’t inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        log.error("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        log.info("No gumball dispensed");
    }
}
