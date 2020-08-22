package logan.iterator.dinermerger;

import java.util.List;
import logan.iterator.transition.MenuItem;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MenuTestDrive {
    public static void main(String args[]) {
        printMenu();

        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }

    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            log.info("{}", menuItem);
        }

        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            log.info("{}", menuItem);
        }
    }
}
