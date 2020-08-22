package logan.iterator.dinermerger;

import java.util.List;
import logan.iterator.transition.MenuItem;

public class ArrayListIterator implements Iterator<MenuItem> {
    private List<MenuItem> items;
    private int position;

    public ArrayListIterator(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem object = items.get(position);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        return position < items.size();
    }
}
