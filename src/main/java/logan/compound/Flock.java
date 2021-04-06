package logan.compound;

import java.util.LinkedList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> quackers = new LinkedList<>();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        quackers.forEach(Quackable::quack);
    }

}
