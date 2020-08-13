package logan.command.undo.command.impl;

import logan.command.undo.actuator.Light;
import logan.command.undo.command.Command;

public class DimmerLightOnCommand implements Command {
    private Light light;
    private int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    public void undo() {
        light.dim(prevLevel);
    }
}
