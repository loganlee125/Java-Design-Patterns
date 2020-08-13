package logan.command.party.command.impl;

import logan.command.party.actuator.Light;
import logan.command.party.command.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
