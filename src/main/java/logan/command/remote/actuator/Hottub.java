package logan.command.remote.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Hottub {
    private boolean on;
    private int temperature;

    public Hottub() {}

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            log.info("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            log.info("Hottub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            log.info("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            log.info("Hottub jets are off");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 105;
        log.info("Hottub is heating to a steaming 105 degrees");
    }

    public void cool() {
        temperature = 98;
        log.info("Hottub is cooling to 98 degrees");
    }

}
