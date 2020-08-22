package logan.iterator.dinermergercafe;

import java.util.Iterator;
import logan.iterator.transition.Menu;
import logan.iterator.transition.MenuItem;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        log.info("MENU");
        log.info("BREAKFAST");
        printMenu(pancakeHouseMenu.createIterator());
        log.info("LUNCH");
        printMenu(dinerMenu.createIterator());
        log.info("DINNER");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            log.info("{}", menuItem);
        }
    }

    public void printVegetarianMenu() {
        log.info("VEGETARIAN MENU");
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
        printVegetarianMenu(cafeMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        if (isVegetarian(name, pancakeHouseMenu.createIterator())) {
            return true;
        }
        if (isVegetarian(name, dinerMenu.createIterator())) {
            return true;
        }
        if (isVegetarian(name, cafeMenu.createIterator())) {
            return true;
        }
        return false;
    }


    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                log.info("{}", menuItem);
            }
        }
    }

    private static boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.getName().equals(name) && menuItem.isVegetarian()) {
                return true;
            }
        }
        return false;
    }
}
