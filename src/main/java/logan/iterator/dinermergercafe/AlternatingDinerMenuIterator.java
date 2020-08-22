package logan.iterator.dinermergercafe;

import java.util.Calendar;
import java.util.Iterator;
import logan.iterator.transition.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    public void remove() {
        throw new UnsupportedOperationException(
                "Alternating Diner Menu Iterator does not support remove()");
    }
}
