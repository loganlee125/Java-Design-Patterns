package logan.command.remote.command.impl;

import logan.command.remote.actuator.CeilingFan;
import logan.command.remote.command.Command;

public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }
}
