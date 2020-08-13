package logan.command.remote.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Light {
    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        log.info("{} light is on", location);
    }

    public void off() {
        log.info("{} light is off", location);
    }
}
