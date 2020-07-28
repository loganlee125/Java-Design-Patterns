package logan.observer.pattern.observer;

@FunctionalInterface
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
