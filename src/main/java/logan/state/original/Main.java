package logan.state.original;

public class Main {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachineImpl(2);
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();
        machine.insertQuarter();
        machine.turnCrank();
    }
}
