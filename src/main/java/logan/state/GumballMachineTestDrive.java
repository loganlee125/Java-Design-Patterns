package logan.state;

import logan.state.machine.GumballMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        log.info("{}", gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        log.info("{}", gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        log.info("{}", gumballMachine);
    }

}
