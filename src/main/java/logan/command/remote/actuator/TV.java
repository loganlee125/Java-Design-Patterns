package logan.command.remote.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class TV {
    private String location;
    private int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        log.info("{} TV is on", location);
    }

    public void off() {
        log.info("{} TV is off", location);
    }

    public void setInputChannel() {
        this.channel = 3;
        log.info("{} Channel is set for DVD", location);
    }
}
