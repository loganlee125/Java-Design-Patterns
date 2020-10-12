package logan.observer.flow.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import logan.observer.flow.TransferData;
import logan.observer.pattern.observer.DisplayElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class HeatIndexDisplay implements Subscriber<TransferData>, DisplayElement {

    private Subscription subscription;
    private float heatIndex = 0.0f;

    private static float computeHeatIndex(float temperature, float humidity) {
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
    public void onSubscribe(Subscription subscription) {
        log.info("onSubscribe");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TransferData weatherData) {
        this.heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
        display();
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("onError", throwable);
    }

    @Override
    public void onComplete() {
        log.info("onComplete");
    }
}
