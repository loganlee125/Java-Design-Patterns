package logan.template.barista.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        log.info("Boiling water");
    }

    public void pourInCup() {
        log.info("Pouring into cup");
    }
}
