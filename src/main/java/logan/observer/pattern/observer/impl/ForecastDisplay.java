package logan.observer.pattern.observer.impl;

import logan.observer.pattern.observer.DisplayElement;
import logan.observer.pattern.observer.Observer;
import logan.observer.pattern.subject.Subject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.currentPressure = 29.92F;
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            log.info("Forecast: Improving weather on the way!");
        } else if (Float.compare(currentPressure, lastPressure) == 0) {
            log.info("Forecast: More of the same");
        } else {
            log.info("Forecast: Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

}
