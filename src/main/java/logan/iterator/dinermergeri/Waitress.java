package logan.iterator.dinermergeri;

import java.util.Iterator;
import logan.iterator.transition.Menu;
import logan.iterator.transition.MenuItem;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        log.info("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        log.info("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            log.info("{}, {} -- {}", menuItem.getName(), menuItem.getPrice(),
                    menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        log.info("\nVEGETARIAN MENU\n----\nBREAKFAST");
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        log.info("\nLUNCH");
        printVegetarianMenu(dinerMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        return isVegetarian(name, dinerIterator);
    }


    private static void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                log.info("{}\t\t{}\t{}", menuItem.getName(), menuItem.getPrice(),
                        menuItem.getDescription());
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
