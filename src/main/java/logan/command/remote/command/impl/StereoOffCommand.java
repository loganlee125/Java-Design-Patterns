package logan.command.remote.command.impl;

import logan.command.remote.actuator.Stereo;
import logan.command.remote.command.Command;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
