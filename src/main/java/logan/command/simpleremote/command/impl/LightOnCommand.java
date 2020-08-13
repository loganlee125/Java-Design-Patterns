package logan.command.simpleremote.command.impl;

import logan.command.simpleremote.actuator.Light;
import logan.command.simpleremote.command.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
