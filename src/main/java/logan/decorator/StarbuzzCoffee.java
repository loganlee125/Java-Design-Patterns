package logan.decorator;

import logan.decorator.coffee.DarkRoast;
import logan.decorator.coffee.Espresso;
import logan.decorator.coffee.HouseBlend;
import logan.decorator.condiment.Mocha;
import logan.decorator.condiment.Soy;
import logan.decorator.condiment.Whip;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        log.info("{} ${}", beverage.getDescription(), beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info("{} ${}", beverage2.getDescription(), beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.info("{} ${}", beverage3.getDescription(), beverage3.cost());
    }
}
