package logan.command.undo.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Light {
    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        log.info("{} Light is on", location);
    }

    public void off() {
        level = 0;
        log.info("{} Light is off", location);
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            log.info("{} Light is dimmed to {}%", location, level);
        }
    }
}
