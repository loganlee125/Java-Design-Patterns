package logan.observer.original;

public class WeatherData {

    private Display currentConditionsDisplay;
    private Display statisticsDisplay;
    private Display forecastDisplay;

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    private float getPressure() {
        // TODO Auto-generated method stub
        return 0;
    }

    private float getHumidity() {
        // TODO Auto-generated method stub
        return 0;
    }

    private float getTemperature() {
        // TODO Auto-generated method stub
        return 0;
    }

}
