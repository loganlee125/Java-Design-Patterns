package logan.observer.java.observable.observer;

import java.util.Observable;
import java.util.Observer;
import logan.observer.java.observable.WeatherData;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            log.info("Forecast: Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            log.info("Forecast: More of the same");
        } else if (currentPressure < lastPressure) {
            log.info("Forecast: Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

}
