package logan.command.party.actuator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class CeilingFan {
    private String location = "";
    private int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        // turns the ceiling fan on to high
        speed = HIGH;
        log.info("{} ceiling fan is on high", location);
    }

    public void medium() {
        // turns the ceiling fan on to medium
        speed = MEDIUM;
        log.info("{} ceiling fan is on medium", location);
    }

    public void low() {
        // turns the ceiling fan on to low
        speed = LOW;
        log.info("{} ceiling fan is on low", location);
    }

    public void off() {
        // turns the ceiling fan off
        speed = OFF;
        log.info("{} ceiling fan is off", location);
    }
}
