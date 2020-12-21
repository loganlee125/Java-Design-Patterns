package logan.state.state;

import logan.state.GumballMachine;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StateFactory {

    public static final State createState(StateType type, GumballMachine machine) {
        switch (type) {
        case HAS_QUARTER:
            return new HasQuarterState(machine);
        case NO_QUARTER:
            return new NoQuarterState(machine);
        case SOLD:
            return new SoldState(machine);
        case SOLD_OUT:
            return new SoldOutState(machine);
        case WINNER:
            return new WinnerState(machine);
        default:
            throw new IllegalArgumentException("State type is not support! " + type);
        }

    }

}
