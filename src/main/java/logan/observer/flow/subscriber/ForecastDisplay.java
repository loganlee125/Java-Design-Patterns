package logan.observer.flow.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import logan.observer.flow.TransferData;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class ForecastDisplay implements Subscriber<TransferData>, DisplayElement {

    private Subscription subscription;
    private float currentPressure = 29.92f;
    private float lastPressure;

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
    public void onSubscribe(Subscription subscription) {
        log.info("onSubscribe");
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TransferData weatherData) {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
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
