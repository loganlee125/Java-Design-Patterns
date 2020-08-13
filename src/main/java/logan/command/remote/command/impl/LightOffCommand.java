package logan.command.remote.command.impl;

import logan.command.remote.actuator.Light;
import logan.command.remote.command.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
