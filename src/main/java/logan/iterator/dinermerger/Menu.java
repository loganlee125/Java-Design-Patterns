package logan.iterator.dinermerger;

import logan.iterator.transition.MenuItem;

public interface Menu {

    Iterator<MenuItem> createIterator();

}
