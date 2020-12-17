package logan.state.original.state;

import logan.state.original.GumballMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface State {

    static final Logger log = LoggerFactory.getLogger(State.class);

    default void insertQuarter(GumballMachine machine) {
        defaultAction();
    }

    default void ejectQuarter(GumballMachine machine) {
        defaultAction();
    }

    default void turnCrank(GumballMachine machine) {
        defaultAction();
    }

    default void dispenseGumball(GumballMachine machine) {
        defaultAction();
    }

    private void defaultAction() {
        log.error("Invalid action");
    }
}
