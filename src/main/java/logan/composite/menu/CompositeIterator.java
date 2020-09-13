package logan.composite.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        var iterator = stack.peek();
        if (iterator.hasNext()) {
            return true;
        } else {
            stack.pop();
            return hasNext();
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            var iterator = stack.peek();
            var menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.iterator());
            }
            return menuComponent;
        }
        return null;
    }
}
