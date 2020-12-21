package logan.state.state;

import logan.state.GumballMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldOutState extends State {

    public SoldOutState(GumballMachine machine) {
        super(machine);
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

    @Override
    public void refill() {
        machine.switchState(StateType.NO_QUARTER);
    }
}
