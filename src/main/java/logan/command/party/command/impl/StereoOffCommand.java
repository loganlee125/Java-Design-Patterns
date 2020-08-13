package logan.command.party.command.impl;

import logan.command.party.actuator.Stereo;
import logan.command.party.command.Command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
