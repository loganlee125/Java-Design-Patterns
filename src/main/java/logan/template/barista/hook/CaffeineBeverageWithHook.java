package logan.template.barista.hook;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public final void boilWater() {
        log.info("Boiling water");
    }

    public final void pourInCup() {
        log.info("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
