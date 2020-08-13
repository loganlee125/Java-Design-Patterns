package logan.command.remote.command.impl;

import logan.command.remote.actuator.CeilingFan;
import logan.command.remote.command.Command;

public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
