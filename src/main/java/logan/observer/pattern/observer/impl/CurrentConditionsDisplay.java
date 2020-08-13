package logan.observer.pattern.observer.impl;

import logan.observer.pattern.observer.DisplayElement;
import logan.observer.pattern.observer.Observer;
import logan.observer.pattern.subject.Subject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        log.info("Current conditions: {}F degrees and {}% humidity", temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
