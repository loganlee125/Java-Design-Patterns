package logan.command.simpleremote.command.impl;

import logan.command.simpleremote.actuator.Light;
import logan.command.simpleremote.command.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
