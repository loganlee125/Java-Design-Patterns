package logan.state.state;

import java.util.Random;
import logan.state.machine.Machine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private Machine machine;

    public HasQuarterState(Machine machine) {
        super();
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        log.error("You can’t insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        log.info("Quarter returned");
        machine.switchState(StateType.NO_QUARTER);
    }

    @Override
    public void turnCrank() {
        log.info("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && !machine.isEmpty()) {
            machine.switchState(StateType.WINNER);
        } else {
            machine.switchState(StateType.SOLD);
        }
    }

    @Override
    public void dispense() {
        log.error("No gumball dispensed");
    }

}
