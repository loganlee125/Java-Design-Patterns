package logan.template.barista.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Coffee extends CaffeineBeverage {

    public void brew() {
        log.info("Dripping Coffee through filter");
    }

    public void addCondiments() {
        log.info("Adding Sugar and Milk");
    }

}
