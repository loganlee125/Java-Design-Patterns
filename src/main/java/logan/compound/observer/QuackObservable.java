package logan.compound.observer;

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();

}
