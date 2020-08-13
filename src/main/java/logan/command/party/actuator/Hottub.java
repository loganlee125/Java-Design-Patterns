package logan.command.party.actuator;

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

    public void circulate() {
        if (on) {
            log.info("Hottub is bubbling!");
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
        if (temperature > this.temperature) {
            log.info("Hottub is heating to a steaming {} degrees", temperature);
        } else {
            log.info("Hottub is cooling to {} degrees", temperature);
        }
        this.temperature = temperature;
    }
}
