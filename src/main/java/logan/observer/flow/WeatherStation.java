package logan.observer.flow;

import logan.observer.flow.subscriber.CurrentConditionsDisplay;
import logan.observer.flow.subscriber.ForecastDisplay;
import logan.observer.flow.subscriber.HeatIndexDisplay;
import logan.observer.flow.subscriber.StatisticsDisplay;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        try (WeatherData weatherData = new WeatherData()) {
            weatherData.subscribe(new CurrentConditionsDisplay());
            weatherData.subscribe(new StatisticsDisplay());
            weatherData.subscribe(new ForecastDisplay());
            weatherData.subscribe(new HeatIndexDisplay());

            weatherData.setMeasurements(80, 65, 30.4F);
            weatherData.setMeasurements(82, 70, 29.2F);
            weatherData.setMeasurements(78, 90, 29.2F);
        }
        log.info("done");
    }
}
