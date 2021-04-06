package logan.compound.models;

import logan.compound.Quackable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        log.info("Squeak");
    }

}
