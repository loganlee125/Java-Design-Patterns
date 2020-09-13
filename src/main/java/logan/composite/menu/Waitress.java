package logan.composite.menu;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Waitress {
    private final MenuComponent allMenus;

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        log.info("VEGETARIAN MENU");
        log.info("---------------------");
        for (MenuComponent menuComponent : allMenus) {
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }

        }
    }
}
