package logan.command.party.command.impl;

import logan.command.party.actuator.TV;
import logan.command.party.command.Command;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
