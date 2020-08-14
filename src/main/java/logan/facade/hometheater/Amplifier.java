package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Amplifier {
    private String description;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void setStereoSound() {
        log.info("{} stereo mode on", description);
    }

    public void setSurroundSound() {
        log.info("{} surround sound on (5 speakers, 1 subwoofer)", description);
    }

    public void setVolume(int level) {
        log.info("{} setting volume to {}", description, level);
    }

    public void setTuner(Tuner tuner) {
        log.info("{} setting tuner to {}", description, tuner);
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        log.info("{} setting DVD player to {}", description, dvd);
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        log.info("{} setting CD player to {}", description, cd);
        this.cd = cd;
    }

    public String toString() {
        return description;
    }
}
