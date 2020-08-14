package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tuner {
    private String description;
    private Amplifier amplifier;
    private double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void setFrequency(double frequency) {
        log.info("{} setting frequency to {}", description, frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        log.info("{} setting AM mode", description);
    }

    public void setFm() {
        log.info("{} setting FM mode", description);
    }

    public String toString() {
        return description;
    }
}
