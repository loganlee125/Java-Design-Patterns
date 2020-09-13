package logan.composite.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

@Slf4j
@Getter
@AllArgsConstructor
public class MenuItem implements MenuComponent {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public void print() {
        log.info("  {}{}, {}", name, vegetarian ? " (v)" : "", price);
        log.info("\t -- {}", description);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new NullIterator();
    }
}
