package logan.iterator.dinermerger;

import logan.iterator.transition.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }
}
