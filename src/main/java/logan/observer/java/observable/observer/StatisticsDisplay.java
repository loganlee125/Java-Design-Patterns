package logan.observer.java.observable.observer;

import java.util.Observable;
import java.util.Observer;
import logan.observer.java.observable.WeatherData;
import logan.observer.pattern.observer.DisplayElement;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private float min = 1000;
    private float max;
    private float avg;
    private float sum;
    private int size;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = {}/{}/{}", avg, max, min);
    }

    public void update(float temperature) {
        if (temperature < min) {
            this.min = temperature;
        }
        if (temperature > max) {
            this.max = temperature;
        }
        sum += temperature;
        size++;
        this.avg = sum / size;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            update(weatherData.getTemperature());
            display();
        }
    }
}
