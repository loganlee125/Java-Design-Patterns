package logan.iterator.dinermerger;

import java.util.Calendar;
import logan.iterator.transition.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private MenuItem[] list;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        return !(position >= list.length || list[position] == null);
    }

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
