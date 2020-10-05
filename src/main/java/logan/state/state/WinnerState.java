package logan.state.state;

import logan.state.machine.Machine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinnerState implements State {

    private Machine machine;

    public WinnerState(Machine machine) {
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
        System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
        machine.releaseBall();
        if (machine.isEmpty()) {
            machine.switchState(StateType.SOLD_OUT);
        } else {
            machine.releaseBall();
            if (!machine.isEmpty()) {
                machine.switchState(StateType.NO_QUARTER);
            } else {
                log.error("Oops, out of gumballs!");
                machine.switchState(StateType.SOLD_OUT);
            }
        }
    }
}
