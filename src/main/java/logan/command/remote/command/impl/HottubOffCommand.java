package logan.command.remote.command.impl;

import logan.command.remote.actuator.Hottub;
import logan.command.remote.command.Command;

public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
