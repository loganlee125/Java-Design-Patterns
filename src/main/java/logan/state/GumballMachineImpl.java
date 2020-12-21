package logan.state;

import logan.state.state.State;
import logan.state.state.StateFactory;
import logan.state.state.StateType;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

@Slf4j
public class GumballMachineImpl implements GumballMachine {

    private final Map<StateType, State> stateMap;
    private State state;
    private int count;

    public GumballMachineImpl(int numberGumballs) {
        stateMap = new EnumMap<>(StateType.class);
        initStates(stateMap);

        this.count = numberGumballs;
        if (this.count > 0) {
            switchState(StateType.NO_QUARTER);
        } else {
            switchState(StateType.SOLD_OUT);
        }
    }

    private void initStates(Map<StateType, State> stateMap) {
        Arrays.stream(StateType.values()).forEach(type -> stateMap.put(type, StateFactory.createState(type, this)));
    }

    @Override
    public void switchState(StateType newState) {
        state = stateMap.get(newState);
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
