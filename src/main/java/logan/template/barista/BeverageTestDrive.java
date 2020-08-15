package logan.template.barista;

import logan.template.barista.hook.CaffeineBeverageWithHook;
import logan.template.barista.hook.CoffeeWithHook;
import logan.template.barista.hook.TeaWithHook;
import logan.template.barista.simple.CaffeineBeverage;
import logan.template.barista.simple.Coffee;
import logan.template.barista.simple.Tea;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeverageTestDrive {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        log.info("Making tea...");
        tea.prepareRecipe();

        log.info("Making coffee...");
        coffee.prepareRecipe();


        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

        log.info("Making tea...");
        teaHook.prepareRecipe();

        log.info("Making coffee...");
        coffeeHook.prepareRecipe();
    }

}
