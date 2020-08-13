package logan.command.party.command.impl;

import logan.command.party.actuator.Light;
import logan.command.party.command.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
