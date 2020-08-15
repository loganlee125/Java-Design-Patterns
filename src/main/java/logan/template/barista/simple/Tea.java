package logan.template.barista.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tea extends CaffeineBeverage {

    public void brew() {
        log.info("Steeping the tea");
    }

    public void addCondiments() {
        log.info("Adding Lemon");
    }

}
