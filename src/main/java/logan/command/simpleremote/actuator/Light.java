package logan.command.simpleremote.actuator;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Light {

    public void on() {
        log.info("Light is on");
    }

    public void off() {
        log.info("Light is off");
    }
}
