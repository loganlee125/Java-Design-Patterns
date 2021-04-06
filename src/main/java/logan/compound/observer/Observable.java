package logan.compound.observer;

import java.util.LinkedList;
import java.util.List;

public class Observable implements QuackObservable {

    private List<Observer> observers = new LinkedList<>();
    private QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(quackObservable));
    }

}
