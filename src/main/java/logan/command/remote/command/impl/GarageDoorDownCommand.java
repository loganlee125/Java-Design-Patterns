package logan.command.remote.command.impl;

import logan.command.remote.actuator.GarageDoor;
import logan.command.remote.command.Command;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
