package logan.observer.pattern.subject;

import logan.observer.pattern.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
