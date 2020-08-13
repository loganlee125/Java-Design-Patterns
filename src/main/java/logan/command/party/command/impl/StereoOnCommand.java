package logan.command.party.command.impl;

import logan.command.party.actuator.Stereo;
import logan.command.party.command.Command;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
