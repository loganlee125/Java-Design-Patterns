package logan.observer.java.observable;

import logan.observer.java.observable.observer.CurrentConditionsDisplay;
import logan.observer.java.observable.observer.ForecastDisplay;
import logan.observer.java.observable.observer.HeatIndexDisplay;
import logan.observer.java.observable.observer.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
