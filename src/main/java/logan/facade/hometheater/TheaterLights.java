package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TheaterLights {
    private String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void dim(int level) {
        log.info("{} dimming to {}%", description, level);
    }

    public String toString() {
        return description;
    }
}
