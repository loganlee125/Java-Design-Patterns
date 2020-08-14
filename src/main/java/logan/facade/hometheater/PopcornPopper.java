package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PopcornPopper {
    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        log.info("{} on", description);
    }

    public void off() {
        log.info("{} off", description);
    }

    public void pop() {
        log.info("{} popping popcorn!", description);
    }

    public String toString() {
        return description;
    }
}
