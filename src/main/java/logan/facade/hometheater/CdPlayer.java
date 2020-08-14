package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CdPlayer {
    private String description;
    private int currentTrack;
    private Amplifier amplifier;
    private String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void eject() {
        title = null;
        log.info("{} eject", description);
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        log.info("{} playing \"{}\"", description, title);
    }

    public void play(int track) {
        if (title == null) {
            log.info("{} can't play track {}, no cd inserted", description, currentTrack);
        } else {
            currentTrack = track;
            log.info("{} playing track {}", description, currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        log.info("{} stopped", description);
    }

    public void pause() {
        log.info("{} paused \"{}\"", description, title);
    }

    public String toString() {
        return description;
    }
}
