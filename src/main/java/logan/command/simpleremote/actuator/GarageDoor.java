package logan.command.simpleremote.actuator;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class GarageDoor {

    public void up() {
        log.info("Garage Door is Open");
    }

    public void down() {
        log.info("Garage Door is Closed");
    }

    public void stop() {
        log.info("Garage Door is Stopped");
    }

    public void lightOn() {
        log.info("Garage light is on");
    }

    public void lightOff() {
        log.info("Garage light is off");
    }
}
