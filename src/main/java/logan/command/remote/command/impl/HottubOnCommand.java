package logan.command.remote.command.impl;

import logan.command.remote.actuator.Hottub;
import logan.command.remote.command.Command;

public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
