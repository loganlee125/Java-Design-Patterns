package logan.state.state;

import logan.state.GumballMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertQuarter() {
        log.info("You inserted a quarter");
        machine.switchState(StateType.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        log.error("You haven’t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        log.error("You turned, but there’s no quarter");
    }

    @Override
    public void dispense() {
        log.error("You need to pay first");
    }
}
