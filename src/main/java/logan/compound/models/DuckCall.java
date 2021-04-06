package logan.compound.models;

import logan.compound.Quackable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        log.info("Kwak");
    }

}
