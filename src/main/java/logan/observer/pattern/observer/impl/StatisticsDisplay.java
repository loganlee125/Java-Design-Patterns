package logan.observer.pattern.observer.impl;

import logan.observer.pattern.observer.DisplayElement;
import logan.observer.pattern.observer.Observer;
import logan.observer.pattern.subject.Subject;
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
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = {}/{}/{}", avg, max, min);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature < min) {
            this.min = temperature;
        }
        if (temperature > max) {
            this.max = temperature;
        }
        sum += temperature;
        size++;
        this.avg = sum / size;
        display();
    }

}
