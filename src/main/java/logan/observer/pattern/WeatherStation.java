package logan.observer.pattern;

import logan.observer.pattern.observer.impl.CurrentConditionsDisplay;
import logan.observer.pattern.observer.impl.ForecastDisplay;
import logan.observer.pattern.observer.impl.HeatIndexDisplay;
import logan.observer.pattern.observer.impl.StatisticsDisplay;
import logan.observer.pattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        var current = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(current);
        var statistics = new StatisticsDisplay(weatherData);
        weatherData.registerObserver(statistics);
        var forecast = new ForecastDisplay(weatherData);
        weatherData.registerObserver(forecast);
        var heat = new HeatIndexDisplay(weatherData);
        weatherData.registerObserver(heat);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
