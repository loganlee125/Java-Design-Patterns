package logan.command.simpleremote.command.impl;

import logan.command.simpleremote.actuator.GarageDoor;
import logan.command.simpleremote.command.Command;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
