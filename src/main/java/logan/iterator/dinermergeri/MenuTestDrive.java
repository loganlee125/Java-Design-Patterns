package logan.iterator.dinermergeri;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MenuTestDrive {

    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();

        log.info("Customer asks, is the Hotdog vegetarian?");
        log.info("Waitress says: ");
        if (waitress.isItemVegetarian("Hotdog")) {
            log.info("Yes");
        } else {
            log.info("No");
        }
        log.info("Customer asks, are the Waffles vegetarian?");
        log.info("Waitress says: ");
        if (waitress.isItemVegetarian("Waffles")) {
            log.info("Yes");
        } else {
            log.info("No");
        }
    }

}
