package logan.command.undo.command.impl;

import logan.command.undo.actuator.Light;
import logan.command.undo.command.Command;

public class DimmerLightOffCommand implements Command {
    private Light light;
    private int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(prevLevel);
    }
}
