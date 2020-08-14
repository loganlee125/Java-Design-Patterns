package logan.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Screen {
    private String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        log.info("{} going up", description);
    }

    public void down() {
        log.info("{} going down", description);
    }

    public String toString() {
        return description;
    }
}
