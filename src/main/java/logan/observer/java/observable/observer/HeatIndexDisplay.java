package logan.observer.java.observable.observer;

import java.util.Observable;
import java.util.Observer;
import logan.observer.java.observable.WeatherData;
import logan.observer.pattern.observer.DisplayElement;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class HeatIndexDisplay implements Observer, DisplayElement {

    private float heatIndex = 0.0f;
    private Observable observable;

    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float computeHeatIndex(float temperature, float humidity) {
        return (float) ((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity)
                + (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity))
                + (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity))
                + (0.0000102102 * (temperature * temperature * humidity * humidity))
                - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 * (humidity * humidity * humidity))
                + (0.00000142721 * (temperature * temperature * temperature * humidity))
                + (0.000000197483 * (temperature * humidity * humidity * humidity))
                - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity))
                + 0.000000000843296 * (temperature * temperature * humidity * humidity * humidity))
                - (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
    }

    public void display() {
        log.info("Heat index is {}", heatIndex);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
            display();
        }
    }
}
