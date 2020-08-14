package logan.adapter.ducks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WildTurkey implements Turkey {

    public void gobble() {
        log.info("Gobble gobble");
    }

    public void fly() {
        log.info("I'm flying a short distance");
    }

}
