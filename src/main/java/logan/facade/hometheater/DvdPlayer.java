package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DvdPlayer {
    private String description;
    private int currentTrack;
    private Amplifier amplifier;
    private String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
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
        movie = null;
        log.info("{} eject", description);
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        log.info("{} playing \"{}\"", description, movie);
    }

    public void play(int track) {
        if (movie == null) {
            log.info("{} can't play track {}, no dvd inserted", description, currentTrack);
        } else {
            currentTrack = track;
            log.info("{} playing track {} of \"{}\"", description, currentTrack, movie);
        }
    }

    public void stop() {
        currentTrack = 0;
        log.info("{} stopped \"{}\"", description, movie);
    }

    public void pause() {
        log.info("{} paused \"{}\"", description, movie);
    }

    public void setTwoChannelAudio() {
        log.info("{} set two channel audio", description);
    }

    public void setSurroundAudio() {
        log.info("{} set surround audio", description);
    }

    public String toString() {
        return description;
    }
}
