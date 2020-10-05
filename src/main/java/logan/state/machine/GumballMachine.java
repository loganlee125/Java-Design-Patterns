package logan.state.machine;

import logan.state.state.HasQuarterState;
import logan.state.state.NoQuarterState;
import logan.state.state.SoldOutState;
import logan.state.state.SoldState;
import logan.state.state.State;
import logan.state.state.StateType;
import logan.state.state.WinnerState;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GumballMachine implements Machine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        super();
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (this.count > 0) {
            switchState(StateType.NO_QUARTER);
        }
    }

    @Override
    public void switchState(StateType newState) {
        switch (newState) {
            case NO_QUARTER:
                this.state = noQuarterState;
                break;
            case HAS_QUARTER:
                this.state = hasQuarterState;
                break;
            case SOLD:
                this.state = soldState;
                break;
            case SOLD_OUT:
                this.state = soldOutState;
                break;
            case WINNER:
                this.state = winnerState;
            default:
                throw new IllegalArgumentException("State type is not support! " + newState);
        }
    }

    @Override
    public void releaseBall() {
        log.info("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return count <= 0;
    }

    @Override
    public void insertQuarter() {
        state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GumballMachine [");
        if (state != null) {
            builder.append("state=").append(state.getClass().getSimpleName()).append(", ");
        }
        builder.append("count=").append(count).append("]");
        return builder.toString();
    }

}
