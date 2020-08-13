package logan.command.remote.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        log.info("{} garage Door is Up", location);
    }

    public void down() {
        log.info("{} garage Door is Down", location);
    }

    public void stop() {
        log.info("{} garage Door is Stopped", location);
    }

    public void lightOn() {
        log.info("{} garage light is on", location);
    }

    public void lightOff() {
        log.info("{} garage light is off", location);
    }
}
