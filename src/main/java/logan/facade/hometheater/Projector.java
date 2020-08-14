package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Projector {
    private String description;
    private DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void wideScreenMode() {
        log.info("{} in widescreen mode (16x9 aspect ratio)", description);
    }

    public void tvMode() {
        log.info("{} in tv mode (4x3 aspect ratio)", description);
    }

    public String toString() {
        return description;
    }
}
