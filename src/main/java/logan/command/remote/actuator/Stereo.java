package logan.command.remote.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        log.info("{} stereo is on", location);
    }

    public void off() {
        log.info("{} stereo is off", location);
    }

    public void setCD() {
        log.info("{} stereo is set for CD input", location);
    }

    public void setDVD() {
        log.info("{} stereo is set for DVD input", location);
    }

    public void setRadio() {
        log.info("{} stereo is set for Radio", location);
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        log.info("{} Stereo volume set to {}", location, volume);
    }
}
